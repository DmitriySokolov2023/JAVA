//Соколов Дмитрий Александрович Ик-711

//Задание
/*
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
Дана переменная:
byte n = 3;
Превратите этот массив в двухмерный, по n элементов в подмассиве.
 */


import java.util.Arrays;

public class level9Example2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        byte n = 3;
        int countRow = arr.length / n;
        int[][] newArr = new int[countRow][n];
        int countElement = 0;
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < countRow; i++) {
            for (int j = 0; j < n; j++) {
                newArr[i][j] = arr[countElement];
                countElement++;
            }
        }

        System.out.println("Массив с n элементами в подмассиве: ");
        System.out.println();
        for (int i = 0; i < countRow; i++) {
            for (int j = 0; j < n; j++) {
                if(i > 2){
                    System.out.print(newArr[i][j] + "    ");
                }else System.out.print(newArr[i][j] + "     ");
            }
            System.out.println();
        }

    }
}
