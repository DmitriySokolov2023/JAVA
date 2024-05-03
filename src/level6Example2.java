//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Сформируйте с помощью циклов следующий массив:

int[] {
	{1, 2, 3},
	{1, 2, 3},
	{1, 2, 3},
	{1, 2, 3},
	{1, 2, 3},
}
 */


import java.util.Arrays;

public class level6Example2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};


        boolean doubleElement = false;


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                doubleElement = true;
                break;
            }
        }
        System.out.println("Исходный массив: "+ Arrays.toString(arr));
        if (doubleElement) {
            System.out.println("В массиве есть два одинаковых элемента подряд.");
        } else {
            System.out.println("В массиве нет двух одинаковых элементов подряд.");
        }

    }
}
