package com.cg.utils;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = {5, -7, 8, 3};               // 0x32cc: {3, -1, 5, 6, 8, -7}

        int[] result = insertLast(arr, 10);
        printArray(result);
        // arr: 0x32cc
//        interchangePositiveSort(arr);
//        printArray(arr);

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
    public static void interchangePositiveSort(int [] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > 0 && numbers[j] > 0 && numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static int [] insertLast(int [] numbers, int value){
        int [] arrNew = new int[numbers.length + 1];            // arrNew: [0, 0, 0, 0, 0]
        for (int i = 0; i < numbers.length; i++) {
            arrNew[i] = numbers[i];
        }
        arrNew[arrNew.length - 1] = value;
        return arrNew;
    }

    public static int[] insert(int[] numbers, int value, int index) {
        return null;
    }
}
