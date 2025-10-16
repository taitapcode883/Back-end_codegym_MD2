import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }else {
            int residual = number % 10;
            if (residual == 0) {
                switch (number) {
                    case 1:
                        System.out.println("ten");
                        break;
                    case 2:
                        System.out.println("twenty");
                        break;
                    case 3:
                        System.out.println("thirty");
                        break;
                    case 4:
                        System.out.println("forty");
                        break;
                    case 5:
                        System.out.println("fifty");
                        break;
                    case 6:
                        System.out.println("sixty");
                        break;
                    case 7:
                        System.out.println("seventy");
                        break;
                    case 8:
                        System.out.println("eighty");
                        break;
                    case 9:
                        System.out.println("ninety");
                        break;
                }
            }else{

                }
            }
        }
        System.out.println("Your number is: " + number);
    }
}
