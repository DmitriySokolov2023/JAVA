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


import java.lang.reflect.Array;
import java.util.Arrays;

public class level6Example1 {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = j + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
