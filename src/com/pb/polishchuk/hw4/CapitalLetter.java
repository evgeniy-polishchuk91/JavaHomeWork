package com.pb.polishchuk.hw4;

import java.util.Scanner;



public class CapitalLetter {
    static String myMethod (String text){
        String words[]=text.split("\\s");
        String result =" ";

        for(String w: words){
            String first = w.substring(0,1);
            String rest = w.substring(1);

            result+=first.toUpperCase()+ rest+ " ";
        }

        System.out.println(result.trim());

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scan.nextLine();

        myMethod(str);

    }
}
