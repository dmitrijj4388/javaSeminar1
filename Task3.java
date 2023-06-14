package seminar1;

import java.util.Scanner;

/*
Реализовать простой калькулятор (+-/*)
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите действие (+, -, *, /):");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        double result = 0;
        if (operation == '+'){
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        }
        System.out.printf(num1 + " " + operation + " " + num2 + " " + "=" + " " + result);
    }
}
