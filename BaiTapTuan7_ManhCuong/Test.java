public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo đối tượng sách giáo trình
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2020, 10, 100000,
                                                "Cong nghe thong tin", "Dai hoc");

        // Tạo đối tượng sách tiểu thuyết
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2010, 5, 80000,
                                                "Phieu luu", true);

        ql.themSach(gt1);
        ql.themSach(tt1);

        ql.hienThiTatCa();
    }
}
