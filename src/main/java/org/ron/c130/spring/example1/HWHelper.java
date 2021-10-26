package org.ron.c130.spring.example1;

public class HWHelper {

    private final HWService hwService = new HWService();

    public String sayHi() {
        return hwService.makeGreeting("Hi");
    }
}
