public class sach{
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    private int soluong;
    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong){
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
    }
    public void setmasach(String masach){
        this.masach=masach;
    }
    public String getmasach(){
        return masach;
    }
    public void settieude(String tieude){
        this.tieude=tieude;
    }
    public String gettieude(){
        return tieude;
    }
    public void settacgia(String tacgia){
        this.tacgia=tacgia;
    }
    public String gettacgia(){
        return tacgia;
    }
    public void setnamxuatban(int namxuatban){
        this.namxuatban=namxuatban;
    }
    public int getnamxuatban(){
        return namxuatban;
    }
    public void setsoluong(int soluong){
        this.soluong=soluong;
    }
    public int getsoluong(){
        return soluong;
    }
    public void hienthithongtin(){
        System.out.println("thong tin ma sach:"+masach);
        System.out.println("tieu de:"+tieude);
        System.out.println("tac gia:"+tacgia);
        System.out.println("nam xuat ban:"+namxuatban);
        System.out.println("so luong:"+soluong);
    }
}