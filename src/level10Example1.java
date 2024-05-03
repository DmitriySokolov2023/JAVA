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
Обнулите элементы его главной диагонали:

{
	{ 0, 12, 13, 14, 15},
	{21,  0, 23, 24, 25},
	{31, 32,  0, 34, 35},
	{41, 42, 43,  0, 45},
	{51, 52, 53, 54,  0},
}
 */


public class level10Example1 {
    public static void main(String[] args) {
        int[][] array = {
            {11, 12, 13, 14, 15},
            {21, 22, 23, 24, 25},
            {31, 32, 33, 34, 35},
            {41, 42, 43, 44, 45},
            {51, 52, 53, 54, 55},
        };
        System.out.println("Исходный массив: ");
        System.out.println();
        for (int[] el : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(el[j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Главная диагональ обнулена: ");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
