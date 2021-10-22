package JavaHomeWork;

import java.util.Scanner;

            /*
            * .声明一个数组，保存一个学生的数学、语文、英语、物理、化学等课程的成绩，
            * 编写一个程序，计算5门课程的平均成绩，精确到0.1分，成绩值从键盘录入
            * */

public class Home_work_2_1 {


    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String [] subjects = {"Math", "English","Language","Chemical","physics"};
        double [] score = new  double[5];
        double sumScore = 0.0 , ave = 0.0;

        for (int i = 0; i < subjects.length ; i++) {

            System.out.println("Please enter "+  subjects[i] +" subject score:");
            score[i]  = input.nextDouble();
            sumScore += score[i];
        }

        ave = sumScore / 5;
        System.out.println("Average score is "+ ave);

    }
}
