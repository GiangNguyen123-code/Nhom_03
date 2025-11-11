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
        int namXuatBan;
        while (true) {
            try {
                System.out.println("Nhap nam xuat ban: ");
                namXuatBan = Integer.parseInt(sc.nextLine().trim());
                if (namXuatBan <= 0) {
                    System.out.println("Nam xuat ban phai lon hon 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Loi: vui long nhap so hop le!");
            }
        }
        int soLuong;
        while (true) {
            try {
                System.out.println("Nhap so luong: ");
                soLuong = Integer.parseInt(sc.nextLine().trim());
                if (soLuong < 0) {
                    System.out.println("So luong khong duoc am!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Loi: vui long nhap so nguyen!");
            }
        }
        double giaCoBan;
        while (true) {
            try {
                System.out.println("Nhap gia co ban:");
                giaCoBan = Double.parseDouble(sc.nextLine().trim());
                if (giaCoBan <= 0) {
                    System.out.println("Gia phai lon hon 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Loi: vui long nhap so hop le!");
            }
        }
        System.out.println("Nhap vi tri cat giu: ");
        String viTriCatGiu = sc.nextLine();
        int chon;
        while (true) {
            try {
                System.out.println("Chon loai sach can them moi: 1. Sach giao trinh, 2. Sach tieu thuyet");
                chon = Integer.parseInt(sc.nextLine().trim());
                if (chon == 1 || chon == 2)
                    break;
                System.out.println("Chi duoc chon 1 hoac 2!");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so 1 hoac 2!");
            }
        }
        if (chon == 1) {
            System.out.println("Sach giao trinh");
            System.out.println("Nhap mon hoc: ");
            String monHoc = sc.nextLine();
            System.out.println("Nhap cap do: ");
            String capDo = sc.nextLine();
            SachGiaoTrinh sachGiaoTrinh = new SachGiaoTrinh();
            sachGiaoTrinh.setMaSach(maSach);
            sachGiaoTrinh.setTieuDe(tieuDe);
            sachGiaoTrinh.setmonHoc(monHoc);
            sachGiaoTrinh.setcapDo(capDo);
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
        }
        System.out.println("Them moi sach thanh cong!");
    }

    @Override
    public void timKiemSach() {
        System.out.println("Nhap ma sach can tim kiem: ");
        String maSach = sc.nextLine();
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                if (sach instanceof SachGiaoTrinh) {
                    System.out.println("Sach Giao Trinh:");
                    SachGiaoTrinh sachGT = (SachGiaoTrinh) sach;
                    sachGT.hienThiThongTinSachGiaoTrinh();
                } else if (sach instanceof SachTieuThuyet) {
                    System.out.println("Sach Tieu Thuyet:");
                    SachTieuThuyet sachTT = (SachTieuThuyet) sach;
                    sachTT.hienThiThongTinSachTieuThuyet();
                }
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
                SachGiaoTrinh sachGT = (SachGiaoTrinh) sach;
                sachGT.hienThiThongTinSachGiaoTrinh();
            } else if (sach instanceof SachTieuThuyet) {
                System.out.println("Sach Tieu Thuyet:");
                SachTieuThuyet sachTT = (SachTieuThuyet) sach;
                sachTT.hienThiThongTinSachTieuThuyet();
            }
        }

    }

    @Override
    public void capnhatSach() {
        int chon;
        while (true) {
            try {
                System.out.println("Chon loai sach can cap nhat: 1. Sach giao trinh, 2. Sach tieu thuyet");
                chon = Integer.parseInt(sc.nextLine().trim());
                if (chon == 1 || chon == 2)
                    break;
                System.out.println("Chi duoc chon 1 hoac 2!");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so 1 hoac 2!");
            }
        }
        if (chon == 1) {
            System.out.println("Nhap ma sach can cap nhat: ");
            String maSach = sc.nextLine();
            System.out.println("Noi dung can cap nhat:");
            System.out.println("1. Cap nhat tieu de");
            System.out.println("2. Cap nhat tac gia");
            System.out.println("3. Cap nhat nam xuat ban");
            System.out.println("4. Cap nhat so luong");
            System.out.println("5. Cap nhat gia co ban");
            System.out.println("6. Cap nhat mon hoc");
            System.out.println("7. Cap nhat cap do");
            System.out.println("0. Thoat");
            System.out.println("Chon thao tac can thuc hien: ");
            int thaoTac = Integer.parseInt(sc.nextLine().trim());
            for (Sach sach : danhSachSach) {
                if (sach.getMaSach().equals(maSach) && sach instanceof SachGiaoTrinh) {
                    SachGiaoTrinh sachGT = (SachGiaoTrinh) sach;
                    switch (thaoTac) {
                        case 1:
                            System.out.println("Nhap tieu de moi:");
                            String tieuDe = sc.nextLine();
                            sachGT.setTieuDe(tieuDe);
                            break;
                        case 2:
                            System.out.println("Nhap tac gia moi: ");
                            String tacGia = sc.nextLine();
                            sachGT.setTacGia(tacGia);
                            break;
                        case 3:
                            while (true) {
                                try {
                                    System.out.println("Nhap nam xuat ban moi: ");
                                    int namXuatBan = Integer.parseInt(sc.nextLine().trim());
                                    if (namXuatBan <= 0) {
                                        System.out.println("Nam xuat ban phai lon hon 0!");
                                        continue;
                                    }
                                    sachGT.setNamXuatBan(namXuatBan);
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Loi: vui long nhap so hop le!");
                                }
                            }
                            break;
                        case 4:
                            while (true) {
                                try {
                                    System.out.println("So luong moi: ");
                                    int soLuong = Integer.parseInt(sc.nextLine().trim());
                                    if (soLuong < 0) {
                                        System.out.println("So luong khong duoc am!");
                                        continue;
                                    }
                                    sachGT.setSoLuong(soLuong);
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Vui long nhap so!");
                                }
                            }
                            break;
                        case 5:
                            while (true) {
                                try {
                                    System.out.println("Nhap gia co ban moi:");
                                    double giaCoBan = Double.parseDouble(sc.nextLine().trim());
                                    if (giaCoBan <= 0) {
                                        System.out.println("Gia phai lon hon 0!");
                                        continue;
                                    }
                                    sachGT.setGiaCoBan(giaCoBan);
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Loi: vui long nhap so hop le!");
                                }

                            }

                            break;
                        case 6:
                            System.out.println("Nhap mon hoc moi: ");
                            String monHoc = sc.nextLine();
                            sachGT.setmonHoc(monHoc);
                            break;
                        case 7:
                            System.out.println("Nhap cap do moi: ");
                            String capDo = sc.nextLine();
                            sachGT.setcapDo(capDo);
                            break;
                        case 0:
                            return;
                        default:
                            System.out.println("Thao tac khong hop le!");
                    }
                    System.out.println("Cap nhat sach thanh cong!");
                    return;
                }
            }
        }

        else if (chon == 2) {
            System.out.println("Nhap ma sach can cap nhat: ");
            String maSach = sc.nextLine();
            System.out.println("Noi dung can cap nhat: ");
            System.out.println("1. Cap nhat tieu de");
            System.out.println("2. Cap nhat tac gia");
            System.out.println("3. Cap nhat nam xuat ban");
            System.out.println("4. Cap nhat so luong");
            System.out.println("5. Cap nhat gia co ban");
            System.out.println("6. Cap nhat the loai");
            System.out.println("7. Cap nhat la sach series");
            System.out.println("0. Thoat");
            System.out.println("Chon thao tac can thuc hien: ");
            int thaoTac = Integer.parseInt(sc.nextLine().trim());
            for (Sach sach : danhSachSach) {
                if (sach.getMaSach().equals(maSach) && sach instanceof SachTieuThuyet) {
                    SachTieuThuyet sachTT = (SachTieuThuyet) sach;
                    switch (thaoTac) {
                        case 1:
                            System.out.println("Nhap tieu de moi:");
                            String tieuDe = sc.nextLine();
                            sachTT.setTieuDe(tieuDe);
                            break;
                        case 2:
                            System.out.println("Nhap tac gia moi: ");
                            String tacGia = sc.nextLine();
                            sachTT.setTacGia(tacGia);
                            break;
                        case 3:
                            while (true) {
                                try {
                                    System.out.println("Nhap nam xuat ban moi: ");
                                    int namXuatBan = Integer.parseInt(sc.nextLine().trim());
                                    if (namXuatBan <= 0) {
                                        System.out.println("Nam xuat ban phai lon hon 0!");
                                        continue;
                                    }
                                    sachTT.setNamXuatBan(namXuatBan);
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Loi: vui long nhap so hop le!");
                                }
                            }
                            break;
                        case 4:
                            while (true) {
                                try {
                                    System.out.println("So luong moi: ");
                                    int soLuong = Integer.parseInt(sc.nextLine().trim());
                                    sachTT.setSoLuong(soLuong);
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Loi: vui long nhap so hop le!");
                                }
                            }
                            break;
                        case 5:
                            while (true) {
                                try {
                                    System.out.println("Nhap gia co ban moi:");
                                    double giaCoBan = Double.parseDouble(sc.nextLine().trim());
                                    sachTT.setGiaCoBan(giaCoBan);
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Loi: vui long nhap so hop le!");
                                }
                            }
                            break;
                        case 6:
                            System.out.println("Nhap the loai moi: ");
                            String theLoai = sc.nextLine();
                            sachTT.settheLoai(theLoai);
                            break;
                        case 7:
                            System.out.println("Nhap la sach series (Co/Khong): ");
                            String laSachSeriesInput = sc.nextLine().trim();
                            boolean laSachSeries = laSachSeriesInput.equalsIgnoreCase("Co");
                            sachTT.setlaSachSeries(laSachSeries);
                            break;
                        case 0:
                            return;
                        default:
                            System.out.println("Thao tac khong hop le!");
                    }
                    System.out.println("Cap nhat sach thanh cong!");
                    return;
                }
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
                if (sach instanceof SachGiaoTrinh) {
                    System.out.println("Sach Giao Trinh:");
                    SachGiaoTrinh sachGT = (SachGiaoTrinh) sach;
                    sachGT.hienThiThongTinSachGiaoTrinh();
                } else if (sach instanceof SachTieuThuyet) {
                    System.out.println("Sach Tieu Thuyet:");
                    SachTieuThuyet sachTT = (SachTieuThuyet) sach;
                    sachTT.hienThiThongTinSachTieuThuyet();
                }
            }
        }
    }

}