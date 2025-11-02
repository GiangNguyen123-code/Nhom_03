package BookManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSachSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
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
            danhSachSach.add(sachGiaoTrinh);
        } else if (chon == 2) {
            System.out.println("Sach tieu thuyet");
            System.out.println("Nhap the loai: ");
            String theLoai = sc.nextLine();
            System.out.println("La sach series (Co/Khong): ");
            String laSachSeriesInput = sc.nextLine().trim();
            boolean laSachSeries = laSachSeriesInput.equalsIgnoreCase("Co");
            SachTieuThuyet sachTieuThuyet = new SachTieuThuyet();
            sachTieuThuyet.setMaSach(maSach);
            sachTieuThuyet.setTieuDe(tieuDe);
            sachTieuThuyet.setTacGia(tacGia);
            sachTieuThuyet.setNamXuatBan(namXuatBan);
            sachTieuThuyet.setSoLuong(soLuong);
            sachTieuThuyet.setGiaCoBan(giaCoBan);
            sachTieuThuyet.setviTriCatGiu(viTriCatGiu);
            sachTieuThuyet.settheLoai(theLoai);
            sachTieuThuyet.setlaSachSeries(laSachSeries);
            danhSachSach.add(sachTieuThuyet);
        } else {
            System.out.println("Chi duoc chon 1 hoac 2");
            return;
        }
        System.out.println("Them moi sach thanh cong!");
    }

    @Override
    public void timKiemSach() {
        System.out.println("Nhap ma sach can tim kiem: ");
        String maSach = sc.nextLine();
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println("Thong tin sach can tim:");
                sach.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay sach!");

    }

    @Override
    public void xoaSach() {
        System.out.println("Nhap ma sach can xoa:");
        String maSach = sc.nextLine();
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                danhSachSach.remove(sach);
                System.out.println("Xoa sach thanh cong!");
                return;
            }
        }
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Khong co sach trong thu vien!");
            return;
        }
        System.out.println("Danh sach sach trong thu vien:");
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoTrinh) {
                System.out.println("Sach Giao Trinh:");
                sach.hienThiThongTin();
            } else if (sach instanceof SachTieuThuyet) {
                System.out.println("Sach Tieu Thuyet:");
                sach.hienThiThongTin();
                System.out.println("La sach series: "
                        + (((SachTieuThuyet) sach).islaSachSeries() ? "Co" : "Khong"));
            }
        }

    }

    @Override
    public void capnhatSach() {
        System.out.println("Nhap ma sach can cap nhat: ");
        String maSach = sc.nextLine();
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                System.out.println("Nhap tieu de moi:");
                String tieuDe = sc.nextLine();
                System.out.println("Nhap tac gia moi: ");
                String tacGia = sc.nextLine();
                System.out.println("Nhap nam xuat ban moi: ");
                int namXuatBan = Integer.parseInt(sc.nextLine().trim());
                System.out.println("So luong moi: ");
                int soLuong = Integer.parseInt(sc.nextLine().trim());
                System.out.println("Nhap gia co ban moi:");
                double giaCoBan = Double.parseDouble(sc.nextLine().trim());
                sach.setTieuDe(tieuDe);
                sach.setTacGia(tacGia);
                sach.setNamXuatBan(namXuatBan);
                sach.setSoLuong(soLuong);
                sach.setGiaCoBan(giaCoBan);
                System.out.println("Cap nhat sach thanh cong!");
                return;
            } else {
                System.out.println("Khong tim thay sach!");
                return;
            }
        }
    }

    @Override
    public void kiemKeTonKho(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                if (sach instanceof IKiemKe) {
                    IKiemKe ikiemke = (IKiemKe) sach;
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

    @Override
    public void capNhatViTriSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                if (sach instanceof IKiemKe) {
                    IKiemKe ikiemke = (IKiemKe) sach;
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

    @Override
    public void tinhGiaBan() {
        String maSach;
        System.out.print("Nhap ma sach can tinh gia ban: ");
        maSach = sc.nextLine();
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                if (sach instanceof IGiaBan) {
                    IGiaBan giaBan = (IGiaBan) sach;
                    double gia = giaBan.tinhGiaBan();
                    System.out.println("Gia ban cua sach " + sach.getTieuDe() + " la: " + gia);
                } else {
                    System.out.println("Khong the tinh gia ban cho sach " + sach.getTieuDe());
                }
                return;
            }
        }
        System.out.println("Khong tim thay sach!");
    }

    @Override
    public void hienThiDanhSachSachGiaoTrinh() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Khong co sach giao trinh trong thu vien!");
            return;
        }
        System.out.println("Danh sach sach giao trinh trong thu vien:");
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachGiaoTrinh) {
                ((SachGiaoTrinh) sach).hienThiThongTinSachGiaoTrinh();
            }
        }
    }

    @Override
    public void hienThiDanhSachSachTieuThuyet() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Khong co sach tieu thuyet trong thu vien!");
            return;
        }
        System.out.println("Danh sach sach tieu thuyet trong thu vien:");
        for (Sach sach : danhSachSach) {
            if (sach instanceof SachTieuThuyet) {
                ((SachTieuThuyet) sach).hienThiThongTinSachTieuThuyet();
            }
        }
    }

    @Override
    public void sapXepSachTheoGiaBan() {
        danhSachSach.sort((sach1, sach2) -> {
            double giaBan1 = 0;
            double giaBan2 = 0;
            if (sach1 instanceof IGiaBan) {
                giaBan1 = ((IGiaBan) sach1).tinhGiaBan();
            }
            if (sach2 instanceof IGiaBan) {
                giaBan2 = ((IGiaBan) sach2).tinhGiaBan();
            }
            return Double.compare(giaBan1, giaBan2);
        });
        System.out.println("Danh sach sach da duoc sap xep theo gia ban tang dan:");
        hienThiDanhSach();
    }

    @Override
    public void hienThiThongTinSachTheoYeuCau(String yeuCau) {
        for (Sach sach : danhSachSach) {
            if (sach.getTieuDe().contains(yeuCau) || sach.getTacGia().contains(yeuCau)) {
                sach.hienThiThongTin();
            }
        }
    }

}