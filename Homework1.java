import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the whole number: ");
        int wn = sc.nextInt();

        System.out.println(Integer.toBinaryString(wn));

        System.out.println(Integer.toOctalString(wn));

        System.out.println(Integer.toString(wn));

        int wn16 = 0x7b;
        System.out.println(wn16);

        sc.close();




    }
}
