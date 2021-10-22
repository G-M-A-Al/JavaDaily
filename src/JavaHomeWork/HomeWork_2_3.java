package JavaHomeWork;

import java.util.Arrays;
import java.util.Scanner;

        /*
        * 编写一个程序，实现打印输出字符串数组中最大值和最小值。
        * 提示：按照字典顺序决定字符串的最大值和最小值，
        * 字典中排在后面的大于前面的
        * */

public class HomeWork_2_3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter String:");

        String string = input.nextLine();
        char arr[] = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            arr[i] = string.charAt(i);
            Arrays.sort(arr);
            System.out.println("最大值为  " + arr[string.length() - 1]);
            System.out.println("最小值为  "+arr[0]);
        }
    }
}
