//Соколов Дмитрий Александрович Ик-711

//Задание
/*
int[] {1, 0, 2, 3, 0, 5}
Удалите из массива все нули и запишите результат в новый массив:

int[] {1, 2, 3, 5}
 */

import java.util.ArrayList;
import java.util.Arrays;

public class level4Example1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 5};

        ArrayList<Integer> list = new ArrayList<>();


        for (int i : arr) {
            if (i != 0) {
                list.add(i);
            }
        }


        int[] newArr = new int[list.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }


        System.out.println(Arrays.toString(newArr));
    }
}
