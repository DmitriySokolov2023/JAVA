//Соколов Дмитрий Александрович Ик-711

//Задание
/*
Дана переменная, содержащая радиус шара:

float r = 10.3;
Получите объем и площадь поверхности этого шара.
 */


public class level2Example2 {
    public static void main(String[] args) {
        float r = 10.3f;


        double V = (4.0 / 3.0) * Math.pow(r, 3) * Math.PI;
        double S = 4 * Math.PI * Math.pow(r, 2);


        System.out.println("Объем шара: " + String.format("%.2f",V));
        System.out.println("Площадь поверхности шара: " + String.format("%.2f",S));
    }
}
