//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n!
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class HW1task1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sn.nextInt();
        System.out.println();
        int tre = n;
        for (int i = 1; i < n; i++) {
            tre += i;

        }
        System.out.println("Треугольное число: "+tre);
        int fct = n;
        for (int i = 2; i < n; i++) {
            fct *= i;

        }

        System.out.println(n+"! = "+fct);
    }
}