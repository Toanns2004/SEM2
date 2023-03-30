package com.class5;

import java.util.Scanner;

public class Rectangle extends Person {
    int a;
    int b;
    private float acreage;

    @Override
    public void inputDate() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter edge a: ");
//        this.a = input.nextInt();
//        System.out.print("Enter edge b: ");
//        this.b = input.nextInt();

    }
    @Override
    public void inputDate(int a,int b,int c) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void inputDate(int r) {

    }

    @Override
    public void acreage() {

        acreage = (a*b);
        System.out.println("Acreage a Rectangle: "+acreage);
    }

    @Override
    public float getAcreage() {
        return acreage;
    }

}
