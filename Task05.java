import java.util.Scanner;

/**
 * 5. Напишите программу, которая будет проверять, является
 * ли число, введенное с клавиатуры палиндромом (одинаково
 * читающееся в обоих направлениях). Например, 123454321
 * или 221122 – палиндром. Программа должна вывести YES,
 * если число является палиндромом, и NO – в противоположном случае.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        isPalendrom(sc.nextInt());
    }

    /**
     * Метод вычисляет количество знаков в числе
     *
     * @param number число, количество знаков которого нам нужно узнать
     * @return возвращает количество знаков в числе
     */
    public static int numberOfDigits(int number) {
        int numberOfDigits = 1;
        while ((number /= 10) > 0) {
            numberOfDigits++;
        }
        return numberOfDigits;
    }

    /**
     * Метод проверяет, является ли число палендромом и выводит информацию в консоль
     *
     * @param number число, которое мы проверяем
     */
    public static void isPalendrom(int number) {
        int firstDigit;
        int lastDigit;

        while (number >= 10) { //цикл продолжается, пока у числа два и более знаков
            firstDigit = (int) (number / Math.pow(10, numberOfDigits(number) - 1));
            lastDigit = number % 10;
            if (firstDigit != lastDigit) {
                System.out.println("NO");
                break;
            }
            number = number % (int) Math.pow(10, numberOfDigits(number) - 1) / 10; //отсекаем первую и последнюю цифру
            if (number < 10) {
                System.out.println("YES");
            }
        }
    }
}
