package ru.b2p.lesson7;

public class ArrayExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {1, 5, 6, 8, 9};
        int[] numbers = new int[10];
        System.out.println(values[2]);

        numbers[2] = 2;
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int num : numbers) {
            System.out.print(num + ", ");
        }

    }
}
