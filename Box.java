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

