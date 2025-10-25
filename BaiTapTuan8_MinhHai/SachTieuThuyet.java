public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        return isLaSachSeries() ? getGiaCoBan() * 1.15 : getGiaCoBan() * 1.10;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Sach tieu thuyet");
        super.hienThiThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.println("la series " + laSachSeries);
        System.out.println("Gia ban: " + tinhGiaBan() + " VND");
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach" + getTieuDe() + "den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString(){
        return getMaSach()+','+getTieuDe()+','+getTacGia()+','+getNamXuatBan()+','+getSoLuong()+','+getGiaCoBan()+','+theLoai+','+laSachSeries;
    }
}
