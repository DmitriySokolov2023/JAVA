//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Сделайте метод, который параметром будет принимать букву и проверять, это буква кириллицы или латиницы.
 */

import java.util.Scanner;

public class level7Example2 {
    public static void main(String[] args) {
        System.out.println("Введите букву: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        check(ch);
    }
    public static boolean kir(char ch) {
        return ch >= 'а' && ch <= 'я' || ch >= 'А' && ch <= 'Я';
    }

    // Метод для проверки, латинская ли это буква
    public static boolean lat(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static void check(char ch) {
        if (kir(ch)) {
            System.out.println("Символ '" + ch + "' является кириллицей.");
        } else if (lat(ch)) {
            System.out.println("Символ '" + ch + "' является латиницей.");
        } else {
            System.out.println("Символ '" + ch + "' не является буквой.");
        }
    }
}
