package com.company;

import java.util.Scanner;
//  Немного переделанное 5 задание из 6 лекции
public class Lect6_5 {
    private int[] mass = new int[10];
    private int userNumber;
    private Scanner in = new Scanner(System.in);
    private void getMass(){
        for (int i = 0; i < mass.length; i++) {
        mass[i] = ((int)(Math.random() * 20) - 10);
        System.out.print(mass[i] + "|");
        }
    }
    private boolean isNumberInMass(){
        for (int i=0; i<mass.length; i++){
            if(mass[i] == userNumber)
                return true;
        }return false;
    }
    public void getInput(){
        System.out.println("Я загадал 10 чисел, угадайте одно из загаданных чисел");
        userNumber = in.nextInt();
    }
    public void Show(){
        System.out.println(isNumberInMass()?"Я загадывал это число":"Я не загадывал это число");
    }
}
