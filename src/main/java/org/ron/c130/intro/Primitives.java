package org.ron.c130.intro;

public class Primitives {

    public static void main(String[] args) {

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
