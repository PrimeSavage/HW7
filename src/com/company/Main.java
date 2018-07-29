package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int choose = getNumber();
        switch (choose){
            case 1:
                Lect7 fraction = new Lect7();
                fraction.getInput();
                fraction.Show();
                break;
            case 2:
                Lect6 convertion = new Lect6();
                convertion.getInput();
                convertion.Show();
                break;
            case 3:
                Lect6_5 check = new Lect6_5();
                check.getInput();
                check.Show();
                break;
                default:
                    break;
        }
    }
    static int getNumber(){

        int choose;
        while(true){
            try{
                System.out.println("Введите операцию: 1 - операция с дробями  2 - конвертер валют  3 - проверка содержания числа в массиве");
                choose = Integer.parseInt(in.readLine());
                return choose;}
            catch (NumberFormatException e){
                System.out.println("Введите цифру");
            }catch (IOException e){}
        }
    }
}
