import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
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
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
            return true;
        }
        System.out.println("Khong tim thay sach co ma: " + maSach);
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("\n===== DANH SACH SACH =====");
        for (Sach s : danhSach) {
            System.out.println(s);
            System.out.println("→ Gia ban: " + s.tinhGiaBan() + " VND");
            System.out.println("----------------------------");
        }
    }
}
