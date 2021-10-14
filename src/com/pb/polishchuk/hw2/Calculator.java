package com.pb.polishchuk.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        int result;

        String symbol;


        System.out.println("Введите значение 1: ");
        operand1 = scan.nextInt();

        System.out.println("Введите значение 2: ");
        operand2 = scan.nextInt();

        System.out.println("Введите знак арифметической операции (+; -; *; /) ");
        symbol = scan.next();


        switch (symbol) {
            case "+":
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result );
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result );
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result );
                break;
            case "/":
                if(operand2 != 0){
                    result = operand1 / operand2;
                    System.out.println(operand1 + " / " + operand2 + " = " + result );
                }else {
                    System.out.println("На 0 делить нельзя!");
                }
                break;
            default:
                System.out.println("Неверная арифметическая операция");
        }
    }
}
