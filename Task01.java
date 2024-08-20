/**
 * 1. Числа Фибоначчи – это последовательность чисел, в которой два первых числа последовательности равны 0 и 1, а
 * каждое последующее число равно сумме двух предыдущих.
 * Показать на экране все числа Фибоначчи в диапазоне от
 * 0 до 10 000 000.
 */
public class Task01 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " ");

        int nextNum = num1 + num2;
        while (nextNum <= 10_000) {
            System.out.print(nextNum + " ");
            nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
