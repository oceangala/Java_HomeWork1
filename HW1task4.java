//*(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
//  Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
//  Требуется восстановить выражение до верного равенства.
//  Предложить хотя бы одно решение или сообщить, что его нет.
//  под знаками вопроса - одинаковые цифра
//        Ввод: 2? + ?5 = 69
//        Вывод: 24 + 45 = 69

import java.util.Scanner;
public class HW1task4 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String st = sn.nextLine();
        System.out.println();
        int qi = st.indexOf("+");
        String qs = st.substring(0,qi).trim();

        int wi = st.indexOf("=");
        String ws = st.substring(qi+1, wi).trim();

        String es = st.substring(wi+1, st.length()).trim();

        //System.out.println("$"+qs+"$"+ws+"$"+es+"$");


        char[] q_arr;
        char[] w_arr;
        char[] e_arr;


        for (int n = 0; n < 10; n++) {
            String a1 = Integer.toString(n);
            char a = a1.charAt(0);
            //System.out.println(a);

            q_arr = qs.toCharArray();
            w_arr = ws.toCharArray();
            e_arr = es.toCharArray();


            for (int i = 0; i < q_arr.length; i++) {
                if (q_arr[i]=='?')  q_arr[i] = a;
            }
            //System.out.println(a+" "+String.copyValueOf(q_arr));

            for (int i = 0; i < w_arr.length; i++) {
                if (w_arr[i]=='?')  w_arr[i] = a;
            }
            //System.out.println(a+" "+String.copyValueOf(w_arr));

            for (int i = 0; i < e_arr.length; i++) {
                if (e_arr[i]=='?')  e_arr[i] = a;
            }
            //System.out.println(String.copyValueOf(e_arr));

             if (Integer.parseInt(String.copyValueOf(q_arr)) +
                    Integer.parseInt(String.copyValueOf(w_arr)) == Integer.parseInt(String.copyValueOf(e_arr))) {
                System.out.println(Integer.parseInt(String.copyValueOf(q_arr)) + " + " +
                        Integer.parseInt(String.copyValueOf(w_arr)) + " = " +
                        Integer.parseInt(String.copyValueOf(e_arr)));
                break;
            }
             else {
                 if(n==9){
                     System.out.println("Решения нет");
                 }

             }



        }
    }
}
