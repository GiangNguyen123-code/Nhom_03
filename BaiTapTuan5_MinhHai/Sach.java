class Sach{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Getter va Setter cho ma sach
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    // Getter va Setter cho tieu de
    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    // Getter va Setter cho tac gia
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    // Getter va Setter cho nam xuat ban
    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    // Getter va Setter cho so luong
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    //Hien thi thong tin cua sach
    public void hienThiThongTin(){
        System.out.println(maSach);
        System.out.println(tieuDe);
        System.out.println(tacGia);
        System.out.println(namXuatBan);
        System.out.println(soLuong);
    }

    //Ham khoi tao cho lop Sach
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        setMaSach(maSach);
        setTieuDe(tieuDe);
        setTacGia(tacGia);
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }
}