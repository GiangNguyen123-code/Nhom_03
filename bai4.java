package BAITAP;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tiền gửi: ");
        double tienGui = sc.nextDouble();
        System.out.print("Nhập lãi suất hàng năm (%): ");
        double laiSuatNam = sc.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        int soThang = sc.nextInt();

        double laiSuatThang = laiSuatNam / 12 / 100;
        double tienLai = tienGui * laiSuatThang * soThang;
        double tongTien = tienGui + tienLai;

        System.out.println("Số tiền lãi: " + tienLai);
        System.out.println("Tổng tiền cuối kỳ: " + tongTien);
    }
}
