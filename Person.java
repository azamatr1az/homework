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
/*
public class Person {
    private String name;
    private String fullName;
    private int age;

    // Конструктор без аргументов
    public Person() {
        // Можно установить значения по умолчанию или оставить поля неинициализированными
        this.name = "";
        this.fullName = "";
        this.age = 0;
    }

    // Конструктор с аргументами
    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    // Сеттеры для полей
    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Геттеры для полей (по желанию)
    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Создаем два объекта класса Person
        Person person1 = new Person();  // Используем конструктор без аргументов
        Person person2 = new Person("Иван", "Иванович Иванов", 30);  // Используем конструктор с аргументами

        // Заполняем поля объекта person1 с помощью сеттеров
        person1.setName("Петр");
        person1.setFullName("Петров Петр Петрович");
        person1.setAge(25);

        // Выводим информацию о объектах
        System.out.println("Информация о person1:");
        System.out.println("Имя: " + person1.getName());
        System.out.println("Полное имя: " + person1.getFullName());
        System.out.println("Возраст: " + person1.getAge());

        System.out.println("\nИнформация о person2:");
        System.out.println("Имя: " + person2.getName());
        System.out.println("Полное имя: " + person2.getFullName());
        System.out.println("Возраст: " + person2.getAge());
    }
}
*/

/*class Person {
    private String name;
    private String fullName;
    private int age;

    public Person() {
        // Конструктор без аргументов
    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
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

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса Person
        Person person1 = new Person();
        Person person2 = new Person("Иван", "Иванович Иванов", 30);

        // Заполняем поля объекта person1 с помощью сеттеров
        person1.setName("Петр");
        person1.setFullName("Петров Петр Петрович");
        person1.setAge(25);

        // Вызываем методы move() и talk() для объектов класса Person
        person1.move();
        person2.talk();

        // Создаем объекты класса Phone
        Phone phone1 = new Phone("123-456-789", "Samsung Galaxy S21", 0.3);
        Phone phone2 = new Phone("987-654-321", "iPhone 12", 0.4);
        Phone phone3 = new Phone("555-555-555", "Google Pixel 5", 0.35);

        // Выводим информацию о телефонах через геттеры
        System.out.println("\nИнформация о телефонах:");
        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.getModel());
        System.out.println("Вес: " + phone1.getWeight());

        System.out.println("\nТелефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.getModel());
        System.out.println("Вес: " + phone2.getWeight());

        System.out.println("\nТелефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight());

        // Вызываем метод receiveCall() для объектов класса Phone
        phone1.receiveCall("Анна");
        phone2.receiveCall("Иван");
        phone3.receiveCall("Мария");
    }
}

*/
