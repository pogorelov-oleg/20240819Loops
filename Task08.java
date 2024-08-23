/**
 * 8. Электронные часы показывают время в формате от 00:00
 * до 23:59. Написать программу, которая выведет на консоль
 * сколько раз за сутки случается так, что слева от двоеточия
 * показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
 * на экран все симметричные комбинации. Вывести общее
 * число комбинаций.
 */
public class Task08 {
    public static void main(String[] args) {
        int hour = 0;
        int min = 0;
        int mirrorNumbersCounts = 0;

        for (int i = hour; i < 24; i++) {
            for (int j = min; j < 60; j++) {
                if (j == reverseHour(i)) {
                    printTime(i, j);
                    mirrorNumbersCounts++;
                }
            }
        }
        System.out.println("Колличество симметричных комбинаций: " + mirrorNumbersCounts);
    }

    public static int reverseHour(int hour) {
        int reverse;
        if (hour < 10) reverse = hour * 10;
        else reverse = hour % 10 * 10 + hour / 10;
        return reverse;
    }

    public static void printTime(int hour, int min) {
        if (hour < 10) System.out.print("0" + hour);
        else System.out.print(hour);
        System.out.print(":");
        if (min < 10) System.out.println("0" + min);
        else System.out.println(min);
    }
}

