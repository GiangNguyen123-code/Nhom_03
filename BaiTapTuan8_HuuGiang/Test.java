package BookManager;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLySachImpl qlSach = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Quan ly sach =====");
            System.out.println("1. Them moi sach");
            System.out.println("2. Xoa sach");
            System.out.println("3. Hien thi sach giao trinh");
            System.out.println("4. Hien thi sach tieu thuyet");
            System.out.println("5. Tim kiem sach");
            System.out.println("6.Cap nhat thong tin sach");
            System.out.println("7: Kiem Ke ton kho");
            System.out.println("8: Cap nhat vi tri sach");
            System.out.println("9.Tinh gia ban sach");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    qlSach.themMoiSach();
                    break;
                case 2:
                    qlSach.xoaSach();
                    break;
                case 3:
                    qlSach.hienThiDanhSach();
                    break;
                case 4:
                    qlSach.hienThiDanhSach();
                    break;
                case 5:
                    qlSach.timKiemSach();
                    break;
                case 6:
                    qlSach.capnhatSach();
                    break;
                case 7:
                    System.out.print("Nhap ma sach can kiem ke: ");
                    String ma = sc.nextLine();
                    qlSach.kiemKeTonKho(ma);
                    break;
                case 8:
                    System.out.print("Nhap ma sach can cap nhat vi tri: ");
                    String maSach = sc.nextLine();
                    qlSach.capNhatViTriSach(maSach);
                    break;
                case 9:
                    qlSach.tinhGiaBan();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh...");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
