import java.util.Scanner;
import java.util.Arrays;
public class Task_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = 0;
        while (n <= 3) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 1) {
                    System.out.println("Введенное число должно быть больше 1. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int[] mas1 = new int[n];
        int evenNums = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            mas1[i] = scanner.nextInt();
            evenNums++;
        }
        System.out.println("Первый массив сформирован и состоит из следующих чисел:");
        System.out.println(Arrays.toString(mas1));
        Arrays.sort(mas1);
        int[] mas2 = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (mas1[i] % 3 == 0) {
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println("Из первого массива на ТРИ делятся следующие элементы");
        System.out.println(Arrays.toString(mas2));
        Arrays.sort(mas2);
        int count = 0;
        for (int number : mas2) {
            count += number;
        }
        System.out.println("Во втором массиве всего элементов ");
        System.out.println(count / mas2.length);
        double average = Arrays.stream(mas2).average().getAsDouble();
        System.out.println("Среднее число во втором массиве - это ");
        System.out.println(average);
        int max = mas2[0];
        int min = mas2[0];
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] > max) {
                max = mas2[i];
            } else if (mas2[i] < min) {
                min = mas2[i];
            }
        }
        System.out.println("Минимальное: " + min + " . " + "Максимальное: " + max);
        double sum = 0;
        for (int x : mas2) {
            sum += x;
        }
        System.out.println("Сумма элементов массива равна " + sum);
    }
}

