package com.example.areacalculator;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
//        even number = 2n
//        odd number = 2n+1

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println(num + "The number is even");
        else
            System.out.println(num + "The number is odd");
    }
}
