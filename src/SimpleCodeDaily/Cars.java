package SimpleCodeDaily;

import java.util.Scanner;

public class Cars {
//
        String name ;
        String color;
        String types ;
        short mode;
        int carPrice;

        void CarsInfo (){
            System.out.println();
            System.out.println("name: " +name);
            System.out.println("color: " + color);
            System.out.println("types: " +types);
            System.out.println("mode: " +mode);
            System.out.println("Price: " +carPrice);
            System.out.println();


        }

        public static void main(String[] args){


            Scanner carPrice = new Scanner(System.in);
            try {
                System.out.print("Enter Car Price:");
                int Price_1 = carPrice.nextInt();

                System.out.print("Enter Car Price:");
                int Price_2 = carPrice.nextInt();

                System.out.print("EEnter Car Price:");
                int Price_3 = carPrice.nextInt();

                System.out.print("Enter Car Price:");
                int Price_4 = carPrice.nextInt();


                Cars c1 = new Cars();
                Cars c2 = new Cars();
                Cars c3 = new Cars();
                Cars c4 = new Cars();

                c1.name = "Mercedes";
                c1.color = "Black";
                c1.types = "Sports Car";
                c1.mode = 2021;
                c1.carPrice = Price_1;

                c2.name = "Toyota";
                c2.color = "white";
                c2.types = "Sports Car";
                c2.mode = 2021;
                c2.carPrice = Price_2;

                c3.name = "Bentley";
                c3.color = "Blue";
                c3.types = "Sports Car";
                c3.mode = 2021;
                c3.carPrice = Price_3;

                c4.name = "tesla";
                c4.color = "Red";
                c4.types = "Sports Car";
                c4.mode = 2021;
                c4.carPrice = Price_4;

                c1.CarsInfo();
                c2.CarsInfo();
                c3.CarsInfo();
                c4.CarsInfo();
            }
            catch(Exception e){
                System.out.println(e.toString());
            }finally {
                carPrice.close();
            }

        }
}
