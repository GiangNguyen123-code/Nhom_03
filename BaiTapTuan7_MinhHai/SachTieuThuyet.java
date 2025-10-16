public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public String toString() {
        return super.toString() + ',' + theLoai + ',' + laSachSeries +','+tinhGiaBan() + "VND";
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("[TieuThuyet] " + toString());
    }

    @Override
    public double tinhGiaBan(){
        double tien = (laSachSeries) ? 15000 : 0;
        return getGiaCoBan() + tien;
    }
}