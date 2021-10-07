package org.ron.c130.intro;

import org.apache.commons.collections4.list.TreeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsIntro {

    public static void main(String[] args) {
        CollectionsIntro ci = new CollectionsIntro();
        ci.arrays();
        ci.lists();
    }

    private void arrays() {
        System.out.println("\nArrays()");
        int[] numbers = new int[]{9, 8, 7, 1, 2};
        System.out.println("length of numbers: " + numbers.length);

        String[] strings = new String[]{"one", "two", "three"};
        strings[1] = null;
        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings[" + i + "] = " + strings[i]);
        }
        for (String str : strings) {
            System.out.println("str = " + str);
        }
    }

    private void lists() {
        System.out.println("\nLists()");

        List<String> strings1 = new LinkedList<>();
        List<String> strings2 = new ArrayList<>();
        List<String> strings3 = new TreeList<>();
        strings1.add("zero");
        strings1.add(null);
        strings1.add("zero");
        manipulateList("LinkedList", strings1);
        manipulateList("ArrayList", strings2);
        manipulateList("apache commons TreeList", strings3);

        ((ArrayList<String>) strings2).trimToSize();
    }

    private void manipulateList(String text, List<String> strings) {
        System.out.println("\nabout to manipulate list " + text);
        if (strings.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        System.out.println(strings.isEmpty() ? "List is empty" : "List is not empty");

        strings.add("one");
        strings.add("two");
        strings.add("three");
        System.out.println("length of strings: " + strings.size());
        for (String str : strings) {
            System.out.println("str = " + str);
        }
        strings.remove("two");
        System.out.println("length of strings: " + strings.size());
        strings.add("four");
        strings.add("five");
        strings.add("zero");
        System.out.println("length of strings: " + strings.size());
    }


}

/**
 * LL -> c0[obj, ref->c2] c2[obj3, ref->c1] c1[obj2, ref->null]
 * <p>
 * LL -> c1 -> c2 -> c0
 */