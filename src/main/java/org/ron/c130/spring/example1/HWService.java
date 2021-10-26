package org.ron.c130.spring.example1;

public class HWService {

    private final DepA depA = new DepA();

    public String makeGreeting(String prefix) {
        String text = prefix + " " + depA.getAudience();
        System.out.println(text);
        return text;
    }
}
