package JavaHomeWork;

        /*用Java语言编写程序，计算e=1+1/1! +2/2! +……+n/n!。要求e值精确到小数点第5位。
         第三章第十题（Java课 2021.09.29早上）; */

import java.util.*;
public class Homework_3 {
        static int nubmer(int x)
        {
            int j = 1;
            for (; x > 0; x--)
            {
                j *= x;
            }
                return j;
        }

        static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {

            System.out.println("Please enter any number:");
            int y = input.nextInt();

            float result = 1;
            for (int i = 1; i <= y; i++)
            {
                result += i * 1.0 / nubmer(i);
            }
            System.out.printf("result = %.5f ", result);
        }
}
