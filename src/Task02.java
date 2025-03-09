import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число для перевода в двоичную систему: ");
        input = scan.nextInt();
        convert(input);
    }
    public static void convert(int num) {
        if (num>0) {
            convert(num/2);
            System.out.print(num%2 + " ");
        }
    }

}
