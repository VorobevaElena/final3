package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите количество строк");
           int str=scan.nextInt();
           String[] strings= new String[str];
          for (int i = 0; i < strings.length; i++)
          {
              Scanner sc = new Scanner(System.in);
              System.out.println("Введите строку");
              strings[i]=sc.nextLine();
          }
          long max=0;
          int number=1;
            int i = 0;
            while (i < strings.length)
            {
                long a = strings[i].chars().distinct().count();
              if (max<a)
              {max=a;number=i;}
                i++;
            }
            System.out.println(strings[number]);
        }
        }
