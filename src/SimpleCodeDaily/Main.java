package SimpleCodeDaily;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
//
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        String password;

        try {
            System.out.print("User Name: ");
            name = input.next();

            System.out.print("Password: ");
            password = input.next();

            FileWriter fw = new FileWriter("users.txt", true);

            fw.write("User Name: " +name + "\n");
            fw.write("Password: " + password + "\n\n");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader("users.txt");

            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char)c);
            }
            fr.close();
        }
        catch (Exception e) {
            System.out.print(e.toString());
        }
        finally {
            input.close();
        }

    }

}
