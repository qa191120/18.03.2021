package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    static Scanner s = new Scanner(System.in);
    public static int getNumberFromUser()
    {
        while (true) {
            String number_string = s.next();
            try {
                int result = Integer.valueOf(number_string);
                return result; // here only if previous line succeeded
            } catch (Exception ex) // safety net
            {
                System.out.println("number format was wrong... please try again");
            }
        }
    }

    public static void main(String[] args) {
        int number = getNumberFromUser();

        try {
            foo();
            System.out.println("Hello...");
        }
        catch (Exception e)
        {
            System.out.println("was safely caught in main...");
        }
        System.out.println("hello there ...");
    }
    private static void foo() {
        int a = 1;
        int b = 0;
        goo(a, b);
    }
    private static void goo(int a, int b) {
        int c = a / b;
    }

}
