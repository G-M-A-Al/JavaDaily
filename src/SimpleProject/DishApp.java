package SimpleProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DishApp {
    // 定义集合
    static List<Dish> dishList = new ArrayList<>();
    static List<Dish> personDish = new ArrayList<>();
    static List<DishType> dishType = new ArrayList<>();


    public static void main(String[] args) {
        initDish();
        // 五个菜
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
                        System.out.println("الطعام التي طلبته هو " + dish.name);
                        personDish.add(dish);
                    }
                case 2:
                    showPersonDish();
                    break;
                case 3:
                    while (true) {
                        showDishType();
                        int id = s.nextInt();
                        if (id == 0) {
                            break;
                        }
                        DishType Type = dishType.get(id - 1);
                        System.out.println("--------" + Type.name);
                    }

                    break;
                case 4:
                    buy();
                    return;

            }
        }
    }


    public static void showDishMenu(){
        System.out.println("----ممكن ان تطلب الطعام ----");
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish = dishList.get(i);
            System.out.println(dish.id+"\t"+dish.name+"\t"+dish.price);

        }
        System.out.println("------ادخل اي رقم للقيام بالمهام اعلاه , انقر 0 للخروج -----");
    }
    public  static  void  showDishType(){
        System.out.println("قائمة اللحوم");
        for (int i = 0; i < dishType.size(); i++) {
            DishType Type = dishType.get(i);
            System.out.println(Type.id+ "\t" + Type.name + "\t" + Type.price);
        }
    }
    public static void showPersonDish(){
        System.out.println("----الطعام الذي طلبته----");
        for (Dish dish : personDish) {
            System.out.println(dish.id+"\t"+dish.name+"\t"+dish.price);
        }
    }
    public static void buy(){
        System.out.println("-----انتظر لحضة من فضلك , جاري حساب -----");
        double total = 0f;
        for (Dish dish : personDish) {
            total += dish.price;
        }
        System.out.println("حسابك هذه المره = " + total + "رممبي ");
    }

    public static void showMenu() {
        System.out.println("------قائمة الطعام--------");
        System.out.println("'قائمه الطعام '\t\t 1");
        System.out.println("'قائمة المطلوبات'\t\t 2");
        System.out.println("'قائمة اللحوم '\t\t 3");
        System.out.println("'الحساب'\t\t 4");

        System.out.println("اختار من فضلك ——————————");
    }
    public static void initDish() {
        Dish dish = new Dish(1,"حنيذ" , 23.8);
        dishList.add(dish);
        Dish dish2 = new Dish(2,"مندي" , 89.8);
        dishList.add(dish2);

        dishList.add(new Dish(3, "ماء" , 1.99));
        dishList.add(new Dish(4, "كبسة" , 350.99));
        dishList.add(new Dish(5, "عصير" , 4.6));

        dishType.add(new DishType(1, "لحم غنم ", 300.4));
        dishType.add(new DishType(2 , "لحم بقر ", 200.3));
        dishType.add(new DishType(3, "لحم عجل ", 500.5));
    }

}