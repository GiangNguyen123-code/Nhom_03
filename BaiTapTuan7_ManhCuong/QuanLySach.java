import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Da them sach: " + sach.getTieuDe());
    }

    public void hienThiTatCa() {
        System.out.println("\n===== DANH SACH SACH =====");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}
