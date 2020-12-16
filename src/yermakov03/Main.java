package com.company;
import java.util.Scanner;



/**
 * Лабораторная работа №3
 * @author Дмитрий Ермаков
 * Группа КИТ-119в
 *
 */
class Helper {

    /**
     * Helper class,в котором есть статический метод
     * @param glas_and_sogl
     * @return
     */
    public static String lit(String glas_and_sogl) {
        /**
         * Код,где считаем предложние по количеству гласных и согласных.
         */
        String gla = "aeiouy";
        String sog = "bcdfghjklmnpqrstvwxz";
        String bb = " ";
        Scanner input = new Scanner(System.in);
        String a="Введите предложение-";
        String b=" Предложение ";
        String c=" Количество гласных:";
        String d=" Количество согласных:";
        String gl=" Количество гласных больше ";
        String sogl=" Количество согласных больше ";
        String ord="Количесвто гласных и согласных одниково";
        String st="|";
        System.out.printf("%s",a);
        bb = input.nextLine().toLowerCase();
        System.out.println("________________________________________________________________________________________________");
        char[] qq = bb.toCharArray();
        int kol_gla = 0;
        int kol_sog = 0;
        boolean volt = true;
        int m = 0;
        for (char v : qq) {
            if (volt == true) {
                m++;
                System.out.printf(st+m+"%s",b+st);
                volt = false;
            }
            if (v == '.') {

                if(kol_gla>kol_sog)
                {
                    System.out.printf(gl);
                }

                else
                {
                    System.out.printf(sogl+"%s",st);
                }


                System.out.printf(c+kol_gla);
                System.out.printf(st+d+kol_sog+"%s",st);
                System.out.println();
                 table();
                System.out.println();

                volt = true;
                kol_gla = 0;
                kol_sog = 0;
            }
            if (v != ' ' || v != '.') {
                int i = gla.lastIndexOf(v);
                if (i != -1) {
                    kol_gla++;
                }
                int j = sog.lastIndexOf(v);
                if (j != -1) {
                    kol_sog++;
                }
            }
        }
        return glas_and_sogl;
    }
    static void table()
    /**
     * Метод который строит таблицу
     */
    {
        for (int bdb = 0; bdb < 96; bdb++) {
            System.out.print("-");
        }
    }
}

class Main
{
    /**
     * Класс main,где вызываем метод из Helper class
     * @param args
     */
    public static void main(String[] args)
    {
        Helper.lit("Текст");
    }
}








