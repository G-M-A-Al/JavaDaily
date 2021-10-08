package JavaHomeWork;
      /*用Java语言编写程序，然后对用户输入的一个分数（分别输入分子和分母）进行约分，并且输出约分后的分数（分别输出分子和分母）。
      例如输入分子为6并且分母为12，那么输出结果为1/2。
      */
      //第三章第九题（Java课 2021.09.29早上）;
import java.util.*;

public class HomeWork_2 {
          public static void main(String[] args) {

              Scanner num = new Scanner(System.in);
              System.out.println("x = ");
              int x = num.nextInt();

              System.out.println("y = ");
              int y = num.nextInt();

              int number ;
              if (x < y)
              {
                  number = x ;
              } else
              {
                  number = y;
              }
              for (int i = number; i >= 2; i--)
              {
                  if ( x % i == 0 && y % i == 0)
                  {
                      x /= i;
                      y /= i;
                      System.out.println(x + "/" + y);
                  }
              }

          }
}
