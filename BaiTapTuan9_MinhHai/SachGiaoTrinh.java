public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public SachGiaoTrinh() {
        super();
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        double gia = getGiaCoBan() + (2025 - getNamXuatBan()) * 5000;
        return Math.round(gia);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Sach giao trinh:");
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap do: " + capDo);
        System.out.println("Gia ban uoc tinh: " + tinhGiaBan() + " VND");
    }

    @Override
    public String toString() {
        return super.toString() + "," + monHoc + "," + capDo;
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
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhap mon hoc: ");
        monHoc = sc.nextLine();
        System.out.print("Nhap cap do: ");
        capDo = sc.nextLine();
    }

    @Override
    public void Xuat() {
        System.out.println("Sach giao trinh:");
        super.Xuat();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap do: " + capDo);
        System.out.println("Gia ban uoc tinh: " + tinhGiaBan() + " VND");
    }
}
