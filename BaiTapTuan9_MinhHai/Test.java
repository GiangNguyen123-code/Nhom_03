import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();
        int choice;

        do {
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Tim kiem sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Hien thi danh sach sach");
            System.out.println("6. Kiem tra ton kho");
            System.out.println("7. Cap nhat vi tri sach");
            System.out.println("8. Tinh gia ban sach");
            System.out.println("9. Sap xep sach theo gia ban");
            System.out.println("10. Dem so luong tung loai sach");
            System.out.println("11. Tinh tong gia tri ton kho");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    SachGiaoTrinh sg = new SachGiaoTrinh();
                    sg.Nhap();
                    quanLy.themSach(sg);
                    break;
                }
                case 2: {
                    SachTieuThuyet st = new SachTieuThuyet();
                    st.Nhap();
                    quanLy.themSach(st);
                    break;
                }
                case 3: {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.println("Tim thay sach:");
                        s.Xuat();
                    } else {
                        System.out.println("Khong tim thay sach voi ma: " + ma);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    quanLy.xoaSach(ma);
                    break;
                }
                case 5: {
                    quanLy.hienThiDanhSach();
                    break;
                }
                case 6: {
                    System.out.print("Nhap ma sach can kiem tra ton kho: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.print("Nhap so luong toi thieu: ");
                        int sl = sc.nextInt();
                        sc.nextLine();
                        if (s.kiemTraTonKho(sl))
                            System.out.println("Sach du ton kho.");
                        else
                            System.out.println("Sach khong du ton kho.");
                    } else {
                        System.out.println("Khong tim thay sach voi ma: " + ma);
                    }
                    break;
                }
                case 7: {
                    System.out.print("Nhap ma sach can cap nhat vi tri: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.print("Nhap vi tri moi: ");
                        String vt = sc.nextLine();
                        s.capNhatViTri(vt);
                    } else {
                        System.out.println("Khong tim thay sach voi ma: " + ma);
                    }
                    break;
                }
                case 8: {
                    System.out.print("Nhap ma sach can tinh gia ban: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.println("Gia ban cua sach la: " + s.tinhGiaBan() + " VND");
                    } else {
                        System.out.println("Khong tim thay sach voi ma: " + ma);
                    }
                    break;
                }
                case 9: {
                    ((QuanLySachImpl) quanLy).sapXepTheoGiaBan();
                    break;
                }
                case 10: {
                    ((QuanLySachImpl) quanLy).demSoLuongTheoLoai();
                    break;
                }
                case 11: {
                    ((QuanLySachImpl) quanLy).tinhTongGiaTriTonKho();
                    break;
                }
                case 0:
                    System.out.println("Thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);

        sc.close();
    }
}
