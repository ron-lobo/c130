package org.ron.c130.spring.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MyMagicServiceTest {

    @Mock
    private DbDep dbDep;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getNewNumber() {
        when(dbDep.getMagicValfromDB()).thenReturn(130).thenReturn(-10).thenReturn(999)
                .thenThrow(new RuntimeException("too may requests"));

        when(dbDep.getMagicString(anyInt(), anyString())).thenReturn(false);

        MyMagicService myMagicService = new MyMagicService(dbDep);
        int i = myMagicService.getNewNumber();
        assertEquals(131, i);
        verify(dbDep).getMagicValfromDB();

        assertEquals(-9, myMagicService.getNewNumber());
        assertEquals(1000, myMagicService.getNewNumber());

        verify(dbDep, times(3)).getMagicValfromDB();
    }

//    private class TestDbDep implements DbDep {
//        @Override
//        public int getMagicValfromDB() {
//            return 130;
//        }
//    }
}