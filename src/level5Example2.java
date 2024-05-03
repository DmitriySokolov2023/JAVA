//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Спросите у пользователя число. Выведите в консоль таблицу умножения на это число. Ниже приведен пример для двойки:

1 * 2 = 2
2 * 2 = 3
3 * 2 = 6
4 * 2 = 8
5 * 2 = 10
6 * 2 = 12
7 * 2 = 14
8 * 2 = 16
9 * 2 = 18
 */


import java.util.Scanner;

public class level5Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа
        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        // Выводим заголовок таблицы умножения
        System.out.println("Таблица умножения на " + x + ":");

        // Выводим таблицу умножения
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + x + " = " + (x * i));
        }

        // Закрываем объект Scanner
        scanner.close();
    }
}
