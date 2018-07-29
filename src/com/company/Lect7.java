package com.company;

import java.util.Scanner;
//Задание с дробями из 7 лекции. Хотел ещё сделать работу конкретно с дробями вида 1\2 но не вышло.
public class Lect7 {
    private int enumer;
    private int denumer;
    private double[] buff = new double[3];
    public static Scanner in = new Scanner(System.in);
    private int getFraction(){
        return enumer/denumer;
    }
    private double getInversed(){
        return 1/getResult();
    }
    public void getInput(){
        for(int i=0; i<3; i++){
            System.out.println("введите числитель");
        enumer = in.nextInt();
            System.out.println("введите знаменатель");
        denumer = in.nextInt();
        buff[i] = getFraction();
        }
    }
    public void Show(){
        System.out.println("Результат: " + getResult() + "Инверсия: " + getInversed());
    }
    private double getResult(){
        return (buff[0]+buff[1])*(buff[0]+buff[2]);
    }
}
