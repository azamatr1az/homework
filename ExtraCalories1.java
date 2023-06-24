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






