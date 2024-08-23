/**
 * 10. 2520 – наименьшее число, которое можно разделить на
 * каждое из чисел от 1 до 10, без остатка. Написать программу, которая рассчитывает наименьшее положительное число,
 * которое делится на все числа от 1 до 20.
 */
public class Task10 {
    public static void main(String[] args) {
        int result = 1;
        int minDiv = 1;
        int maxDiv = 20;
        boolean flag = false;

        while (!flag) {
            flag = true;
            for (int i = minDiv; i <= maxDiv; i++) {
                if (result % i != 0) {
                    flag = false;
                    result++;
                    break;
                }
            }
        }

        System.out.printf("Наименьшее число, которое можно разделить на все числа от %d до %d: %d",
                minDiv, maxDiv, result);
    }
}

