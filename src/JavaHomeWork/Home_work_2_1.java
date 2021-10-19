package JavaHomeWork;

import java.util.Scanner;

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
