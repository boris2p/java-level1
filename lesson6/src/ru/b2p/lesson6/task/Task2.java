package ru.b2p.lesson6.task;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */

public class Task2 {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println(sum(number));
        System.out.println(sumFor(number));

    }

    public static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sumFor(int value) {
        int sum = 0;
        for (int i = value; i !=0; i/= 10) {
            sum += i % 10;
        }
        return sum;
    }
}

