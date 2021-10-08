package JavaHomeWork;

       /*. (Finding the factors of an integer) Write a program that reads an integer and
           dis_x0002_plays all its smallest factors in increasing order. For example,
           if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.

           第三章第十一题（Java课 2021.09.29早上）;
       */

import java.util.*;

public class HomeWork_4 {
    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

         System.out.print("Please enter any nubmer:");
         int num = userInput.nextInt();

         int result = 2;

         while (num / result != 1)
         {
             if (num % result == 0)
             {
                 System.out.print(result + ",");
                 num = num / result;
             }
             else
             {
                 result ++;
             }
         }
         System.out.println(num+".");
    }
}
