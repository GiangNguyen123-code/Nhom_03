public class test{
    public static void main(String[] args){
        sach s1 = new sach("0A02","Trang Quynh","Ngo Van Ngoc Thinh",1982,199);
        //sach s2 = new sach("0A02","Cau be rong","Ngo Van Ngoc Thinh", 1999, 1000);
        Sach s2 = new sach();
        s2.setmasach("0A02");
        s2.settieude("Cau be rong");
        s2.settacgia("Ngo Van Ngoc Thinh");
        s2.setnamxuatban(1999);
        s2.setsoluong(1000);
        s1.hienthithongtin();
        s2.hienthithongtin();
    }
}