//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Сделайте метод, который параметрами будет принимать два числа и возвращать массив, заполненный целыми числами от минимального параметра до максимального.
 */


import java.util.Arrays;
import java.util.Scanner;

public class level7Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число массива:");
        int min = scanner.nextInt();
        System.out.println("Введите конечное число массива:");
        int max = scanner.nextInt();
       System.out.println(Arrays.toString(newArray(min, max)));
    }
    public static int[] newArray(int min, int max) {
        int[] arr = new int[max - min + 1];

        System.out.println("Массив от "+min+" до "+max+": ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + min;
        }

        return arr;
    }
}
