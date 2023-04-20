package com.class1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       do {
           System.out.println("============ Word Program =========");
           System.out.println("1. Count Word In File");
           System.out.println("2. Find File By Word");
           System.out.println("3. Exit");
           System.out.print("Choose: ");
           Scanner input = new Scanner(System.in);
           int sc = input.nextInt();

           switch (sc){
               case 1:{
                   FileManagement file = new FileManagement();
                   Scanner s = new Scanner(System.in);
                   File fileSource = new File("G:\\Aptech course\\SEM 1\\Logic building\\Bài tập\\bAITHI");
                    System.out.print("Enter word to find: ");
                    String word = s.nextLine();
                    try {
                        int count = file.countWord(fileSource, word);
                        if(count > 0) {
                            System.out.println(word + " found " + count + " times");
                        } else  {
                            System.out.println("Word not found");
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
               }
               break;
               case 2:{
                   FileManagement file = new FileManagement();
                   System.out.print("Enter word to find: ");
                   String word = input.nextLine();

                   File directory
                           = new File("G:\\Aptech course\\SEM 1\\Logic building\\Bài tập\\bAITHI");
                   try {
                       file.getFile(directory,word);
                   }catch (Exception e){
                       System.out.println(e.getMessage());
                   }

               }
               break;
               case 3:{
                   return ;
               }
           }

       }while (true);
    }
}