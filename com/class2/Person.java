package com.class2;

import java.util.Scanner;

public class Person {
   String name;
   String classs;
   int age;
   public void inputData(){
       Scanner input = new Scanner(System.in);
       System.out.println("Nhập họ và tên: ");
       this.name = input.nextLine();
       System.out.println("Lớp: ");
       this.classs = input.nextLine();
       System.out.println("Tuổi: ");
       this.age = input.nextInt();

   }
   public void display(){
       System.out.println("Họ và tên: " + this.name);
       System.out.println("Lớp: " + this.classs);
       System.out.println("Tuổi: " + this.age);
   }
}
