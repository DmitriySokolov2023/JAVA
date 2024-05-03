//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Дана строка со словами. Найдите самое длинное слово из этой строки.
 */


import java.util.Arrays;

public class level9Example1 {
    public static void main(String[] args) {
        String str = "комприлятор java программирование python c++ IT";
        String[] strArray = str.split(" ");
        int[] lengthWord = new int[strArray.length];
        System.out.print("Исходный массив: ");
        for(int i = 0; i < strArray.length; i++){
            lengthWord[i] = strArray[i].length();

        }
        System.out.println(Arrays.toString(strArray));
        int maxIndex = 0;
        int maxValue = lengthWord[0];
        for (int i = 1; i < lengthWord.length; i++) {
            if (lengthWord[i] > maxValue) {
                maxValue = lengthWord[i];
                maxIndex = i;
            }
        }

        System.out.println("Самое длинное слово из строки: " + strArray[maxIndex]);
        System.out.println("Длинна слова: " + strArray[maxIndex].length());
    }
}
