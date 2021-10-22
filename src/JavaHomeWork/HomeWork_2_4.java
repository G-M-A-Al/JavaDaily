package JavaHomeWork;

import java.util.Scanner;
                /*
                * 使用键盘输入一个字符串，编写程序统计这个字符串中的字母、
                * 空格和数字的个数。
                * */
public class HomeWork_2_4 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         int alphabet = 0, numbers = 0, space = 0;

        System.out.println("Please enter string(A~Z,a~z,0~9,and space):");

        String string = input.nextLine();
        int i = 0;
        for (; i < string.length(); i++) {
            char arr = string.charAt(i);
            if ((arr >= 'a' && arr <= 'z') || (arr >= 'A' && arr <= 'Z')){
                alphabet++;
            }else if(arr >= '0' && arr <= '9') {
                numbers++;
            }else if (arr == ' '){
                space++;
            }else {
                System.out.println("you enter the data have error!");
            }

        }
        System.out.println("Alphabet the number :"+ alphabet);
        System.out.println("number in string:" + numbers);
        System.out.println("Space in string:" + space);

    }
}
