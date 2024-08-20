/**
 * 3. Самовлюблённое число или число Армстронга – натуральное число, которое равно сумме своих цифр, возведенных
 * в степень, равную количеству его цифр.
 * Показать на экране все числа Армстронга в диапазоне от
 * 10 до 1 000 000.
 * Например:
 * 153 = 1^3 + 5^3 + 3^3
 */
public class Task03 {
    public static void main(String[] args) {
        for (int i = 10; i < 1_000_000; i++) {
            if (isArmstrongNumber(i)) System.out.println(i);
        }
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
     * Метод проверяет, является ли число Самовлюбленным (числом Армстронга)
     *
     * @param number число, которое мы проверяем
     * @return возвращает true если число является Самовлюбленным (числом Армстронга)
     */
    public static boolean isArmstrongNumber(int number) {
        int tempNumber = number;
        int sum = 0;
        for (int i = 0; i < numberOfDigits(number); i++) {
            sum += (int) Math.pow(tempNumber % 10, numberOfDigits(number));
            tempNumber /= 10;
        }
        return number == sum;
    }
}
