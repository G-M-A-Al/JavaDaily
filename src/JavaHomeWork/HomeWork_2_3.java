package JavaHomeWork;

import java.util.Arrays;
import java.util.Scanner;

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
