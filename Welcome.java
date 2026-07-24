import java.util.Scanner;

public class Welcome{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first_name = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String last_name = scanner.nextLine();

        System.out.printf("Welcome to the Second Year %s %s!\n", first_name, last_name);

        scanner.close();
    }
}