package org.ron.c130.intro;

public class Primitives {

    public static void main(String[] args) {
        method0();
        method1();
    }

    public static void method0() {

        byte p1 = 0;            // -128 .. 127          1 byte = 8 bits
        short p2 = 32767;       // -32768 .. 32767      2 bytes = 16 bits
        int p3 = 999;           // -2.1B .. 2.1B        4 bytes = 32 bits
        long p4 = 12345L;       //                      8 bytes = 64 bits

        float p5 = 1.234F;      // 32 bits
        double p6 = 1.2334;     // 64 bits

        char p7 = 'x';          // unicode
        boolean p8 = true;      // 1 bit

        // wrappers
        Byte w1 = p1;
        Integer w3 = p3;
        Double w6 = p6;
        Character w7 = p7;
    }

    public static void method1() {
        int i = 1, j = 99, k = 123;

        Integer i1 = i;
        Integer i2 = 888;
        // Integer i3 = new Integer(123);
        Integer i3 = 123;

        // i = i3.intValue();
        i = i3;

        int x = plus(i, j);
        Integer x1 = plus(i1, i2);

        i = 5;
        i3 = 42;
        System.out.println("i=" + i + ", i3=" + i3);
        Integer x2 = plus(i, i3);
        System.out.println("i=" + i + ", i3=" + i3);
        System.out.println("x2=" + x2);

    }

    private static int plus(int i, Integer j) {
        i++;
        j++; // j = j + 1
        return i + j;
    }
}
