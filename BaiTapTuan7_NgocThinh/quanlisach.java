import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quanlisach {
    private List<sach> danhsach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void themsach() {
        System.out.println("Nhap ma sach:");
        String masach = sc.nextLine();
        System.out.println("Nhap ten sach:");
        String tieude = sc.nextLine();
        System.out.println("Nhap tac gia:");
        String tacgia = sc.nextLine();
        System.out.println("Nhap nam xuat ban:");
        int namxuatban = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Nhap so luong:");
        int soluong = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Nhap gia co ban:");
        double giacoban = Double.parseDouble(sc.nextLine().trim());
        System.out.println("Lua chon loai sach: 1. sach giao trinh   2. sach tieu thuyet");
        int luachon = Integer.parseInt(sc.nextLine().trim());

        if (luachon == 1) {
            System.out.println("Nhap mon hoc:");
            String monhoc = sc.nextLine();
            System.out.println("Nhap cap do:");
            String capdo = sc.nextLine();
            sachgiaotrinh s = new sachgiaotrinh(masach, tieude, tacgia, namxuatban, soluong, monhoc, capdo, giacoban);
            danhsach.add(s);
        } else if (luachon == 2) {
            System.out.println("Nhap the loai:");
            String theloai = sc.nextLine();
            System.out.println("Day co phai la sach series khong? (true/false)");
            boolean laseries = Boolean.parseBoolean(sc.nextLine().trim());
            sachtieuthuyet s = new sachtieuthuyet(masach, tieude, tacgia, namxuatban, soluong, theloai, laseries, giacoban);
            danhsach.add(s);
        } else {
            System.out.println("Chi duoc chon 1 hoac 2.");
        }
        System.out.println("Da them thanh cong!");
    }
    public void themsach(sach s) {
        danhsach.add(s);
    }

    public void xoasach() {
        System.out.println("Nhap ma sach can xoa:");
        String ma = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getmasach().equalsIgnoreCase(ma)) {
                danhsach.remove(i);
                found = true;
                System.out.println("Xoa sach thanh cong.");
                break;
            }
        }
        if (!found) System.out.println("Khong tim thay sach.");
    }

    public void hienthisach() {
        if (danhsach.isEmpty()) {
            System.out.println("Khong co sach trong thu vien.");
            return;
        }
        System.out.println("Danh sach sach:");
        for (sach s : danhsach) {
            s.hienthithongtin();
            System.out.println("Gia ban uoc tinh: " + s.tinhgiaban() + " VND");
            System.out.println("---------------------------");
        }
    }

    public void capnhatsach() {
        System.out.println("Nhap ma sach can cap nhat:");
        String ma = sc.nextLine();
        for (sach s : danhsach) {
            if (s.getmasach().equalsIgnoreCase(ma)) {
                System.out.println("Nhap tieu de moi:");
                s.settieude(sc.nextLine());
                System.out.println("Nhap tac gia moi:");
                s.settacgia(sc.nextLine());
                System.out.println("Nhap nam xuat ban moi:");
                s.setnamxuatban(Integer.parseInt(sc.nextLine().trim()));
                System.out.println("Nhap so luong moi:");
                s.setsoluong(Integer.parseInt(sc.nextLine().trim()));
                System.out.println("Nhap gia co ban moi:");
                s.setgiacoban(Double.parseDouble(sc.nextLine().trim()));
                System.out.println("Cap nhat thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay sach.");
    }

    public void timkiemsach() {
        System.out.println("Nhap ma sach can tim:");
        String ma = sc.nextLine();
        for (sach s : danhsach) {
            if (s.getmasach().equalsIgnoreCase(ma)) {
                System.out.println("Thong tin sach:");
                s.hienthithongtin();
                System.out.println("Gia ban uoc tinh: " + s.tinhgiaban() + " VND");
                return;
            }
        }
        System.out.println("Khong tim thay sach.");
    }

    public void kiemKeSach() {
        System.out.println("Nhap ma sach can kiem ke:");
        String ma = sc.nextLine();
        for (sach s : danhsach) {
            if (s.getmasach().equalsIgnoreCase(ma)) {
                if (s instanceof IKiemKe) {
                    IKiemKe k = (IKiemKe) s;
                    System.out.println("Nhap so luong toi thieu can kiem tra:");
                    int min = Integer.parseInt(sc.nextLine().trim());
                    boolean ok = k.kiemTraTonKho(min);
                    System.out.println(ok ? "Sach du ton kho." : "Sach khong du ton kho.");
                } else {
                    System.out.println("Sach nay khong ho tro kiem ke (khong implements IKiemKe).");
                }
                return;
            }
        }
        System.out.println("Khong tim thay sach.");
    }
    public void capNhatViTriSach() {
        System.out.println("Nhap ma sach can cap nhat vi tri:");
        String ma = sc.nextLine();
        for (sach s : danhsach) {
            if (s.getmasach().equalsIgnoreCase(ma)) {
                if (s instanceof IKiemKe) {
                    IKiemKe k = (IKiemKe) s;
                    System.out.println("Nhap vi tri moi:");
                    String vt = sc.nextLine();
                    k.capNhatViTri(vt);
                } else {
                    System.out.println("Sach nay khong ho tro cap nhat vi tri (khong implements IKiemKe).");
                }
                return;
            }
        }
        System.out.println("Khong tim thay sach.");
    }
}
