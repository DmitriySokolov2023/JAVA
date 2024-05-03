//Соколов Дмитрий Александрович Ик-711

//Задание
//Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.

import java.util.Scanner;

public class level1Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int x = scanner.nextInt();
        System.out.println("Введенное число: " + x);
        // Проверяем, отрицательное ли число
        if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }


        scanner.close();
    }
}
