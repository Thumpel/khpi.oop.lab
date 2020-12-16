package com.company;

/**
 * Лабораторная работа №2
 * @author Dmytro Yermakov
 */
public class Main {
    static int num = 0;
    static int oz = 0;
    static int zo = 0;

    public static void main(String[] args) {
        table_line();
        name();
        int a = 0;
        while (a < 10) {
            num = (int) (Math.random() * 100);
            oz = 0;
            zo = 0;
            a++;
            count();
            print();
        }
    }
    public static void print()
    {
        String number = Integer.toBinaryString(num);
        String n1="|";
        String n2="";
        System.out.printf("%s",n1);
        System.out.printf("%15s",n2+num);
        System.out.printf("%12s",n1);
        for(int v = 0; v < 9; v++){
            System.out.print("");
        }
        System.out.printf("%7s",n2 + oz);
        System.out.printf("%7s",n1);
        for(int v = 0; v < 15; v++){
            System.out.print("");
        }
        System.out.printf("%8s",n2 + zo);
        System.out.printf("%6s",n1);
        for(int v = 0; v < 15; v++){
            System.out.printf("%s",n2);
        }
        System.out.printf("%14s",n2 + number);
        System.out.printf("%11s",n1);
        System.out.println();

        table_line();
    }
    public static void name()
    {
        String s1="Число в десятичной системе";
        String s2="Комбинация 10";
        String s3="Комбинация 01";
        String s4="Число в двоичной системе";
        System.out.printf("|"+"%s",s1 + "|");
        System.out.printf("%s",s2 + "|");
        System.out.printf("%s",s3 + "|");
        System.out.println(s4+"|");
        System.out.println("_____________________________________________________________________________________________________");
    }
    public static void table_line()
    {
        for (int bdb = 0; bdb < 30; bdb++) {
            System.out.print("-");
        }

        for (int bdb = 0; bdb < 30; bdb++) {
            System.out.print("-");
        }

        for (int bdb = 0; bdb < 30; bdb++) {
            System.out.print("-");
        }

        for (int bdb = 0; bdb < 11; bdb++) {
            System.out.print("-");
        }
        System.out.println();



    }
    public static int count() {
        int number = num;
        int s = 0;
        int c = 0;
        int bin = number;
        for(int v = 0; number!=0; v++){
            if(v<1) {
                s = number % 2;
                int s1 = 0;
                if (s != 0) {
                    s1 = (number - 1) / 2;
                } else {
                    s1 = number / 2;
                }
                number = s1;
            }
            c = number%2;
            int s2 = 0;
            if(c!=0){
                s2 = (number-1)/2;
            }else{
                s2 = number/2;
            }
            number = s2;
            check(s, c);
            s = c;
        }
        int temp = oz;
        oz = zo;
        zo = temp;
        return bin;
    }
    public static void check ( int a, int b){
            if (a == 1) {
                if (b == 0) {
                    oz++;
                }
            }
            if (a == 0) {
                if (b == 1) {
                    zo++;
                }
            }
        }
    }
































