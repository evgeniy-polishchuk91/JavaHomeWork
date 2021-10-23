package com.pb.polishchuk.hw3;
import java.util.Scanner;
import  java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте целое число в диапазоне от 0 до 100");
        System.out.println("Для выхода из игры введите  -1");
        int x;
        int attempt = 0;

        Random random = new Random();
        x = random.nextInt(101);

        Scanner scan = new Scanner(System.in);
        while (true) {
            attempt++;
            int number = scan.nextInt();

            if(number == -1){
                System.out.println("Вы вышли из игры");
                break;
            }
            if (number == x) {
                System.out.println("Число отгадано!!!");
                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;
            } else if (number > x) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
