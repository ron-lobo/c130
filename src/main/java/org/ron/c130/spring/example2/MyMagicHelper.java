package org.ron.c130.spring.example2;

public class MyMagicHelper implements MagicHelper {

    private final MagicService magicService;

    public MyMagicHelper(MagicService magicService) {
        this.magicService = magicService;
    }

    @Override
    public int createMagicNumber() {
        return magicService.getNewNumber();
    }
}
