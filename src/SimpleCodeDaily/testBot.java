package SimpleCodeDaily;

public class testBot {

        public static void main(String[] args) {

            Robot robot1 = new Robot("BotOne", "red", 30,"Global");
            Robot robot2 = new Robot("BotTwo", "blue", 40, "Global");

            robot1.introduceSelf();
            robot2.introduceSelf();
        }
    }
//
    class Robot {

        String name;
        String color;
        int weight;
        String contry;

        Robot(String givenName, String givenColor, int givenWeight , String giveContry)
        {
            this.name = givenName;
            this.color = givenColor;
            this.weight = givenWeight;
            this.contry = giveContry;

        }

        void introduceSelf()
        {
            System.out.println("My name is " + this.name);
            System.out.println("My color is " + this.color);
            System.out.println("My weight is " + this.weight);
            System.out.println("I'm from " + this.contry);
        }
}
