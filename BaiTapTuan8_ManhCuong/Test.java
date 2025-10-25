import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            switch (choice) {
                case 1:
                    System.out.print("Ma sach: "); String maGT = sc.nextLine();
                    System.out.print("Tieu de: "); String tdGT = sc.nextLine();
                    System.out.print("Tac gia: "); String tgGT = sc.nextLine();
                    System.out.print("Nam XB: "); int namGT = sc.nextInt();
                    System.out.print("So luong: "); int slGT = sc.nextInt();
                    System.out.print("Gia co ban: "); double giaGT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Mon hoc: "); String mon = sc.nextLine();
                    System.out.print("Cap do: "); String cap = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(maGT, tdGT, tgGT, namGT, slGT, giaGT, mon, cap));
                    break;

                case 2:
                    System.out.print("Ma sach: "); String maTT = sc.nextLine();
                    System.out.print("Tieu de: "); String tdTT = sc.nextLine();
                    System.out.print("Tac gia: "); String tgTT = sc.nextLine();
                    System.out.print("Nam XB: "); int namTT = sc.nextInt();
                    System.out.print("So luong: "); int slTT = sc.nextInt();
                    System.out.print("Gia co ban: "); double giaTT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("The loai: "); String theLoai = sc.nextLine();
                    System.out.print("Co phai series? (true/false): "); boolean series = sc.nextBoolean();
                    quanLy.themSach(new SachTieuThuyet(maTT, tdTT, tgTT, namTT, slTT, giaTT, theLoai, series));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTK = sc.nextLine();
                    Sach found = quanLy.timKiemSach(maTK);
                    System.out.println(found != null ? found : "Khong tim thay!");
                    break;

                case 5:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maX = sc.nextLine();
                    quanLy.xoaSach(maX);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
