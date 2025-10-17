import java.util.*;

public class Test {
    public static void main(String[] args) {
        QuanLySach keSach = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sach moi");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim kiem sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Cap nhat sach");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            String opt = sc.nextLine().trim();
            switch (opt) {
                case "1":
                    keSach.themMoi();
                    break;
                case "2":
                    keSach.hienThiDanhSachSach();
                    break;
                case "3":
                    System.out.print("Nhap ma sach can tim: ");
                    keSach.timKiemSach(sc.nextLine().trim());
                    break;
                case "4":
                    System.out.print("Nhap ma sach can xoa: ");
                    keSach.xoaSach(sc.nextLine().trim());
                    break;
                case "5":
                    System.out.print("Nhap ma sach can cap nhat: ");
                    keSach.capNhatSach(sc.nextLine().trim());
                    break;
                case "0":
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Chuc nang khong hop le!");
            }
        }
    }
}