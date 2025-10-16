import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //bt1 tinh giai thua
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("giai thua k co so am");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
    }
}
