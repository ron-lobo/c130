package org.ron.c130.spring.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(MyMagicService.class)
@ComponentScan
public class MagicNumberServer {

    private final MagicHelper magicHelper;

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(MagicNumberServer.class);

        MagicNumberServer magicNumberServer = appContext.getBean(MagicNumberServer.class);
        int i = magicNumberServer.getMagicNumber();
        System.out.println("your magic number is " + i);
    }

    public MagicNumberServer(MagicHelper magicHelper) {
        this.magicHelper = magicHelper;
    }

    public int getMagicNumber() {
        return magicHelper.createMagicNumber();
    }

//    @Bean
//    public static MagicHelper getMagicHelper(MagicService magicService) {
//        return new MyMagicHelper(magicService);
//    }
}
