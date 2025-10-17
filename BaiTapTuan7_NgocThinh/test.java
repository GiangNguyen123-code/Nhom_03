import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        quanlisach ql = new quanlisach();
        int luachon;
        do{
            System.out.println("1. them sach.");
            System.out.println("2. xoa sach");
            System.out.println("3. hien thi sach.");
            System.out.println("4. cap nhat sach.");
            System.out.println("5. tim kiem sach.");
            System.out.println(" 0. thoat chuong trinh.");
            System.out.print("xin moi nhap lua chon:");
            luachon = Integer.parseInt(sc.nextLine().trim());
        switch(luachon){
            case 1: ql.themsach();
            break;
            case 2: ql.xoasach();
            break;
            case 3: ql.hienthisach();
            break;
            case 4: ql.capnhatsach();
            break;
            case 5: ql.timkiemsach();
            break;
            case 0: System.out.println("--Thoat chuong trinh--");
            return;
            default:
            System.out.println("lua chon khong hop le:"); 
        }
        }
        while (luachon !=0);
        sc.close();    
    }
}