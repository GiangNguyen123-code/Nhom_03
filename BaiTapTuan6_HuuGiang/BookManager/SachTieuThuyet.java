package BookManager;

public class SachTieuThuyet extends Sach {
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

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
            boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.laSachSeries = laSachSeries;
    }

    public String toString() {
        return maSach + "\t" + tieuDe + "\t" + tacGia + "\t" + namXuatBan + "\t" + soLuong + "\t" + "La sach series: "
                + (laSachSeries ? "Co" : "Khong");
    }
}