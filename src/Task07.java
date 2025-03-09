import java.util.Scanner;
import java.util.Arrays;
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] MyArray = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            MyArray[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString((MyArray)));
        Arrays.sort(MyArray);
        System.out.println("Произведена сортировка массива");
     vsyo(MyArray);
     nevsyo(MyArray);
        Task07 myArraytwo=new Task07();
     myArraytwo.neVsyoTwo();

        }

    static int count = 0;
    public static int vsyo(int... MyArray) {
               System.out.print("Числа, которые делятся на 3 " + ": ");
        for (Integer Number : MyArray) {
            if (Number % 3 == 0) {
                System.out.print(Number + ", ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static int nevsyo(int... MyArray){
        int[] MyArraytwo=new int[count];
        int count2=0;
        for (int i=0; i<MyArray.length; i++){
            if (MyArray[i]%3==0){
                MyArraytwo[count2]=MyArray[i];
                count2++;
            }
        }
        return count++;
    }
    public static void neVsyoTwo(int ... MyArraytwo){
              Arrays.sort(MyArraytwo);
        int max = MyArraytwo[0];
        int min = MyArraytwo[0];
        for (int i = 0; i < MyArraytwo.length; i++) {
            if (MyArraytwo[i] > max) {
                max = MyArraytwo[i];
            } else if (MyArraytwo[i] < min) {
                min = MyArraytwo[i];

            }
            System.out.println("Индекс " + i + ": " + MyArraytwo[i]);
                   }
            System.out.println("Минимальное: " + min + " . " + "Максимальное: " + max);
                double sum = 0;

        for (int x: MyArraytwo) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/MyArraytwo.length);


    }
}

