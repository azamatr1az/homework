package Homework;

public class Homework_char_to_int_3_option {
    public static void main(String[] args) {
        char a = 'O';
        char b = 'O';
        char c = 'O';

        //первый способ
        System.out.println((int) a);
        //второй способ
        String b1 = String.valueOf(b);
        int b2 = Integer.parseInt(b1);
        System.out.println(b2);
        //третий способ
        int c1 = Character.getNumericValue(c);
        System.out.println(c1);


    }
}
