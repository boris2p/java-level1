package ru.b2p.lesson6;

public class ForExample {
    public static void main(String[] args) {
        forExample();

        for (int value = 10; value > 0; value--) {

            if (value == 5) {
//                break;
                continue;
            } System.out.println(value);
        }
    }

    private static void forExample() {
        for (int value = 10; value > 0; value--) {
        System.out.println(value);}
    }
}
