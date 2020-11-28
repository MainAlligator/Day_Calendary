package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = s.nextInt();

        System.out.println("Введите номер месяца: ");
        int month = s.nextInt();
        switch (month) {
            case 1:
                System.out.println(" В Январе");
                break;
            case 2:
                System.out.println("В Феврале ");
                break;
            case 3:
                System.out.println("В Марте ");
                break;
            case 4:
                System.out.println("В Апреле");
                break;
            case 5:
                System.out.println("В Мае");
                break;
            case 6:
                System.out.println("В Июне");
                break;
            case 7:
                System.out.println("В Июле");
                break;
            case 8:
                System.out.println("В Августе");
                break;
            case 9:
                System.out.println("В Сентябре");
                break;
            case 10:
                System.out.println("В Октябре");
                break;
            case 11:
                System.out.println("В Ноябре");
                break;
            case 12:
                System.out.println("В Декабре");
                break;
            default:
                System.out.println("Ошибка");
                break;
        }

        if (month <= 0 && month > 12) {
            System.out.println("Вы ввели не правильный месяц");
            return;
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(year + " года : 31 день");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(year + " года : 30 дней");
        } else {
            if (month == 2) {
                if (year % 400 == 0 && year % 100 == 0) {
                    System.out.println(year + " года : 29 дней");
                } else {
                    if (year % 4 == 0 && year % 100 != 0) {
                        System.out.println(year + " года : 29 дней");
                    } else
                        System.out.println(year + " года : 28 дней");
                }
            }


        }
    }
}

