import java.util.Scanner;

public class bai5 {
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Nhap vao mot so nguyen (nhap 0 de thoat): ");
            n = sc.nextInt();

            if (n == 0) {
                System.out.println("Thoat chuong trinh.");
                break;
            }

            if (laSoNguyenTo(n)) {
                System.out.println(n + " la so nguyen to.");
            } else {
                System.out.println(n + " khong phai la so nguyen to.");
            }
        }

        sc.close();
    }
}