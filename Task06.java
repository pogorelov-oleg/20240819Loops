import java.util.HashSet;

/**
 * 6. Вывести на консоль все восьмизначные числа, цифры в
 * которых не повторяются. Эти числа должны делиться на
 * 12345, без остатка. Показать общее количество найденных
 * чисел.
 */
public class Task06 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10_000_000; i < 100_000_000; i++) {
            if (noIdenticalDigits(i) && i % 12345 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Количество чисел, цифры в которых не повторяются и которые делятся на 12345: " + count);
    }

    /**
     * Метод проверяет повторяются ли цыфры в числе
     *
     * @param number число, которое проверяем
     * @return возвращает true, если цифры в числе не повторяются.
     */
    public static boolean noIdenticalDigits(int number) {
        HashSet<Integer> noIdenticalDigitsSet = new HashSet<Integer>();
        boolean flag = true;
        do {
            if (noIdenticalDigitsSet.contains(number % 10)) {
                flag = false;
                break;
            } else noIdenticalDigitsSet.add(number % 10);
        }
        while ((number /= 10) > 0);
        return flag;
    }
}
