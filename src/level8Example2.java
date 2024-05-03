//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Напишите функцию, которая параметром будет принимать путь к папке, а возвращать размер этой папки.
 */


import java.io.File;
import java.util.Scanner;

public class level8Example2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите путь к папке");
        String folderPath = sc.nextLine();
        File folder = new File(folderPath);
        long size = getSizeFolder(folder) / 1024;

        System.out.println("Размер папки " + folderPath + " составляет " + size / 1024 + " Мб.");

    }

    public static long getSizeFolder(File folder){
        long size = 0;
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        size += getSizeFolder(file);
                    } else {
                        size += file.length();
                    }
                }
            }
        } else {
            size = folder.length();
        }
        return size;
    }
}
