package org.ron.c130.intro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void size() {
        MyArrayList myArrayList = new MyArrayList();
        assertEquals(0, myArrayList.size());
        myArrayList.add("123");
        myArrayList.add("123");
        myArrayList.add("123");
        assertEquals(3, myArrayList.size());
    }

    @Test
    void isEmpty1() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    void isEmpty2() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("123");
        assertFalse(myArrayList.isEmpty());
        myArrayList.remove("123");
        assertTrue(myArrayList.isEmpty());
    }

    @Disabled
    @Test
    void add() {
    }

    void doSomething() {
    }
}