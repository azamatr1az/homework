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

package com.telran.org.homeework_javapro;

public class HomeWorkPhone {
    public static void main(String[] args) {

        Phone phoneNumber1 = new Phone("111 111 111", "Samsung Galaxy S23", 100);



        Phone phoneNumber2 = new Phone("222 222 222", "iPhone 13", 50);



        Phone phoneNumber3 = new Phone("333 333 333", "GiPhone 13 Promax", 200);

        System.out.println("\n telephone info:");
        System.out.println("telephone  1:");
        System.out.println("number: " + phoneNumber1.getNumber());
        System.out.println("model: " + phoneNumber1.getModel());
        System.out.println("weight: " + phoneNumber1.getWeight());

        System.out.println("\nTelephone 2:");
        System.out.println("number: " + phoneNumber2.getNumber());
        System.out.println("model: " + phoneNumber2.getModel());
        System.out.println("weight: " + phoneNumber2.getWeight());

        System.out.println("\ntelephone 3:");
        System.out.println("number: " + phoneNumber3.getNumber());
        System.out.println("model: " + phoneNumber3.getModel());
        System.out.println("weight: " + phoneNumber3.getWeight());

        System.out.println("");


        phoneNumber1.receiveCall("Alex");
        phoneNumber2.receiveCall("Azamat");
        phoneNumber3.receiveCall("Davud");
    }

}
package com.telran.org.homeework_javapro;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String callerName) {
        System.out.println("Calling " + callerName );
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}


