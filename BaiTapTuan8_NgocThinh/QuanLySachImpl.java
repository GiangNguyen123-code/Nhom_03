import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void themSach() {
        System.out.print("Nhap loai sach (1-Giao trinh, 2-Tieu thuyet): ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Tieu de: ");
        String td = sc.nextLine();
        System.out.print("Tac gia: ");
        String tg = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("So luong: ");
        int sl = Integer.parseInt(sc.nextLine());
        System.out.print("Gia co ban: ");
        double gia = Double.parseDouble(sc.nextLine());

        Sach sachMoi = null;

        if (loai == 1) {
            System.out.print("Mon hoc: ");
            String mon = sc.nextLine();
            System.out.print("Cap do: ");
            String cap = sc.nextLine();
            sachMoi = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mon, cap);
        } else if (loai == 2) {
            System.out.print("The loai: ");
            String tl = sc.nextLine();
            System.out.print("Thuoc series (true/false): ");
            boolean series = Boolean.parseBoolean(sc.nextLine());
            sachMoi = new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, series);
        } else {
            System.out.println("Loai sach khong hop le!");
            return;
        }

        danhSach.add(sachMoi);
        System.out.println(" Da them sach thanh cong!");
    }

    @Override
    public void hienThiSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }

    @Override
    public void timKiemSach(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                System.out.println("Tim thay: " + s);
                return;
            }
        }
        System.out.println("Khong tim thay sach co ma: " + ma);
    }

    @Override
    public void xoaSach(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                danhSach.remove(s);
                System.out.println("Da xoa sach: " + ma);
                return;
            }
        }
        System.out.println("Khong tim thay sach de xoa!");
    }

    @Override
    public void capNhatSach(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                System.out.print("Nhap so luong moi: ");
                int sl = Integer.parseInt(sc.nextLine());
                s.setSoLuong(sl);
                System.out.print("Nhap gia co ban moi: ");
                double gia = Double.parseDouble(sc.nextLine());
                s.setGiaCoBan(gia);
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach de cap nhat!");
    }

    @Override
    public void kiemKeSach() {
        System.out.print("Nhap so luong toi thieu de kiem ke: ");
        int min = Integer.parseInt(sc.nextLine());
        for (Sach s : danhSach) {
            boolean tonKho = s.kiemTraTonKho(min);
            System.out.println(s.getTieuDe() + ": " + (tonKho ? "Du hang" : "Thieu hang"));
        }
    }

    @Override
    public void capNhatViTriSach(String ma, String viTriMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                s.capNhatViTri(viTriMoi);
                return;
            }
        }
        System.out.println("Khong tim thay sach de cap nhat vi tri!");
    }
}
