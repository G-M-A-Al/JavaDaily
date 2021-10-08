package JavaHomeWork;

           /*
           *(Displaying calendars) Write a program that prompts the user to enter the year and
            first day of the year and displays the calendar table for the year on the console. For
            example, if the user entered the year 2005, and 6 for Saturday, January 1, 2005,
            your program should display the calendar for each month in the year
            *
            * 第三章第十二题（java课 2021.09.29早上）;
            */

import java.util.*;
public class HomeWork_6 {

    //  第三章第十二题（java课 2021.09.29早上）;
    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);

        System.out.print("Please enter a year :");
        int year = UserInput.nextInt();


        System.out.print("Please enter the first day of the year : ");
        int oneDay = UserInput.nextInt();

        int monthDays = 0;

        int month = 1;
        while (month <= 12){
            System.out.println("        ");
            month++;
            switch (month)
            {
                case 1:
                    System.out.println("January " + year);
                    monthDays = 31;
                    break;
                case 2:
                    System.out.println("February " + year);
                    // كل اربع سنوات  يكون 29 يوم (2000 - 2004 _ 2008 _ 2012 _ 2016 _ 2020)
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                        monthDays = 29 ;
                    }else {
                        monthDays = 28;
                    }
                    break;
                case 3:
                    System.out.println("March " + year);
                    monthDays = 31;
                    break;
                case 4:
                    System.out.println("April " + year);
                    monthDays = 30;
                    break;
                case 5:
                    System.out.println("May " + year);
                    monthDays = 31;
                    break;
                case 6:
                    System.out.println("June " + year);
                    monthDays = 30;
                    break;
                case 7:
                    System.out.println("July " + year);
                    monthDays = 31;
                    break;
                case 8:
                    System.out.println("August " + year);
                    monthDays = 31;
                    break;
                case 9:
                    System.out.println("September " + year);
                    monthDays = 30;
                    break;
                case 10:
                    System.out.println("October " + year);
                    monthDays = 31;
                    break;
                case 11:
                    System.out.println("November " + year);
                    monthDays = 30;
                    break;
                case 12:
                    System.out.println("December " + year);
                    monthDays = 31;
                    break;
            }
            System.out.println("——————————————————————————————————");
            System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < oneDay; i++) {
                System.out.print("    ");
            }
            for (int i = 1; i <= monthDays; i++) {
                if (i < 10) {
                    System.out.print("   " + i);
                }else {
                    System.out.print("  " + i);
                }
                if ((i + oneDay) % 7 == 0) {
                    System.out.println();
                }
                System.out.print("");

                oneDay = (oneDay + monthDays) % 7;

            }
            System.out.print("  ...");
            break;
        }
    }

}
