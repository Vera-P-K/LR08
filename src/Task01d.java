import java.util.Scanner;
public class Task01d {
    public static void main(String[] args) {
        Scanner FibIn = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала");
        int n = FibIn.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        int result;
        if (n == 0) return 0;
        if (n == 1) return 1;
        else {
            result = factorial(n - 1) * n;
            return result;
        }

    }
}