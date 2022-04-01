package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Упражнение №1
        int clientOS = 1;
        if (clientOS < 1) {
            System.out.println("Download Android app from this link.");
        } else {
            System.out.println("Download IOS app from this link.");
        }
        // Упражнение №2
        int clientDeviceYear = 2018;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Download light Android app from this link.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Download light IOS app from this link.");
        } else if (clientOS <= 1 && clientDeviceYear >= 2015) {
            System.out.println("Download Android app from this link.");
        } else {
            System.out.println("Download IOS app from this link.");
        }
        // Задание №3
        int year = 2022;
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println(year + " this year is intercalary year.");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println(year + " this year is interalary year.");
        else if (year % 100 == 0)
            System.out.println(year + " this year is not interalary year.");
        else
            System.out.println(year + " this year is not interalary year.");
        // Задание №4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20)
            System.out.println("Cart arrive next day.");
        else if (deliveryDistance >= 20 || deliveryDistance <= 60)
            System.out.println("Cart arrive after two days.");
        else if (deliveryDistance >= 60 || deliveryDistance <= 100)
            System.out.println("Cart arrive after three days.");
        else
            System.out.println("Cart arrive on a work week.");
        //Задание №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("This season does not exist");
        }
        // Задание №6
        {
            int a = 12;
            int b = 27;
            int c = 44;
            int d = 15;
            int e = 9;
            int aBCDE = a * (b + (c - d * e));
            int result = -aBCDE;
            System.out.println(result);
        }
        // Задание №7
        {
            int a = 5;
            int b = 7;
            a = a + b - (b = a);
            System.out.println(a);
            System.out.println(b);
        }
        // Задание №8
        int a = 456;
        int b =1;
        b = a / 10;
        b = b % 10;
        System.out.println(b);

    }
}






