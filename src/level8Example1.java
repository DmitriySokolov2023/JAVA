//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Дана папка с файлами. Получите массив размеров всех файлов из этой папки.
 */


import java.io.File;
import java.util.ArrayList;


public class level8Example1 {
    public static void main(String[] args) {
        String pathToFolder = "C:\\folder";


        File folder = new File(pathToFolder);
        File[] files = folder.listFiles();


        ArrayList<Long> sizeFiles = new ArrayList<>();


        if (files != null) {

            for (File file : files) {
                if (file.isFile()) {
                    sizeFiles.add(file.length());
                }
            }

          
            Long[] arrSize = sizeFiles.toArray(new Long[0]);

            // Выводим массив размеров файлов в консоль
            for (int i = 0; i < arrSize.length; i++) {
                System.out.println("Размер "+ (i+1)+" файла = " + arrSize[i] + " байт");
            }
        } else {
            System.out.println("Папка не содержит файлов.");
        }
    }
}
