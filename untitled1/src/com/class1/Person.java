package com.class1;

import java.util.Scanner;

public class Person {
    //Members
    String name;
    String email;
    int age;

    public void display(){
        System.out.println("Name"+this.name);
        System.out.println("emali"+ this.email);
        System.out.println("age"+ this.age);
    }
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter name:");
        this.name = input.nextLine();

        System.out.println("please enter email:");
        this.email = input.nextLine();

        System.out.println("please enter age:");
        this.age = input.nextInt();

        System.out.println("Input completed");
    }
}
