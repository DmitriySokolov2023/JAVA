//Соколов Дмитрий Александрович Ик-711

//Задание
/*
"aaa bbb ccc eee fff"
Сделайте заглавным первый символ каждого второго слова в этой строке. В нашем случае должно получится следующее:

"aaa Bbb ccc Eee fff"
 */

import java.util.ArrayList;
import java.util.Arrays;

public class level4Example2 {
    public static void main(String[] args) {

        String str = "aaa bbb ccc eee fff";

        String[] subStr = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < subStr.length; i++) {
            if (i % 2 > 0) {
                result.append(subStr[i].toUpperCase()).append(" ");
            }else {
                result.append(subStr[i]).append(" ");
            }
        }

        System.out.println("Исходная строка: " + str);
        System.out.println("Измененная строка: " +result);
    }
}
