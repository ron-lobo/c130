package org.ron.c130.spring.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyMagicService implements MagicService {

    //    @Autowired
    private DbDep dbDep;

//    @Autowired
//    public MyMagicService(DbDep dbDep) {
//        this.dbDep = dbDep;
//    }

    @Autowired
    public void setDbDep(DbDep dbDep) {
        this.dbDep = dbDep;
    }

    @Override
    public int getNewNumber() {
        int i = dbDep.getMagicValfromDB();
        return i + 1;
    }
}
