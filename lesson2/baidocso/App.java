import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number (1–99): ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("❌ Please enter a number between 1 and 99.");
            scanner.close();
            return;
        }

        // Nếu số nhỏ hơn 10 → đọc đơn vị
        if (number < 10) {
            switch (number) {
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        }
        // Nếu số là 10–19 → đọc đặc biệt
        else if (number < 20) {
            switch (number) {
                case 10 -> System.out.println("Ten");
                case 11 -> System.out.println("Eleven");
                case 12 -> System.out.println("Twelve");
                case 13 -> System.out.println("Thirteen");
                case 14 -> System.out.println("Fourteen");
                case 15 -> System.out.println("Fifteen");
                case 16 -> System.out.println("Sixteen");
                case 17 -> System.out.println("Seventeen");
                case 18 -> System.out.println("Eighteen");
                case 19 -> System.out.println("Nineteen");
            }
        }
        // Số >= 20
        else {
            int tens = number / 10;   // phần chục
            int ones = number % 10;   // phần đơn vị

            // Đọc phần chục
            switch (tens) {
                case 2 -> System.out.print("Twenty");
                case 3 -> System.out.print("Thirty");
                case 4 -> System.out.print("Forty");
                case 5 -> System.out.print("Fifty");
                case 6 -> System.out.print("Sixty");
                case 7 -> System.out.print("Seventy");
                case 8 -> System.out.print("Eighty");
                case 9 -> System.out.print("Ninety");
            }

            // Nếu có phần đơn vị thì thêm khoảng trắng + tên
            if (ones != 0) {
                System.out.print(" ");
                switch (ones) {
                    case 1 -> System.out.print("One");
                    case 2 -> System.out.print("Two");
                    case 3 -> System.out.print("Three");
                    case 4 -> System.out.print("Four");
                    case 5 -> System.out.print("Five");
                    case 6 -> System.out.print("Six");
                    case 7 -> System.out.print("Seven");
                    case 8 -> System.out.print("Eight");
                    case 9 -> System.out.print("Nine");
                }
            }

            System.out.println(); // xuống dòng
        }

        System.out.println("Your number is: " + number);
        scanner.close();
    }
}
