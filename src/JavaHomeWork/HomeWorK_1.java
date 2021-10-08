package JavaHomeWork;

/*
 * Q1: 用Java语言编写程序，计算输入的两个整数的最大公约数（GCD）。
 * 采用经典的Euclid算法，方法是：用变量m和n存储两个数的值，
 * 如果n为0，程序结束，m的值为最大公约数；否则计算m除以n的余数，把n保存到m中，
 * 并且把余数保存到n。重复这个过程，每次都先判定n是否为0。
 */
// 第三章第八题（Java课 2021.09.29早上）;

public class HomeWorK_1 {

        public static void main(String[] args) {

           int n = 17;
           int m = 10;
           do
           {
               int num = n % m;
                m = n;
                n = num;
           } while (n != 0);

           System.out.println("GCD = " + m);
        }
}
