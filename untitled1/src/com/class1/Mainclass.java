package com.class1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person1.inputData();
        person1.display();

//        Scanner aput = new Scanner(System.in);
//        System.out.println("plesase enter name:");
//        this.name = aput.nextLine();
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter mark:");
//        int mark = input.nextInt();
//
//        System.out.println("Mark = "+ mark);
    }
}
