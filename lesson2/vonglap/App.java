import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Bài tập 1: Tính giai thừa nhiều lần
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập số nguyên n (0 để thoát): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Thoát chương trình.");
                break; // thoát khỏi vòng lặp while
            }

            if (n < 0) {
                System.out.println("❌ Giai thừa không xác định cho số âm!");
                continue; // quay lại nhập lại số khác
            }

            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("✅ " + n + "! = " + factorial);
        }

        sc.close(); // đóng Scanner
    }
}
