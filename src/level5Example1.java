//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Напишите программу, которая выведет в консоль следующую пирамидку:
x
xx
xxx
xxxx
xxxxx
 */


public class level5Example1 {
    public static void main(String[] args) {
        String x = "x";
        System.out.println("Пирамидка: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
