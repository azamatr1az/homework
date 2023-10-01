package com.telran.org.homeework_javapro;

public class Person {
    private String name;
    private String fullName;
    private int age;

    public void move(){
        System.out.println( "The person "+ fullName + " is going");


    }
    public void talk() {
        System.out.println("The person " + fullName + " is talking");


    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Person() {
        System.out.println("Hi Person number One");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
