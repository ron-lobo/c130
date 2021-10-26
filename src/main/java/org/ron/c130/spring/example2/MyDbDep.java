package org.ron.c130.spring.example2;

import java.util.Random;

public class MyDbDep implements DbDep {

    @Override
    public int getMagicValfromDB() {
        Random random = new Random();
        return random.nextInt();
    }

    @Override
    public boolean getMagicString(int i, String t) {
        return false;
    }
}
