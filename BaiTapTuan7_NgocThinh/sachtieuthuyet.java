public class sachtieuthuyet extends sach{
    private String theloai;
    private boolean lasachseries;
    public void settheloai(String theloai){
        this.theloai=theloai;
    }
    public String gettheloai(){
        return theloai;
    }
    public void setlasachseries(boolean lasachseries){
        this.lasachseries=lasachseries;
    }
    public boolean getlasachseries(){
        return lasachseries;
    }
    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, String theloai, boolean lasachseries,double giacoban){
        super(masach,tieude,tacgia,namxuatban,soluong,giacoban);
        this.theloai=theloai;
        this.lasachseries=lasachseries;
    }
    public sachtieuthuyet(){
        super();
    }
    @Override
    public double tinhgiaban(){
        return giacoban +(lasachseries ? 15000 : 0 );
    }
    public void hienthithongtin(){
        super.hienthithongtin();
        System.out.println("The loai:"+theloai);
        System.out.println("Thuoc series:"+(lasachseries ? "Co" : "Khong"));
        System.out.println("Gia ban:"+tinhgiaban()+"VND");
    }
}