import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> books = new ArrayList<>();

    @Override
    public boolean themSach(Sach sach) {
        for (Sach s : books) {
            if (s.getMaSach().equalsIgnoreCase(sach.getMaSach())) {
                System.out.println("Sach da ton tai: " + sach.getMaSach());
                return false;
            }
        }
        books.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
        return true;
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : books) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            books.remove(s);
            System.out.println("Da xoa sach: " + s.getTieuDe());
            return true;
        }
        System.out.println("Khong tim thay sach voi ma: " + maSach);
        return false;
    }

    @Override
    public List<Sach> hienThiDanhSach() {
        if (books.isEmpty()) {
            System.out.println("Danh sach sach trong.");
        } else {
            System.out.println("Danh sach sach:");
            for (Sach s : books) {
                s.hienThiThongTin();
            }
        }
        return books;
    }

    public void sapXepTheoGiaBan() {
        if (books.isEmpty()) {
            System.out.println("Khong co sach de sap xep.");
            return;
        }
        Collections.sort(books, Comparator.comparingDouble(Sach::tinhGiaBan));
        System.out.println("Da sap xep sach theo gia ban tang dan:");
        hienThiDanhSach();
    }

    public void demSoLuongTheoLoai() {
        int demGT = 0, demTT = 0;
        for (Sach s : books) {
            if (s instanceof SachGiaoTrinh) demGT++;
            else if (s instanceof SachTieuThuyet) demTT++;
        }
        System.out.println("So luong sach giao trinh: " + demGT);
        System.out.println("So luong sach tieu thuyet: " + demTT);
    }

    public void tinhTongGiaTriTonKho() {
        double tong = 0;
        for (Sach s : books) {
            tong += s.tinhGiaBan() * s.getSoLuong();
        }
        System.out.println("Tong gia tri ton kho: " + tong + " VND");
    }
}
