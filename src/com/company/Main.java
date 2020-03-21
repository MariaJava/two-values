package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scn.nextInt();
        System.out.println("Введите второе число");
        int b = scn.nextInt();

        if (a == b) {
            System.out.println((a + b) * 2);
        } else {

            System.out.println(a + b);
        }

        }
     }



