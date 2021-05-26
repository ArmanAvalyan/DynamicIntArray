package com.company;

import java.util.Arrays;

public class DynamicIntArray {

    private int length = 0;
    private int[] array = new int[length];

    public void add(int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = number;
        setArray(newArray);
    }

    public void remove(int index) {
        if (!checkIndex(index)) {
            System.out.println("There is no such index");
            return;
        }
        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                continue;
            }
            newArray[newIndex] = array[i];
            newIndex++;
        }
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
        if (!checkIndex(index)) {
            System.out.println("There is no such index");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index)
                array[i] = value;
        }
    }

    private boolean checkIndex(int index) {
        boolean checkIndex = true;
        if (index > array.length - 1)
            checkIndex = false;
        return checkIndex;
    }

    public void swap(int firstIndex, int secondIndex) {
        if (!checkIndex(firstIndex) || !checkIndex(secondIndex)) {
            System.out.println("There is no such index");
            return;
        }
        int temp1 = array[firstIndex];
        int temp2 = array[secondIndex];
        array[firstIndex] = temp2;
        array[secondIndex] = temp1;
    }

    public void sort(String text) {
        if (text.equalsIgnoreCase("asc"))
            sortAsc();
        else if (text.equalsIgnoreCase("desc"))
            sortDesc();
    }

    private void sortAsc() {
        int temp;
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
        int temp;
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
