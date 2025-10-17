import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanlisach ql = new quanlisach();
        sachgiaotrinh sg = new sachgiaotrinh("GT01", "Giao trinh Java", "Nguyen Van A", 2020, 150, "Lap trinh", "Dai hoc", 80000);
        sachtieuthuyet st = new sachtieuthuyet("TT01", "Harry Potter", "J.K. Rowling", 2010, 50, "Fantasy", true, 120000);

        ql.themsach(sg);
        ql.themsach(st);
        System.out.println("=== DANH SACH SACH KHOI TAO ===");
        ql.hienthisach();
        System.out.println("\n=== KIEM TRA GIAO DIEN ===");
        IKiemKe kiemKe = sg; 
        System.out.println("Kiem tra ton kho >=100: " + (kiemKe.kiemTraTonKho(100) ? "Co" : "Khong"));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
        int luachon;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. them sach.");
            System.out.println("2. xoa sach");
            System.out.println("3. hien thi sach.");
            System.out.println("4. cap nhat sach.");
            System.out.println("5. tim kiem sach.");
            System.out.println("6. kiem ke sach");
            System.out.println("7. cap nhat vi tri sach");
            System.out.println("0. thoat chuong trinh.");
            System.out.print("Xin moi nhap lua chon: ");
            luachon = Integer.parseInt(sc.nextLine().trim());
            switch (luachon) {
                case 1: ql.themsach(); break;
                case 2: ql.xoasach(); break;
                case 3: ql.hienthisach(); break;
                case 4: ql.capnhatsach(); break;
                case 5: ql.timkiemsach(); break;
                case 6: ql.kiemKeSach(); break;
                case 7: ql.capNhatViTriSach(); break;
                case 0: System.out.println("--Thoat chuong trinh--"); break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (luachon != 0);

        sc.close();
    }
}
