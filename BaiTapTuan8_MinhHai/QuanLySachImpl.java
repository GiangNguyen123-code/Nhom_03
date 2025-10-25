import java.util.ArrayList;
import java.util.Iterator;

public class QuanLySachImpl implements IQuanLySach{
    private ArrayList<Sach> books = new ArrayList<Sach>();
    @Override
    public void themSach(Sach sach) {
        books.add(sach);
        System.out.println("Da them "+ sach.getTieuDe()+" thanh cong.");
    }
    @Override
    public int timKiemSach(Sach sach){
        if(books.contains(sach)){
            return books.indexOf(sach);
        }
        return -1;
    }
    @Override
    public boolean xoaSach(Sach sach){
        if(books.contains(sach)){
            books.remove(sach);
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void hienThiDanhSach(){
        Iterator<Sach> iterator = books.iterator();
        while (iterator.hasNext()){
            iterator.next().hienThiThongTin();
        }
    }
}
