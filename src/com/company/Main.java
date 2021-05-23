package com.company;


public class Main {

    public static void main(String[] args) {
        DynamicIntArray dynamicIntArray = new DynamicIntArray();
        for (int i = 0; i < 15; i++) {
            int random = (int) (Math.random() * 36);
            dynamicIntArray.add(random);
        }

        dynamicIntArray.sort("asc");
        System.out.println(dynamicIntArray);
        dynamicIntArray.sort("desc");
        System.out.println(dynamicIntArray);
    }
}