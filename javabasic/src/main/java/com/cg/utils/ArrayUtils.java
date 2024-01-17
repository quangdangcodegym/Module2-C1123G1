package com.cg.utils;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = {5, -1, 8, 3, 6};               // 0x32cc: {5, -1, 8, 3, 6}

        // arr: 0x32cc
        interchangeSort(arr);
        printArray(arr);

    }
    public static void printArray(int [] numbers){
        for (int value : numbers) {
            System.out.println(value);
        }
    }

    public static void interchangeSort(int [] numbers){     // numbers: 0x32cc
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
