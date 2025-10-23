public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan,
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (2025-getNamXuatBan())*5000;
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
    public String toString(){
        return getMaSach()+','+getTieuDe()+','+getTacGia()+','+getNamXuatBan()+','+getSoLuong()+','+getGiaCoBan()+','+monHoc+','+capDo;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach " + getTieuDe() + "den khu vuc" + viTriMoi);
    }
}
