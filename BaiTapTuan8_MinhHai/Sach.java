import java.util.*;

public abstract class Sach implements IKiemKe,IGiaBan{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        setMaSach(maSach);
        setTieuDe(tieuDe);
        setTacGia(tacGia);
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
        setGiaCoBan(giaCoBan);
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setGiaCoBan(double giaCoBan){
        this.giaCoBan = giaCoBan;
    }
    public double getGiaCoBan() {
        return giaCoBan;
    }

    @Override
    public String toString() {
        return maSach + "," + tieuDe + "," + tacGia + "," + namXuatBan + "," + soLuong+","+giaCoBan;
    }

    public void hienThiThongTin() {
        System.out.println(toString());
    }


    public abstract double tinhGiaBan();
}