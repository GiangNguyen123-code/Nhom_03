public class sachtieuthuyet extends sach implements IKiemKe {
    private String theloai;
    private boolean lasachseries;

    public sachtieuthuyet() {
        super();
    }

    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban,int soluong, String theloai, boolean lasachseries, double giacoban) {
        super(masach, tieude, tacgia, namxuatban, soluong, giacoban);
        this.theloai = theloai;
        this.lasachseries = lasachseries;
    }

    public void settheloai(String theloai) { this.theloai = theloai; }
    public String gettheloai() { return theloai; }

    public void setlasachseries(boolean lasachseries) { this.lasachseries = lasachseries; }
    public boolean getlasachseries() { return lasachseries; }

    @Override
    public double tinhgiaban() {
        return giacoban + (lasachseries ? 15000 : 0);
    }

    @Override
    public void hienthithongtin() {
        super.hienthithongtin();
        System.out.println("The loai: " + theloai);
        System.out.println("Thuoc series: " + (lasachseries ? "Co" : "Khong"));
        System.out.println("Gia ban uoc tinh: " + tinhgiaban() + " VND");
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soluong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach \"" + tieude + "\" den khu vuc: " + viTriMoi);
    }
}
