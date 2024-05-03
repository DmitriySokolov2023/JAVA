//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Дан массив с целыми числами:

int[] arr = {1, 2, 3, 0, 4, 5};
Выведите в консоль позицию первого нуля.
 */

import java.util.Arrays;

public class level3Example1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 5};
        System.out.println("Исходный массив:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Позиция первого нуля:" + (i + 1));
                break;
            }
        }
    }
}
