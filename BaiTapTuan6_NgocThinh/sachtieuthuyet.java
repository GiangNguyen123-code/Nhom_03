public class sachtieuthuyet extends sach{
    private String theloai;
    private boolean lasachseries;
    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, String theloai, boolean lasachseries){
        super(masach,tieude,tacgia,namxuatban,soluong);
        this.theloai=theloai;
        this.lasachseries=lasachseries;
    }
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
    @Override
    public String toString(){
        return super.toString() + ",theloai:" +theloai +"la sach series:" + (lasachseries ? "Co":"Khong");
    }
}