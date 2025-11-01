public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                          String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public SachTieuThuyet() {
        super();
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        double gia = isLaSachSeries() ? getGiaCoBan() * 1.15 : getGiaCoBan() * 1.10;
        return Math.round(gia);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Sach tieu thuyet:");
        super.hienThiThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.println("La sach series: " + laSachSeries);
        System.out.println("Gia ban: " + tinhGiaBan() + " VND");
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach " + getTieuDe() + " den khu vuc " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + "," + theLoai + "," + laSachSeries;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap the loai: ");
        theLoai = sc.nextLine();
        System.out.print("Sach co phai series khong (true/false): ");
        laSachSeries = sc.nextBoolean();
        sc.nextLine();
    }

    @Override
    public void Xuat() {
        System.out.println("Sach tieu thuyet:");
        super.Xuat();
        System.out.println("The loai: " + theLoai);
        System.out.println("La sach series: " + laSachSeries);
        System.out.println("Gia ban: " + tinhGiaBan() + " VND");
    }
}
