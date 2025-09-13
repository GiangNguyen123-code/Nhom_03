import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tien gui: ");
        double tienGui = sc.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThang = sc.nextInt();

        double laiSuatThang = laiSuatNam / 12 / 100;
        double tienLai = tienGui * laiSuatThang * soThang;
        double tongTien = tienGui + tienLai;

        System.out.println("Tien lai nhan duoc: " + tienLai);
        System.out.println("Tong so tien: " + tongTien);
    }
}
