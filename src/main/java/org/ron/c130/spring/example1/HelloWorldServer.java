package org.ron.c130.spring.example1;

public class HelloWorldServer {

    private final HWHelper hwHelper = new HWHelper();

    public static void main(String[] args) {
        HelloWorldServer helloWorldServer = new HelloWorldServer();
        helloWorldServer.sayHello();
    }

    public String sayHello() {
        return hwHelper.sayHi();
    }
}
