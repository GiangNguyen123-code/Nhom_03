import java.util.List;

public interface IQuanLySach {
    boolean themSach(Sach sach);
    Sach timKiemSach(String maSach);
    boolean xoaSach(String maSach);
    List<Sach> hienThiDanhSach();
}
