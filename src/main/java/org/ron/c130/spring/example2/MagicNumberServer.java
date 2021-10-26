package org.ron.c130.spring.example2;

public class MagicNumberServer {

    private final MagicHelper magicHelper;

    public static void main(String[] args) {
        DbDep dbDep = new MyDbDep();
        MagicService magicService = new MyMagicService(dbDep);
        MagicHelper helper = new MyMagicHelper(magicService);
        MagicNumberServer magicNumberServer = new MagicNumberServer(helper);
        int i = magicNumberServer.getMagicNumber();
        System.out.println("your magic number is " + i);
    }

    public MagicNumberServer(MagicHelper magicHelper) {
        this.magicHelper = magicHelper;
    }

    public int getMagicNumber() {
        return magicHelper.createMagicNumber();
    }
}
