//Реализовать простой калькулятор (+ - / *)
//  Ввод числа ->
//  Ввод знака ->
//  Ввод числа ->
import java.util.Scanner;
public class HW1task3 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sn.nextInt();
        System.out.println();
        System.out.print("Введите знак арифметического действия: ");
        String st = sn.next();
        System.out.println();
        System.out.print("Введите второе число: ");
        int b = sn.nextInt();
        System.out.println();
        if(st.equals("+")) System.out.println(a+" + "+b+" = "+(a+b));
        if(st.equals("-")) System.out.println(a+" - "+b+" = "+(a-b));
        if(st.equals("/")) System.out.println(a+" / "+b+" = "+((double)a/b));
        if(st.equals("*")) System.out.println(a+" * "+b+" = "+(a*b));
    }
}