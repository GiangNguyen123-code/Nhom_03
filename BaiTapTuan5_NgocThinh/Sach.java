public class Sach{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void hienThiThongTin(){
        System.out.println(maSach);
        System.out.println(tieuDe);
        System.out.println(tacGia);
        System.out.println(namXuatBan);
        System.out.println(soLuong);
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        setMaSach(maSach);
        setTieuDe(tieuDe);
        setTacGia(tacGia);
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }
}