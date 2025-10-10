package BookManager;

public class SachGiaoTrinh extends Sach {
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
            int soLuong) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String toString() {
        return maSach + "\t" + tieuDe + "\t" + tacGia + "\t" + namXuatBan + "\t" + soLuong + "\t" + monHoc + "\t"
                + capDo;
    }
}