package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());


        Person secondPerson = new Person("esra","cevikbas",27,100000,Boolean.TRUE,new String[]{"tennis","traveling"});
        System.out.println("Firstname: " + secondPerson.getFirstName());

        System.out.println("LastName: " + secondPerson.getLastName());

        System.out.println("Age: " + secondPerson.getAge());

        System.out.println("Salary: " + secondPerson.getSalary());

        System.out.println("Hobbies: " + Arrays.toString(secondPerson.getHobbies()));

         */

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());


    }
}








