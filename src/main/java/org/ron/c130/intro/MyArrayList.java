package org.ron.c130.intro;

public class MyArrayList {

    public static final int DEFAULT_SIZE = 10;

    private Object[] list = new Object[DEFAULT_SIZE];
    private int pos = 0;
    private int max = DEFAULT_SIZE;

    public MyArrayList() {

    }

    public int size() {
        return pos;
    }

    public boolean isEmpty() {
        return pos == 0;
    }

    public void add(Object obj) {
        if (pos == max) {
            max *= 2;
            Object[] newlist = new Object[max];
            for (int i = 0; i < list.length; i++) {
                newlist[i] = list[i];
            }
            list = newlist;
        }

        list[pos] = obj;
        pos++;
    }

    public void add(Object obj, int index) {
        // shift elements
        list[index] = obj;
    }

    public Object remove(Object obj) {
        return null;
    }

    public Object remove(int index) {
        Object itemToReturn = list[index];
        // shift element
        return itemToReturn;
    }
}