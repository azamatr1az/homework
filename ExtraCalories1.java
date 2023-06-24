package Homework;

public class ExtraCalories1 {
    private double radius1, radius2, caloriesPerSquareCm, area1, area2, extraCalories ;

    public ExtraCalories1(double radius1, double radius2, double caloriesPerSquareCm) {
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.caloriesPerSquareCm = caloriesPerSquareCm;
        result();

        printResult();
    }
    private void result() {
        area1 = Math.PI * (radius1 * radius1); // Площадь первой пиццы
        area2 = Math.PI * (radius2 * radius2); // Площадь второй пиццы
        extraCalories = (area2 - area1) * caloriesPerSquareCm;
    }
    public void printResult(){
        System.out.println("При замене пиццы диаметром 24 см на пиццу диаметром 28 см будет " + (long)extraCalories + " лишних калорий.");

    }
}

//Экземпляр класса Extracalories1

package Homework;

public class Extracalories2 {
    public static void main(String[] args) {
        int radius1 = 12; // Радиус первой пиццы (24 см / 2)
        int radius2 = 14; // Радиус второй пиццы (28 см / 2)
        int caloriesPerSquareCm = 40; // Количество калорий на каждый квадратный сантиметр

        ExtraCalories1 a1 = new ExtraCalories1(radius1, radius2, caloriesPerSquareCm);

    }
}    

//здесь еще один способ с использованием scannera

package Homework;
import java.util.Scanner;

public class ExtraCalories {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Extracal extra = new Extracal();
        scanner.close();
    }
    static class  Extracal {
        public Extracal() {

            int radius1 = 12; // Радиус первой пиццы (24 см / 2)
            int radius2 = 14; // Радиус второй пиццы (28 см / 2)
            int caloriesPerSquareCm = 40; // Количество калорий на каждый квадратный сантиметр

            double area1 = Math.PI * (radius1 * radius1); // Площадь первой пиццы
            double area2 = Math.PI * (radius2 * radius2); // Площадь второй пиццы
            double extraCalories = (area2 - area1) * caloriesPerSquareCm; // Лишние калории

            System.out.println("При замене пиццы диаметром 24 см на пиццу диаметром 28 см будет " + extraCalories + " лишних калорий.");


        }
    }
}


