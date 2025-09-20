import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int tg = 0;
        for(int i = 1; i <= n; i++){
            tg = tg + i;
        }
        System.out.println("Tong tu 1 den " + n + " la " + tg);
    }
}
