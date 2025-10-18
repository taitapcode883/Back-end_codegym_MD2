import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // mang 1 chieu
        int[] numbers = {1,2,3,4};
        int[] arr = new int[10];
        // 10 la so luong toi da cua mang

        // truy cap vao phan tu cua mang- truy cap thong qua index
        // lay gia tri
        int a = numbers[0];
        // gan lai gia tri
        numbers[0] = 10;

        // duyet mang
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // su dung vong lap for-each
        for(int item: numbers){
            System.out.println(item);
        }

        // mang 2 chieu
        int [][] list = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(list.length);

        int [][] arr1 = new int[3][4];

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("nhap vao phan tu o vi tri " + i + ":");
            int m = Integer.parseInt(sc.nextLine());
            array[i] = m;
            i++;
        }
        System.out.println(Arrays.toString(array));
        int sum = sumArray(array);
        System.out.println("tong gia tri cua cac phan tu trong mang: " + sum);
        int max = maxValue(array);
        int min = minValue(array);
        System.out.println("phan tu lon nhat la: " + max);
        System.out.println("phan tu nho nhat la: " + min);

    }

    //khai bao 1 phuong thuc tinh tong cac phan tu trong mang dau vao
    /*
    - ten phuong thuc: sumArray
    - tham so: int[] arr
    -kieu tra ve: int
    - acces modifier: public static
     */
    public static int sumArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    // viet phuon thuc tim gia tri lon nhat trong mang
    public static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    // viet phuon thuc tim gia tri nho nhat trong mang
    public static int minValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
