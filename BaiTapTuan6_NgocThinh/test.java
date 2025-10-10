public class test{
    public static void main(String[] args){
        quanlisach ql = new quanlisach();
        sachgiaotrinh sg1 = new sachgiaotrinh("GT01","Lap trinh java","Ngo Van Ngoc Thinh",2025,50,"Cong nghe thong tin","dai hoc" );
        sachgiaotrinh sg2 = new sachgiaotrinh("GT02","toan cao cap","Nguyen Van A",2020,30,"toan hoc","dai hoc");
        sachtieuthuyet st1 = new sachtieuthuyet("TT01","harry potter","J.K.Rowling",2001,100,"ky ao",true);
        sachtieuthuyet st2 = new sachtieuthuyet("TT02","doraemon","Fujiko F.Fujio",1999,200,"phieu luu",true);
        ql.themsach(sg1);
        ql.themsach(sg2);
        ql.themsach(st1);
        ql.themsach(st2);
        System.out.println("Danh sach ban dau:");
        ql.hienthidanhsach();
        System.out.println("tim kiem sach ma TT01");
        sach tim =ql.timkiemtheoma("TT01");
        if(tim!=null){
            System.out.println(tim);
        }
        ql.capnhatsoluong("QL02",60);
        System.out.println("sau khi cap nhat so luong GT02");
        ql.hienthidanhsach();
        ql.xoasach("TT02");
        System.out.println("sau khi xoa sach TT02");
        ql.hienthidanhsach();
    }
}