package org.ron.c130.spring.example1;

import org.junit.jupiter.api.Test;

class HWServiceTest {

    @Test
    void makeGreeting() {
        HWService hwService = new HWService();
        String text = "howdy";
        String result = hwService.makeGreeting(text);

        assert (result.startsWith(text));
        assert (result.contains(" "));
    }
}
