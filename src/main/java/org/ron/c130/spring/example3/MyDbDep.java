package org.ron.c130.spring.example3;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
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
