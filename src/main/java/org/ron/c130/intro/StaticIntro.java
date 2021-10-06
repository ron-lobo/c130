package org.ron.c130.intro;

//import static java.lang.System.*;

public class StaticIntro {

    public static final String GROUP_NAME = "m3-c130";
    public static final int X = 999;

    private static StaticHelper staticHelper2 = new StaticHelper(2);
    private static StaticHelper staticHelper3;
    private static StaticHelper staticHelper1 = new StaticHelper(1);
    private static int nextIvalue;

    private final int i;

    static {
        System.out.println("executing static block");
        nextIvalue = -1;
        staticHelper3 = new StaticHelper(3);
        System.out.println("executed static block");
//        err.println();
    }

    private StaticIntro(int i) {
        this.i = i;
        System.out.println("creating StaticIntro: i= " + i);
    }

    private StaticIntro() {
        this.i = nextIvalue++;
    }

    public static StaticIntro getInstance() {
        if (nextIvalue < 10) {
            return new StaticIntro(nextIvalue++);
        } else {
            throw new RuntimeException("too many instances");
        }
    }

    public void sayHelloInstance(String suffix) {
        System.out.println("Instance hello " + i + " " + suffix);
    }

    public static void sayHelloStatic(String suffix) {
        System.out.println("Static hello " + suffix);
    }

    public static void main(String[] args) {
        System.out.println("Static intro");
        StaticIntro.sayHelloStatic("C130");
//        Static.sayHelloInstance("C130");

        StaticIntro s0 = new StaticIntro(999);
        StaticIntro s1 = getInstance();
        StaticIntro s2 = getInstance();
        s1.sayHelloInstance("c130");
        s2.sayHelloInstance("c130");
    }
}
