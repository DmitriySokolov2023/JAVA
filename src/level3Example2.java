//Соколов Дмитрий Александрович Ик-711

//Задание
/*
float num = 12.34;
Запишите целую часть числа в одну переменную, а дробную часть - в другую:
 */

import java.nio.charset.Charset;
import java.util.Arrays;

public class level3Example2 {
    public static void main(String[] args) {
        float num = 12.34f;
        int num1 = Integer.parseInt(String.format("%.0f",num));
        int num2 = Math.round((num - num1) * 100);
        System.out.println("Исходное число" + num);

        System.out.println("Переменная num1 = " + num1);
        System.out.println("Переменная num2 = " + num2);
    }
}
