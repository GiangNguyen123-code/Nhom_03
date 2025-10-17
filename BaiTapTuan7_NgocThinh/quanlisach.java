import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class quanlisach{
    private List<sach> danhsach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void themsach(){
        System.out.println("Nhap ma sach:");
        String masach = sc.nextLine();
        System.out.println("Nhap ten sach");
        String tieude = sc.nextLine();
        System.out.println("Nhap tac gia:");
        String tacgia = sc.nextLine();
        System.out.println("Nhap nam xuat ban");
        int namxuatban = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Nhap so luong:");
        int soluong = Integer.parseInt(sc.nextLine().trim());
        System.out.println("nhap gia co ban:");
        double giacoban = Double.parseDouble(sc.nextLine().trim());
        System.out.println("lua chon loai sach:1. sach giao trinh   2. sach tieu thuyet");
        int luachon = Integer.parseInt(sc.nextLine().trim());
        if(luachon==1){
            System.out.println("sach giao trinh");
            System.out.println("Nhap mon hoc:");
            String monhoc = sc.nextLine();
            System.out.println("Nhap cap do:");
            String capdo = sc.nextLine();
            sachgiaotrinh sachgiaotrinh = new sachgiaotrinh();
            sachgiaotrinh.setmasach(masach);
            sachgiaotrinh.settieude(tieude);
            sachgiaotrinh.settacgia(tacgia);
            sachgiaotrinh.setnamxuatban(namxuatban);
            sachgiaotrinh.setsoluong(soluong);
            sachgiaotrinh.setmonhoc(monhoc);
            sachgiaotrinh.setcapdo(capdo);
            sachgiaotrinh.setgiacoban(giacoban);
            danhsach.add(sachgiaotrinh);
        }
        else
            if(luachon==2){
                System.out.println("sach tieu thuyet");
                System.out.println("Nhap the loai:");
                String theloai = sc.nextLine();
                System.out.println("day co phai la sach series khong? (true/false)");
                boolean lasachseries = Boolean.parseBoolean(sc.nextLine().trim());
                sachtieuthuyet sachtieuthuyet = new sachtieuthuyet();
                sachtieuthuyet.setmasach(masach);
                sachtieuthuyet.settieude(tieude);
                sachtieuthuyet.settacgia(tacgia);
                sachtieuthuyet.setnamxuatban(namxuatban);
                sachtieuthuyet.setsoluong(soluong);
                sachtieuthuyet.setgiacoban(giacoban);
                sachtieuthuyet.settheloai(theloai);
                sachtieuthuyet.setlasachseries(lasachseries);
                danhsach.add(sachtieuthuyet);   
            }
        else{
            System.out.println("chi duoc chon 1 trong 2");
            return;
        }
        System.out.println("da them thanh cong");
    }
    public void xoasach(){
        System.out.println("nhap ma sach can xoa:");
        String masach = sc.nextLine();
        for(sach s : danhsach){
            if(s.getmasach().equals(masach)){
                danhsach.remove(s);
                System.out.println("xoa sach thanh cong");
                return;
            }
        }
        System.out.println("khong tim thay sach");
    }
    public void hienthisach(){
        if(danhsach.isEmpty()){
            System.out.println("khong co sach trong thu vien");
            return;
        }
        System.out.println("danh sach sach trong thu vien");
        for(sach s : danhsach){
            s.hienthithongtin();
        }

    }
    public void capnhatsach(){
        System.out.println("nhap ma sach can cap nhat:");
        String masach = sc.nextLine();
        for(sach s : danhsach){
            if(s.getmasach().equals(masach)){
                System.out.println("nhap tieu de moi:");
                String tieude = sc.nextLine();
                System.out.println("nhap tac gia moi:");
                String tacgia = sc.nextLine();
                System.out.println("nhap nam xuat ban moi:");
                int namxuatban = Integer.parseInt(sc.nextLine().trim());
                System.out.println("nhap so luong moi:");
                int soluong = Integer.parseInt(sc.nextLine().trim());
                System.out.println("nhap gia co ban moi:");
                double giacoban = Double.parseDouble(sc.nextLine().trim());
                s.settieude(tieude);
                s.settacgia(tacgia);
                s.setnamxuatban(namxuatban);
                s.setsoluong(soluong);
                s.setgiacoban(giacoban);
                System.out.println("cap nhat sach thanh cong");
                return;
            }
        }
    }
    public void timkiemsach(){
        System.out.println("nhap ma sach can tim kiem:");
        String masach = sc.nextLine();
        for (sach s : danhsach){
            if(s.getmasach().equals(masach)){
                System.out.println("thong tin can tim:");
                s.hienthithongtin();
                return;
            }
        }
        System.out.println("khong tim thay sach");
    }
}