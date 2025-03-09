package ru.b2p.lesson4;

public class NewSwitchExample {
    public static void main(String[] args) {
//        byte, short, int, char, String, enum
        var value = 4;
        var answer = switch (value) {
            case 1 -> "Один";
            case 2, 3, 4 -> "Два, три или четыре";
            case 10 -> "Десять";
            case 28 -> "Двадцать восемь";
            default -> "Нет такого значения";
        };
        System.out.println(answer);
    }
}
