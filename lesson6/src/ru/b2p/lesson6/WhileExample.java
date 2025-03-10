package ru.b2p.lesson6;

public class WhileExample {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        doWhile(20);
    }

    private static void doWhile(int a) {
        do {
            System.out.println(a);
            a--;
        } while (a > 0);
    }
}
