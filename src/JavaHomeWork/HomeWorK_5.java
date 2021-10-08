package JavaHomeWork;

        /*(Displaying pyramid) Write a program that prompts the user to
         enter an integer from 1 to 15 and displays a pyramid

         第三章第十二题（Java课 2021.09.29早上）;
         */

import java.util.*;
public class HomeWorK_5 {

      static Scanner UserInput = new Scanner(System.in);

      public static void main(String[] args)
      {

          System.out.print("Please enter the number of lines:");
          int lines = UserInput.nextInt();

          int rows = 1;
          for (; rows <= lines; rows++)
          {
              for (int i = lines - rows; i >= 1; i--)
              {
                  System.out.print("  ");
              }
              for (int x = rows; x >= 2; x--)
              {
                  System.out.print(x + " ");
              }
              for (int y = 1 ; y <= rows; y++)
              {
                  System.out.print(y +" ");
              }
              System.out.println();
          }

      }
}
