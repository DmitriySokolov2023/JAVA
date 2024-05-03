//Соколов Дмитрий Александрович Ик-711

//Задание
//Найдите сумму всех целых четных чисел в промежутке от 1 до 100.


public class level1Example2 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.print("Сумма всех целых четных чисел в промежутке от 1 до 100 = " + sum);
    }
}
