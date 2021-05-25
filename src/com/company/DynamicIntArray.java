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

    public void update(int index, int value) {
        if (index > array.length - 1) {
            System.out.println("There is no such index");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index)
                array[i] = value;
        }
    }

    public void swap(int firstIndex, int secondIndex) {
        if (firstIndex > array.length - 1 || secondIndex > array.length - 1) {
            System.out.println("There is no such index");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int temp1 = array[firstIndex];
            int temp2 = array[secondIndex];
            array[firstIndex] = temp2;
            array[secondIndex] = temp1;
        }
    }

    public void sort(String text) {
        if (text.equalsIgnoreCase("asc"))
            sortAsc();
        else if (text.equalsIgnoreCase("desc"))
            sortDesc();
    }

    private void sortAsc() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private void sortDesc() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
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
