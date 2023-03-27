// Вывести все простые числа от 1 до 1000

public class HW1task2 {
    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++) {
            boolean count = true;
            for (int j = 2; j < i/2; j++) {
                if (i%j == 0) {
                    count = false;
                    break; } }

            if (count) System.out.println(i);
        }

    }
}