package com.telran.org.homeework_javapro;

public class HomeworkPerson {
    public static void main(String[] args) {
        Person personNumberOne = new Person();
        personNumberOne.setName("Davud");
        personNumberOne.setFullName("Davud Mukhtorov");
        personNumberOne.setAge(19);

        Person personNumberTwo = new Person("Azamat", "Azamat Mukhtorov", 50);


        personNumberOne.talk();
        personNumberOne.move();
        System.out.println(personNumberTwo);
    }
}
