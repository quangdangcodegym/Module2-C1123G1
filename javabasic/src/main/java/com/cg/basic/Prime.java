package com.cg.basic;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        printPrime();

    }
    public static void printPrime(){
        Scanner scanner = new Scanner(System.in);           // tạo 1 đối tượng để nhập
        System.out.print("Enter a number:");                // viết tắt: sout
        int number = scanner.nextInt();                     // kêu đối tượng scaner nhập vào 1 số
        boolean check = checkPrime(number);
        if (check == true) {
            System.out.println("Là số nguyên tố");
        }else{
            System.out.println("Không là số nguyên tố");
        }
    }
    public static boolean checkPrime(int number){
        if (number < 2)
            return false;
        else {
            /*
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            */
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
