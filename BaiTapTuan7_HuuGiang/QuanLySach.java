package BookManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<Sach> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void themMoiSach() {
        System.out.println("Nhap ma sach:");
        String maSach = sc.nextLine();
        System.out.println("Nhap tieu de: ");
        String tieuDe = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int namXuatBan = Integer.parseInt(sc.nextLine().trim());
        System.out.println("So luong: ");
        int soLuong = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Nhap gia co ban:");
        double giaCoBan = Double.parseDouble(sc.nextLine().trim());
        System.out.println("Nhap vi tri cat giu: ");
        String viTriCatGiu = sc.nextLine();
        System.out.println("Chon loai sach can them moi: 1. Sach giao trinh, 2. Sach tieu thuyet");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            System.out.println("Sach giao trinh");
            SachGiaoTrinh sachGiaoTrinh = new SachGiaoTrinh();
            sachGiaoTrinh.setMaSach(maSach);
            sachGiaoTrinh.setTieuDe(tieuDe);
            sachGiaoTrinh.setTacGia(tacGia);
            sachGiaoTrinh.setNamXuatBan(namXuatBan);
            sachGiaoTrinh.setSoLuong(soLuong);
            sachGiaoTrinh.setGiaCoBan(giaCoBan);
            sachGiaoTrinh.setviTriCatGiu(viTriCatGiu);
            books.add(sachGiaoTrinh);
        } else if (chon == 2) {
            System.out.println("Sach tieu thuyet");
            SachTieuThuyet sachTieuThuyet = new SachTieuThuyet();
            sachTieuThuyet.setMaSach(maSach);
            sachTieuThuyet.setTieuDe(tieuDe);
            sachTieuThuyet.setTacGia(tacGia);
            sachTieuThuyet.setNamXuatBan(namXuatBan);
            sachTieuThuyet.setSoLuong(soLuong);
            sachTieuThuyet.setGiaCoBan(giaCoBan);
            sachTieuThuyet.setviTriCatGiu(viTriCatGiu);
            books.add(sachTieuThuyet);
        } else {
            System.out.println("Chi duoc chon 1 hoac 2");
            return;
        }
        System.out.println("Them moi sach thanh cong!");
    }

    public void xoaSach() {
        System.out.println("Nhap ma sach can xoa:");
        String maSach = sc.nextLine();
        for (Sach sach : books) {
            if (sach.getMaSach().equals(maSach)) {
                books.remove(sach);
                System.out.println("Xoa sach thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    public void hienThiSach() {
        if (books.isEmpty()) {
            System.out.println("Khong co sach trong thu vien!");
            return;
        }
        System.out.println("Danh sach sach trong thu vien:");
        for (Sach sach : books) {
            sach.hienThiThongTin();
        }
    }

    public void capnhatSach() {
        System.out.println("Nhap ma sach can cap nhat: ");
        String maSach = sc.nextLine();
        for (Sach sach : books) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println("Nhap tieu de moi:");
                String tieuDe = sc.nextLine();
                System.out.println("Nhap tac gia moi: ");
                String tacGia = sc.nextLine();
                System.out.println("Nhap nam xuat ban moi: ");
                int namXuatBan = Integer.parseInt(sc.nextLine().trim());
                System.out.println("So luong moi: ");
                int soLuong = Integer.parseInt(sc.nextLine().trim());
                sach.setTieuDe(tieuDe);
                sach.setTacGia(tacGia);
                sach.setNamXuatBan(namXuatBan);
                sach.setSoLuong(soLuong);
                System.out.println("Cap nhat sach thanh cong!");
                return;
            }
        }
    }

    public void kiemKeTonKho(String maSach) {
        for (Sach sach : books) {
            if (sach.getMaSach().equals(maSach)) {
                if (sach instanceof InnerIkiemke) {
                    InnerIkiemke ikiemke = (InnerIkiemke) sach;
                    System.out.print("Nhap so luong toi thieu de kiem ke: ");
                    int soLuongToiThieu = Integer.parseInt(sc.nextLine().trim());
                    boolean tonKhoDu = ikiemke.kiemTraTonKho(soLuongToiThieu);
                    if (tonKhoDu) {
                        System.out.println("Sach " + sach.getTieuDe() + " con du ton kho.");
                    } else {
                        System.out.println("Sach " + sach.getTieuDe() + " khong du ton kho.");
                    }
                    return;
                } else {
                    System.out.println("Khong co sach de kiem ke ton kho.");
                    return;
                }
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    public void capNhatViTriSach(String maSach) {
        for (Sach sach : books) {
            if (sach.getMaSach().equals(maSach)) {
                if (sach instanceof InnerIkiemke) {
                    InnerIkiemke ikiemke = (InnerIkiemke) sach;
                    System.out.print("Nhap vi tri moi cho sach: ");
                    String viTriMoi = sc.nextLine();
                    ikiemke.capNhatViTri(viTriMoi);
                    return;
                } else {
                    System.out.println("Khong the cap nhat vi tri cho sach nay.");
                    return;
                }
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    public void timkiemSach() {
        System.out.println("Nhap ma sach can tim kiem: ");
        String maSach = sc.nextLine();
        for (Sach sach : books) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println("Thong tin sach can tim:");
                sach.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }

}