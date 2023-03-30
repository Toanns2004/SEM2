package com.class5;

public class Triangle extends Person{
    int a;
    int b;
    int c;
    private float sd;

    void Person(){
        this.a = 0;
        this.b=0;
        this.c=0;
    }

    @Override
    public void inputDate() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter edge a: ");
//        this.a = input.nextInt();
//        System.out.print("Enter edge b: ");
//        this.b = input.nextInt();
//        System.out.print("Enter edge c: ");
//        this.c = input.nextInt();

    }

    @Override
    public void inputDate(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c=c;

    }

    @Override
    public void inputDate(int r) {

    }


    @Override
    public void acreage() {
        float p = (float) (a+b+c)/2;
        sd =(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Acreage a Triangle "+sd);
    }

    @Override
    public float getAcreage() {
        return sd;
    }
}
