package seminar1;

import static java.lang.Math.sqrt;

/*
2) Вывести все простые числа от 1 до 1000
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(1);
        for (int i = 2; i < 1001; i++) {
            if (CheckPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean CheckPrimeNumber(int a) {
        if(a < 2){
            return false;
        }
            for (int i = 2; i <= sqrt(a); i++) {
                if(a % i == 0){
                    return false;
                }

        }
            return true;
        }

}
