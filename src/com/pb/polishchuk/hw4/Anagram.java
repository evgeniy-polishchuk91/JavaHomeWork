package com.pb.polishchuk.hw4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()){
            char[] arr1 = a.toLowerCase().toCharArray();
            char[] arr2 = b.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)){
                System.out.println("анаграмма");
                return true;
            }
            else System.out.println("НЕ анаграмма");
            return false;
        }
        System.out.println("НЕ анаграмма");
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку номер 1");
        String str1 = scan.nextLine();

        System.out.println("Введите строку номер 2");
        String str2 = scan.nextLine();

        isAnagram(str1, str2);

    }
}
