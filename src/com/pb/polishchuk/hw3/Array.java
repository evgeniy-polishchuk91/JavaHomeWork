package com.pb.polishchuk.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x = array.length;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите одномерный массив целых чисел размерностью 10 элементов");

        for (int i = 0; i < x; i++){
            System.out.println("Введите целое число номер "+ (i + 1) + ":");
            array[i] = scan.nextInt();
        }

        System.out.println("Ваш массив:  ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println();
        System.out.println("Сумма всех элементов массива: " + sum);

        int pnumb = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                pnumb++;
            }
        }

        System.out.println("Количество положительных элементов: " + pnumb);

        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++){
                if (array[j] > array [j + 1] ){
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
