import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Sach sach1 = new SachGiaoTrinh("A01","Toan cao cap","Vu",1998,5,10000,"Toan","Dai hoc");
        Sach sach2 = new SachTieuThuyet("A02","Harry Potter","J.K Rowling",1990,19,18000,"Gia tuong",true);
        int choice = -1;
        while(choice != 0){
            System.out.println("1:Them sach");
            System.out.println("2:Tim kiem sach");
            System.out.println("3:Xoa sach");
            System.out.println("4:Hien thi danh sach sach");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    quanLy.themSach(sach1);
                    quanLy.themSach(sach2);
                    break;
                case 2:
                    System.out.println(sach1.getTieuDe()+" o vi tri thu "+(quanLy.timKiemSach(sach1)+1));
                    System.out.println(sach2.getTieuDe()+" o vi tri thu "+(quanLy.timKiemSach(sach2)+1));
                    System.out.println("-1 Nghia la khong tim thay sach");
                    break;
                case 3:
                    if(quanLy.xoaSach(sach1)){
                        System.out.println(sach1.getTieuDe()+" da xoa thanh cong");
                    } else {
                        System.out.println(sach1.getTieuDe()+" da xoa khong thanh cong");
                    }
                    if(quanLy.xoaSach(sach2)){
                        System.out.println(sach2.getTieuDe()+" da xoa thanh cong");
                    } else {
                        System.out.println(sach2.getTieuDe()+" da xoa khong thanh cong");
                    }
                    break;
                case 4:
                    quanLy.hienThiDanhSach();
                    break;
                default:
                    System.out.println("Co gi do khong dung");
                    break;
            }
        }
    }
}
