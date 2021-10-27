package org.ron.c130.spring.example3;

import org.springframework.stereotype.Component;

@Component
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
