package com.company;

public class Main {

    public static void main(String[] args) {
        // Задачи 1-2-3
//
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();

        int y = numbers[numbers.length - 1];
        for (; y > 0; y--) {
            if (numbers.length - 1 > y) {
                System.out.print(y + " ");
            } else {
                System.out.print(y + ", ");
            }
        }
        System.out.println();

        // цикл для задачи 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
            { System.out.print(numbers [i] + 1 + " ");
            }
        }
        System.out.println();
//
        double[] doubles = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++) {
            if (i < doubles.length - 1) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
        }
        System.out.println();

        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i >= 1) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
        }
        System.out.println();
//
        String[] seasons = new String[]{"winter", "spring", "summer", "autumn"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.print(seasons[i] + ", ");
        }
        System.out.println();

        for (int i = seasons.length - 1; i >= 0; i--) {
            if (i >= 1) {
                System.out.print(seasons[i] + ", ");
            } else {
                System.out.print(seasons[i]);
            }
        }
        System.out.println();

    }
}
