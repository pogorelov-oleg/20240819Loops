import java.util.Scanner;

/**
 * 12. В первый день спортсмен пробежал x километров, а затем
 * он каждый день увеличивал пробег на 10% от предыдущего
 * значения. По числу, указанному с клавиатуры y, определите
 * номер дня, на который пробег спортсмена составит не менее
 * y километров.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 4; //так как в условии небыло этого значения, я произвольно присвоил 4
        double nextDay;
        double y;
        int days = 1;

        System.out.print("Введите количество километров, которое необходимо пробежать спортсмену: ");
        y = sc.nextInt();

        nextDay = x + x * 0.1;
        while (y > x) {
            days++;
            x += nextDay;
            nextDay += nextDay * 0.1;
        }

        System.out.println("Данная дистанция будет пройдена на " + days + " день");
    }
}
