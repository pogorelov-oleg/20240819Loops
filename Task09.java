/**
 * 9. Если перечислить все натуральные числа меньше 10, кратные 3 или 5, мы получаем 3, 5, 6 и 9. Сумма этих кратных – 23.
 * Найдите сумму всех чисел, кратных 3 или 5, начиная с 0
 * и до 1 000.
 */
public class Task09 {
    public static void main(String[] args) {
        int firstNum = 0;
        int lastNum = 1000;
        int sum = 0;

        for (int i = firstNum; i < lastNum; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        System.out.printf("Cумма чисел, кратных 3 или 5 в диапозоне от %d до %d(включительно) = %d\n",
                firstNum, lastNum, sum);
    }
}
