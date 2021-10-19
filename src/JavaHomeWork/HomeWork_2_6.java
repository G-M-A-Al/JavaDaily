package JavaHomeWork;

              /*          编写程序，
              完成打印输出杨辉三角形（要求输出的格式应在屏幕的居中位置）*/

public class HomeWork_2_6 {

    public static int tringle(int num_1, int num_2){
        if (num_2 - 1 == 0 || num_2 == num_1) {
            return 1;
        }else {
            return tringle(num_1 -1 , num_2) + tringle(num_1 - 1, num_2 - 1);
        }
    }
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print("\t");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print(tringle(i,x) + "\t");
            }
            System.out.println();
        }
    }
}



