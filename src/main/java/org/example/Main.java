package org.example;

public class Main {
    public static void main (String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }


    public static boolean Task1() {
        int a=2;
        int b=20;
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void Task2() {
        int a=35;
        if (a >= 0) {
            System.out.println("Number " + a + "Positive");
        } else {
            System.out.println("Number " + a + " Negative");
        }
    }

    public static boolean Task3() {
        int a=-1;
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static  void Task4() {
        int i=3;
        for (int k = 0; k < i; k++) {
            System.out.println("Hello");
        }
    }

    public static boolean Task5() {
        int year = 2020;
        if ((year % 4 == 0) && ((year % 4 == 0) && (year % 100 > 0)) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) {
            System.out.println("leap year");
            return true;

        } else {
            System.out.println("non-leap year");
            return false;
        }
    }

    public static void Task6() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int arrl = arr.length;
        for (int i = 0; i < arrl; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arrl; i++) {
            System.out.println(i + "-" + arr[i]);
        }
    }

    public static void Task7() {
        int[] arr= new int[]{0};
        int[] fillArr = new int[100];
        int i;
        for (i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }


    }
}

