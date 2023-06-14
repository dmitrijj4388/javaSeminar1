package seminar1;

import java.util.Scanner;

/*
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i < number + 1; i++) {
            sum += i;
            factorial *= i;

        }
        System.out.printf("Сумма чисел от 1 до %d равна %d\n", number, sum);

        System.out.printf("Произведение чисел от 1 до %d равно %d", number, factorial);
    }
}
