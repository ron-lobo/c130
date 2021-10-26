package org.ron.c130.spring.example2;

public class MyMagicService implements MagicService {

    private final DbDep dbDep;

    public MyMagicService(DbDep dbDep) {
        this.dbDep = dbDep;
    }

    @Override
    public int getNewNumber() {
        int i = dbDep.getMagicValfromDB();
        return i + 1;
    }
}
