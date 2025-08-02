
import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name:");
        name = sc.nextLine();
        System.out.println("Welcome " + name +"!");
    }
}

