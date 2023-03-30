package com.class5;

public class Circle extends Person {
    int r;
    private float acreage;

    @Override
    public void inputDate() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter edge r: ");
//        this.r = input.nextInt();
    }

    @Override
    public void inputDate(int a, int b, int c) {

    }

    @Override
    public void inputDate(int r) {
        this.r = r;

    }
    @Override
    public void acreage() {

        double acreage = Math.PI*(r*r);
        System.out.println("Acreage a Circle: "+acreage);
    }

    @Override
    public float getAcreage() {
        return acreage;
    }
}
