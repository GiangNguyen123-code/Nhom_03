public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        setMonHoc(monHoc);
        setCapDo(capDo);
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public String toString() {
        return super.toString() + ',' + monHoc + ',' + capDo + ',' +tinhGiaBan() +"VND";
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("[GiaoTrinh] " + toString());
    }

    @Override
    public double tinhGiaBan(){
        return getGiaCoBan() + (2025 - getNamXuatBan())*5000;
    }
}