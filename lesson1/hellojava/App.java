import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a = 10;
        double b = 10.5;
        final int PI = 4;
        boolean isAdmin = true;
        String message = " HEllo";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a number y: ");
        int y = Integer.parseInt(scanner.nextLine());
        int num = x + y;
        System.out.println(num);
        System.out.println("Hello World!");
    }
}
