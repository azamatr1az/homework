package Homework;
import java.util.Scanner;

public class Even_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите целое число: ");

        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " это четное число");
        } else {
            System.out.println( number + " это нечетное чмсло");
        }
    }
}
