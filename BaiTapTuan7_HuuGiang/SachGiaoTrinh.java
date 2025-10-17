package BookManager;

public class SachGiaoTrinh extends Sach implements InnerIkiemke {
    private String monHoc;
    private String capDo;

    public String getmonHoc() {
        return monHoc;
    }

    public void setmonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getcapDo() {
        return capDo;
    }

    public void setcapDo(String capDo) {
        this.capDo = capDo;
    }

    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String monHoc, String capDo, String maSach, String tieuDe, String tacGia, int namXuatBan,
            int soLuong, double giaCoBan, String viTriCatGiu) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTriCatGiu);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String toString() {
        return maSach + "\t" + tieuDe + "\t" + tacGia + "\t" + namXuatBan + "\t" + soLuong + "\t" + monHoc + "\t"
                + capDo;
    }

    @Override
    public double giaBan() {
        return giaCoBan + ((2025 - this.namXuatBan) * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        if (soLuong >= soLuongToiThieu) {
            return true;
        }
        return false;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTriCatGiu = viTriMoi;
        System.out.println("Da chuyen sach " + tieuDe + "den vi tri: " + viTriMoi);
    }
}