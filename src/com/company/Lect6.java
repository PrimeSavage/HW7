package com.company;

import java.util.Scanner;
//Задание 2 из 6 лекции
public class Lect6 {
    public static Scanner in = new Scanner(System.in);
    private double summ;
    private double kurs;

    public void getInput(){
        System.out.println("Введите сумму");
        summ = in.nextDouble();
        System.out.println("Введите курс");
        kurs = in.nextDouble();
    }

    private double getConvertedSum(){
        return summ/kurs;
    }

    public void Show(){
        System.out.println("Конвертированная сумма: " + getConvertedSum());
    }
}
