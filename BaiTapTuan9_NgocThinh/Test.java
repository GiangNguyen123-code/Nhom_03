import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        quanLy.capNhatSach("GT01"); 
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hien thi danh sach");
            System.out.println("2. Them sach");
            System.out.println("3. Tim kiem sach theo ma");
            System.out.println("4. Xoa sach");
            System.out.println("5. Cap nhat sach");
            System.out.println("6. Kiem ke kho");
            System.out.println("7. Cap nhat vi tri sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:  quanLy.hienThiSach();break;
                case 2: quanLy.themSach();break;
                case 3: {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    quanLy.timKiemSach(ma);
                    break;
                }
                case 4: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    quanLy.xoaSach(ma);
                    break;
                }
                case 5: {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String ma = sc.nextLine();
                    quanLy.capNhatSach(ma);
                    break;
                }
                case 6: quanLy.kiemKeSach();break;
                case 7: {
                    System.out.print("Nhap ma sach can cap nhat vi tri: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap vi tri moi: ");
                    String vt = sc.nextLine();
                    quanLy.capNhatViTriSach(ma, vt);
                    break;
                }
                case 0: System.out.println("Thoat chuong trinh...");break;
                default: System.out.println("Lua chon khong hop le!");break;
            }

        } while (chon != 0);
    }
}
