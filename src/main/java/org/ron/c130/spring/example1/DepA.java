package org.ron.c130.spring.example1;

import java.util.List;
import java.util.Random;

public class DepA {

    private List<String> audiences = List.of("World", "m3", "c130");

    public String getAudience() {
        Random random = new Random();
        int i = random.nextInt(audiences.size());
        return audiences.get(i);
    }
}
