public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    @Override
    public double tinhGiaBan() {
        // Nếu là series (bộ truyện dài), giá cao hơn 10%
        return laSeries ? getGiaCoBan() * 1.10 : getGiaCoBan() * 1.08;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach [" + getTieuDe() + "] den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + ", The loai: " + theLoai + ", La series: " + laSeries;
    }
}
