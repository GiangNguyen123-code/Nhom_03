public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet() {}

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,int soLuong, double giaCoBan, String theLoai, boolean laSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSeries() { return laSeries; }
    public void setLaSeries(boolean laSeries) { this.laSeries = laSeries; }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSeries ? 15000 : 0);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach \"" + tieuDe + "\" den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | The loai: %s | Series: %s | Gia ban: %.2f",
                theLoai, laSeries ? "Co" : "Khong", tinhGiaBan());
    }
}
