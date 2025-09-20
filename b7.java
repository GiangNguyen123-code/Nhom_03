import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu co trong mang: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Nhap cac phan tu trong mang: ");
        for(int i = 0 ; i < n; i++){
            System.out.println("a[" + i + "]");
            arr[i] = sc.nextInt();
        }
        int tg = 0;
        for(int i = 0; i < n; i++){
            tg += arr[i];
        }
        System.out.println("Tong cac phan tu co trong mang la: " + tg);
    }
}
