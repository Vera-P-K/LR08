import java.util.Scanner;
public class Task01e {
    public static void main(String[] args) {
        Scanner FibIn = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности Фибоначчи");
        int m = FibIn.nextInt();
        System.out.println("Ряд Фибоначчи из " + m + " составляет: ");
        int l = 0;
        do {
            System.out.println(fibCount(l));
            l++;
        } while (l < m);
    }
        public static int fibCount(int l){
            if (l == 0) {
                return 0;
                            } else if (l == 1) {
                return 1;
            } else {
             return fibCount(l - 2) + fibCount(l - 1);
            }

        }
    }