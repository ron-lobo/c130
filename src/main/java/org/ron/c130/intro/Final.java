package org.ron.c130.intro;

public class Final {

    private final int i = 1;
    private int j = 2;

    private String s0 = "123";
    private final String s1 = "321";

    private StringBuilder sb0 = new StringBuilder("xyz");
    private final StringBuilder sb1 = new StringBuilder("abc");

    public void method0() {
//        i = j;
//        i++;
        j++;
    }

    public void method1() {
        // String is immutable
        System.out.println("s0=" + s0);
        System.out.println("s1=" + s1);
        System.out.println();

        s0 = s1;
//        s1 = s0;

        s0 = "456";
//        s1 = "987";

        System.out.println("s0=" + s0);
        System.out.println("s1=" + s1);
    }

    public void method2() {
        // StringBuilder is mutable
        System.out.println("sb0=" + sb0);
        System.out.println("sb1=" + sb1);
        System.out.println();

        sb0 = sb1;
        // sb1 = sb0;

        sb1.append(' ');
        sb1.append(321);
        sb1.append(' ').append(321);

        sb0.append(' ').append(true).append(3.141);

        System.out.println("sb0=" + sb0);
        System.out.println("sb1=" + sb1);

    /*
            [[sb0]]      --->    "xyz"

            sb1      --->    "abc 321 321"      <---   sb0
     */
    }



    public static void main(String[] args) {
        Final q = new Final();
        q.method1();
        //q.method2();
    }
}
