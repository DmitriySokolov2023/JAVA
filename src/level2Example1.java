//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Дан массив со строками:
String[] arr = {"ab", "cd", "ef"};
Выведите в консоль первые символы элементов этого массива.
 */


import java.util.Arrays;

public class level2Example1 {
    public static void main(String[] args) {
        String[] arr = {"ab", "cd", "ef"};
        System.out.println("Исходные данные: " + Arrays.toString(arr));

        for (String s : arr) {
            System.out.println("Первый символ элемента " + s + ": ");
            System.out.println(s.charAt(0));
        }
    }
}
