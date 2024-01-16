package com.cg.basic;

import java.util.Arrays;

public class ExArray {
    public static void main(String[] args) {
        /*
        // đôi tượng [4,6,7];
        // biến tham chiếu: arr
        // let arr = [4,6,7];           let arr1 = new Array();

        int[] arr = new int[5];         // [0, 0, 0, 0, 0]
        int[] arr2 = {5, 1, 5, 7, 8};      // cách 2
        String[] arr1 = new String[100];    // [null, null, null, ......null]
         */
        int[] arr2 = {51, 15, 555, 715, 81};


//        countFiveEndQuantity(arr2);
//        dispalyAllOdd(arr2);
        checkNumberZero(arr2);

    }
    public static int countFiveEndQuantity(int [] numbers){
        int count  = 0;
        for (int i = 0; i < numbers.length; i++) {
            String str = String.valueOf(numbers[i]);
            char endChar = str.charAt(str.length()-1);
            if (endChar == '5') {
                count++;
            }
        }
        return count;
    }
    public static void dispalyAllOdd(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            boolean isOdd = true;
            String str = numbers[i] + "";       // "45"

            boolean checkOdd = str.contains("0") || str.contains("2") || str.contains("4") || str.contains("6")
                    ||str.contains("8");
            if(checkOdd){
                isOdd = false;
            }
            if (isOdd == true) {
                System.out.println(numbers[i]);
            }
        }
    }


    public static void checkNumberZero(int[] numbers) {
        int check = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                check = 1;
                break;
            }
        }

        System.out.println(check);
    }

    public  static boolean checkExistsArr(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int lengthA = arr1.length;
        int lengthB = arr2.length;

        if (lengthA > lengthB) return false;

        int i = 0;
        int j = 0;

        return false;
    }
}
