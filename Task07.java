import java.util.Scanner;

/**
 * 7. Показать битовое представление значения переменной
 * типа int, используя только один цикл, управляющую переменную, вывод на консоль и битовые операции.
 * Не использовать строки и любые другие готовые функции (методы).
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = sc.nextInt();
        int pow = 2;

        while (pow <= input) {
            pow *= 2;
        }
        while (pow > 0) {
            if (input >= pow) {
                System.out.print(1);
                input -= pow;
            } else System.out.print(0);
            pow /= 2;
        }
    }
}
