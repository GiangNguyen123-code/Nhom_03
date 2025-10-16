import java.util.*;

public class QuanLySach {
    private List<Sach> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void themMoi() {
        System.out.println("Chon loai sach: 1. Giao Trinh  2. Tieu Thuyet");
        int choice = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Ma sach: ");
        String ma = sc.nextLine().trim();
        System.out.print("Tieu de: ");
        String td = sc.nextLine().trim();
        System.out.print("Tac gia: ");
        String tg = sc.nextLine().trim();
        System.out.print("Nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine().trim());
        System.out.print("So luong: ");
        int sl = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Gia ban: ");
        int gb = Integer.parseInt(sc.nextLine().trim());



        Sach temp = null;
        if (choice == 1) {
            System.out.print("Mon hoc: ");
            String monHoc = sc.nextLine().trim();
            System.out.print("Cap do: ");
            String capDo = sc.nextLine().trim();
            temp = new SachGiaoTrinh(ma, td, tg, nam, sl ,gb , monHoc, capDo);
        } else if (choice == 2) {
            System.out.print("The loai: ");
            String theLoai = sc.nextLine().trim();
            System.out.print("La sach series? (true/false): ");
            boolean laSeries = Boolean.parseBoolean(sc.nextLine().trim());
            temp = new SachTieuThuyet(ma, td, tg, nam, sl ,gb, theLoai, laSeries);
        } else {
            System.out.println("Chi duoc chon 1 hoac 2!");
            return;
        }
        books.add(temp);
        System.out.println("==> Da them sach moi thanh cong!");
    }

    public int timKiem(String maSach) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getMaSach().equals(maSach)) {
                return i;
            }
        }
        return -1;
    }

    public void xoaSach(String maSach) {
        int index = timKiem(maSach);
        if (index == -1) {
            System.out.println("==> Xoa sach khong thanh cong!");
        } else {
            books.remove(index);
            System.out.println("==> Da xoa sach thanh cong!");
        }
    }

    public void hienThiDanhSachSach() {
        if (books.isEmpty()) {
            System.out.println("==> Khong co sach trong danh sach.");
        } else {
            for (Sach sach : books) {
                sach.hienThiThongTin();
            }
        }
    }

    public void capNhatSach(String maSach) {
        int index = timKiem(maSach);
        if (index != -1) {
            Sach sach = books.get(index);
            System.out.print("Tieu de moi: ");
            sach.setTieuDe(sc.nextLine().trim());
            System.out.print("Tac gia moi: ");
            sach.setTacGia(sc.nextLine().trim());
            System.out.print("Nam xuat ban moi: ");
            sach.setNamXuatBan(Integer.parseInt(sc.nextLine().trim()));
            System.out.print("So luong moi: ");
            sach.setSoLuong(Integer.parseInt(sc.nextLine().trim()));
            if (sach instanceof SachGiaoTrinh) {
                System.out.print("Mon hoc moi: ");
                ((SachGiaoTrinh) sach).setMonHoc(sc.nextLine().trim());
                System.out.print("Cap do moi: ");
                ((SachGiaoTrinh) sach).setCapDo(sc.nextLine().trim());
            } else if (sach instanceof SachTieuThuyet) {
                System.out.print("The loai moi: ");
                ((SachTieuThuyet) sach).setTheLoai(sc.nextLine().trim());
                System.out.print("La sach series moi? (true/false): ");
                ((SachTieuThuyet) sach).setLaSachSeries(Boolean.parseBoolean(sc.nextLine().trim()));
            }
            System.out.println("==> Da cap nhat thong tin sach thanh cong!");
        } else {
            System.out.println("==> Khong tim thay sach de cap nhat!");
        }
    }

    public void timKiemSach(String maSach) {
        int index = timKiem(maSach);
        if (index != -1) {
            books.get(index).hienThiThongTin();
        } else {
            System.out.println("==> Khong tim thay sach!");
        }
    }
}