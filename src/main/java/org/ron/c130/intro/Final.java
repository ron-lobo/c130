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
        System.out.println();
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

        sb0.append(' ').append(true).append(' ').append(3.141);

        System.out.println("sb0=" + sb0);
        System.out.println("sb1=" + sb1);
        System.out.println();

        addSomething(sb0, "test0");
        addSomething(sb1, "test1");

        System.out.println("sb0=" + sb0);
        System.out.println("sb1=" + sb1);
        System.out.println();

    /*
            [[sb0]]      --->    "xyz"

                             0xFE83CB98
            sb1      --->    "abc 321 321 true 3.141"      <---   sb0
     */
    }

    private void addSomething(StringBuilder sb, String text) {
        sb.append(' ').append(text);
    }



    public static void main(String[] args) {
        Final q = new Final();
        q.method1();
        q.method2();
    }
}
