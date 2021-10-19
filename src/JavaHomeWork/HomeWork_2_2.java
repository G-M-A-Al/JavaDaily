package JavaHomeWork;

import java.util.Scanner;

public class HomeWork_2_2 {

    public static void main(String[] args) {
        double score[] = new double[50];

        Scanner input= new Scanner(System.in);
        System.out.println("please enter student scores:");
        int oneHundred = 0, ninety = 0, eighty = 0, seventy = 0, sixty = 0, failed = 0;
        for (int i = 0; i < score.length; i++)
            score[i] = input.nextInt();

        for (int i = 0; i < score.length; i++) {
            if (score[i] == 100) {
                oneHundred++;
            }else if (score[i] >= 90 && score[i] <= 99){
                ninety++;
            }else if (score[i] >= 80 && score[i] <= 89){
                ninety++;
            }else if (score[i] >= 70 && score[i] <= 79){
                seventy++;
            }else if (score[i] >= 60 && score[i] <= 69){
                sixty++;
            }else if (score[i] < 60){
                failed++;
            }
        }
        System.out.println("100分有：" + oneHundred);
         System.out.println("90-99分有：" + ninety);
        System.out.println("80-89分有：" + eighty);
        System.out.println("70-79分有：" + seventy);
        System.out.println("60-69分有：" + sixty);
        System.out.println("不及格有：" + failed);
    }
}

