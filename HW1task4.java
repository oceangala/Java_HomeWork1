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

        if(qs.contains("?")){
            int q_quest_ind1 = qs.indexOf("?");
            int q_quest_ind2 = qs.lastIndexOf("?");
            //System.out.println(q_quest_ind1+" "+q_quest_ind2);

        }


    }
}