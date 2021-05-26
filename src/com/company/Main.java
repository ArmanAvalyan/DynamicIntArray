package com.company;

public class Main {

    public static void main(String[] args) {
        DynamicIntArray dynamicIntArray = new DynamicIntArray();
        for (int i = 0; i < 15; i++) {
            int random = (int) (Math.random() * 36);
            dynamicIntArray.add(random);
        }
        System.out.println(dynamicIntArray);

        dynamicIntArray.remove(6);
        System.out.println(dynamicIntArray);

        System.out.println(dynamicIntArray.contains(16));

        dynamicIntArray.update(3,14789);
        System.out.println(dynamicIntArray);

        dynamicIntArray.swap(0,5);
        System.out.println(dynamicIntArray);

        dynamicIntArray.sort("asc");
        System.out.println(dynamicIntArray);

        dynamicIntArray.sort("desc");
        System.out.println(dynamicIntArray);
    }
}
