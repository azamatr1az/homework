package Homework;

public class Homework_char_to_int_3_option {
    public static void main(String[] args) {
        char a = 'O';
        char b = '0';
        char c = 'O';

        //первый способ
        System.out.println((int) a);
        
        //второй способ
        //присвоил к переменной b число ноль потомучто при присвоении буквы программа падает
        String b1 = String.valueOf(b);
        int b2 = Integer.parseInt(b1);
        System.out.println(b2);
        
        //третий способ
        int c1 = Character.getNumericValue(c);
        System.out.println(c1);


    }
}
