//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Дан произвольный двухмерный массив:

{
	{11, 12, 13, 14, 15},
	{21, 22, 23, 24, 25},
	{31, 32, 33, 34, 35},
	{41, 42, 43, 44, 45},
	{51, 52, 53, 54, 55},
}
Напишите код, который будет обнулять заданный столбец:

{
	{11, 12,  0, 14, 15},
	{21, 22,  0, 24, 25},
	{31, 32,  0, 34, 35},
	{41, 42,  0, 44, 45},
	{51, 52,  0, 54, 55},
}
 */


public class level10Example2 {
    public static void main(String[] args) {
        int[][] currentArray = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 33, 33, 34, 35},
                {41, 42, 43, 44, 45},
                {51, 52, 53, 54, 55},
        };
        System.out.println("Исходный двумерный массив: ");

        for (int[] el : currentArray) {
            for (int j = 0; j < currentArray.length; j++) {
                System.out.print(el[j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Обнулен заданный столбец: ");
        System.out.println();

        for (int i = 0; i < currentArray.length; i++) {
            for (int j = 0; j < currentArray.length; j++) {
                if (j == 2) {
                    currentArray[i][j] = 0;
                }
                System.out.print(currentArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
