package JavaHomeWork;

import java.util.Scanner;

public class HomeWork_2_5  {
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args)   {
        System.out.println("please enter array length :");
        int string ;
        string = input.nextInt();
        int arr[] = new int[string];
        System.out.println("enter array elements (use space in between):");
        for (int i = 0; i < string; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("output:");
        for (int j = string -1; j >= 0 ; j--) {
                System.out.print(arr[j] + ",");
        }
    }
}
