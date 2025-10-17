package BookManager;

public class SachTieuThuyet extends Sach implements InnerIkiemke {
    private String theLoai;
    private boolean laSachSeries;

    public String gettheLoai() {
        return theLoai;
    }

    public void settheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean islaSachSeries() {
        return laSachSeries;
    }

    public void setlaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    public SachTieuThuyet() {
        super();
    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
            boolean laSachSeries, String viTriCatGiu) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, viTriCatGiu);
        this.laSachSeries = laSachSeries;
    }

    public String toString() {
        return maSach + "\t" + tieuDe + "\t" + tacGia + "\t" + namXuatBan + "\t" + soLuong + "\t" + "La sach series: "
                + (laSachSeries ? "Co" : "Khong");
    }

    @Override
    public double giaBan() {
        if (laSachSeries) {
            return giaCoBan + (namXuatBan + 15000);
        } else {
            return giaCoBan;
        }
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