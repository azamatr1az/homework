package Homework;

public class Box {

    public int width;

    public int height;

    public int length;

    public Box(int width, int height, int length) {


        this.width = width;
        this.height = height;
        this.length = length;
        
        System.out.println("width = " + width + "cm  " + "height = "  + height + "cm  " +  "length = " + length + "cm");
        System.out.println("Box volume is: " + length * width * height +  " milliliter = 1 liter");
    }



}


//экземпляр класса Box

import Homework.Box;

public class Box_size {
    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
    }
}
