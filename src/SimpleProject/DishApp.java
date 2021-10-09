package SimpleProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DishApp {

    // قائمة لتخزين الاطعمة
    static List<Dish> dishList = new ArrayList<>();
    // قائمة لتخزين المطلوبات من قبل العميل
    static List<Dish> personDish = new ArrayList<>();

    public static void main(String[] args) {
        initDish();
        Scanner s = new Scanner(System.in);
        while (true)
        {

            showMenu();
            int num = s.nextInt();
            switch (num){
                case 1:
                    while (true)
                    {
                        showDishMenu();
                        int id = s.nextInt();
                        if (id == 0)
                        {
                            break;
                        }
                        //من اجل تعديل الاندكس  نجعلة ينقص واحد (0 1 2 3 4 )
                        // 1 2 3 4 5 الارقام التي سوف يقوم العميل بادخالها
                        Dish dish  =   dishList.get(id - 1);
                        System.out.println("You have ordered" + dish.name + "dishes");
                        personDish.add(dish);
                    }
                case 2:
                    showPersonDish();
                    break;
                case 3:
                    buy();
                    return;
            }
        }
    }


    public static void showDishMenu(){
        System.out.println("----Please order----");
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish = dishList.get(i);
            System.out.println(dish.id+"\t"+dish.name+"\t"+dish.price);

        }
        System.out.println("------Enter the number for order，enter Zero for back-----");
    }

    public static void showPersonDish(){
        System.out.println("----You have ordered this dish----");
        for (Dish dish : personDish) {
            System.out.println(dish.id+"\t"+dish.name+"\t"+dish.price);
        }
    }
    public static void buy(){
        System.out.println("-----Please wait a moment, calculating-----");
        double total = 0f;
        for (Dish dish : personDish) {
            total += dish.price;
        }
        System.out.println("Your current consumption is " + total + "$");
    }

    public static void showMenu() {
        System.out.println("------Menu--------");
        System.out.println("Menu\t\t 1");
        System.out.println("Ordered\t\t 2");
        System.out.println("Pay the bill\t 3");
        System.out.println("please choose——————————");
    }
    public static void initDish() {
        Dish dish = new Dish(1,"Cobb salad" , 10.9);
        dishList.add(dish);
        Dish dish2 = new Dish(2,"Pot roast" , 60.8);
        dishList.add(dish2);

        dishList.add(new Dish(3, "Jerky" , 20.5));
        dishList.add(new Dish(4, "Fajitas" , 40.7));
        dishList.add(new Dish(5, "Banana split" , 3.5));

    }
}
