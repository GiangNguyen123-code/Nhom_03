import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();

        int luaChon;
        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm theo mã sách");
            System.out.println("5. Cập nhật sách theo mã");
            System.out.println("6. Xóa sách theo mã");
            System.out.println("0. Thoát chương trình");
            System.out.print(" Nhập lựa chọn: ");

            luaChon = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            switch (luaChon) {
                case 1 -> {
                    System.out.println("\n--- Nhập thông tin Sách Giáo Trình ---");
                    System.out.print("Mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cd = sc.nextLine();

                    SachGiaoTrinh sg = new SachGiaoTrinh(ma, td, tg, nam, sl, mh, cd);
                    ql.themSach(sg);
                    System.out.println(" Đã thêm Sách Giáo Trình!");
                }

                case 2 -> {
                    System.out.println("\n--- Nhập thông tin Sách Tiểu Thuyết ---");
                    System.out.print("Mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Có phải sách series không (true/false): ");
                    boolean series = sc.nextBoolean();

                    SachTieuThuyet st = new SachTieuThuyet(ma, td, tg, nam, sl, tl, series);
                    ql.themSach(st);
                    System.out.println(" Đã thêm Sách Tiểu Thuyết!");
                }

                case 3 -> {
                    System.out.println("\n===== DANH SÁCH SÁCH =====");
                    ql.hienThiDanhSach();
                }

                case 4 -> {
                    System.out.print("\nNhập mã sách cần tìm: ");
                    String ma = sc.nextLine();
                    Sach s = ql.timKiemTheoMa(ma);
                    if (s != null) {
                        System.out.println("\n Đã tìm thấy sách:");
                        System.out.println(s.toString());
                    } else {
                        System.out.println(" Không tìm thấy sách có mã: " + ma);
                    }
                }

                case 5 -> {
                    System.out.print("\nNhập mã sách cần cập nhật: ");
                    String ma = sc.nextLine();
                    System.out.print("Tiêu đề mới: ");
                    String td = sc.nextLine();
                    System.out.print("Tác giả mới: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản mới: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng mới: ");
                    int sl = sc.nextInt();
                    sc.nextLine();

                    Sach sachMoi = new Sach(ma, td, tg, nam, sl);
                    ql.capNhatSach(ma, sachMoi);
                }

                case 6 -> {
                    System.out.print("\nNhập mã sách cần xóa: ");
                    String ma = sc.nextLine();
                    ql.xoaSach(ma);
                }

                case 0 -> System.out.println(" Kết thúc chương trình!");
                default -> System.out.println(" Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);

        sc.close();
    }
}
