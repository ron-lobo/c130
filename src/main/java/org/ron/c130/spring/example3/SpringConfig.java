package org.ron.c130.spring.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        MagicNumberServer magicNumberServer = appContext.getBean(MagicNumberServer.class);
        int i = magicNumberServer.getMagicNumber();
        System.out.println("your magic number is " + i);
    }

//    @Bean
//    public MagicNumberServer getMagicNumberServer(MagicHelper magicHelper) {
//        return new MagicNumberServer(magicHelper);
//    }
//
//    @Bean
//    public MagicHelper getMagicHelper(MagicService magicService) {
//        return new MyMagicHelper(magicService);
//    }
//
//    @Bean
//    public MagicService getMagicService(DbDep dbDep) {
//        return new MyMagicService(dbDep);
//    }
//
//    @Bean
//    public DbDep getDbDep() {
//        return new MyDbDep();
//    }
}
