package com.company;

import java.util.Arrays;

public class DynamicIntArray {

    private int length = 0;
    private int[] array = new int[length];

    public void add(int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[i];
        }
        newArray[newArray.length - 1] = number;
        setArray(newArray);
    }

    public boolean contains(int number) {
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public int length() {
        return array.length;
    }

    public void sort(String text) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (text.equalsIgnoreCase("asc")) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                } else if (text.equalsIgnoreCase("desc")) {
                    if (array[j - 1] < array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
