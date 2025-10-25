public abstract class sach {
    protected String masach;
    protected String tieude;
    protected String tacgia;
    protected int namxuatban;
    protected int soluong;
    protected double giacoban;

    protected sach() {}

    protected sach(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
        this.giacoban = giacoban;
    }

    public void setmasach(String masach) { this.masach = masach; }
    public String getmasach() { return masach; }

    public void settieude(String tieude) { this.tieude = tieude; }
    public String gettieude() { return tieude; }

    public void settacgia(String tacgia) { this.tacgia = tacgia; }
    public String gettacgia() { return tacgia; }

    public void setnamxuatban(int namxuatban) { this.namxuatban = namxuatban; }
    public int getnamxuatban() { return namxuatban; }

    public void setsoluong(int soluong) { this.soluong = soluong; }
    public int getsoluong() { return soluong; }

    public void setgiacoban(double giacoban) { this.giacoban = giacoban; }
    public double getgiacoban() { return giacoban; }

    public abstract double tinhgiaban();

    public void hienthithongtin() {
        System.out.println("Ma sach: " + masach);
        System.out.println("Tieu de: " + tieude);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("So luong: " + soluong);
        System.out.println("Gia co ban: " + giacoban);
    }
}
