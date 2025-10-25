public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        // Giá bán = giá cơ bản + 5%
        return getGiaCoBan() * 1.05;
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
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap do: " + capDo;
    }
}
