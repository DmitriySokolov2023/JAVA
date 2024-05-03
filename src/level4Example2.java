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

        String str = "a bc def ghij";

        String[] subStr = str.split(" ");

        StringBuilder result = new StringBuilder();


        for (String i : subStr) {
            if (i.length() <= 3) {
                result.append(i.toUpperCase()).append(" ");
            } else {
                result.append(i).append(" ");
            }
        }
        System.out.println(result);
    }
}
