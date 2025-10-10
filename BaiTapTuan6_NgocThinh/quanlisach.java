import java.util.ArrayList;
public class quanlisach{
    private ArrayList<sach> danhsach = new ArrayList<>();
    public void themsach(sach s){
        danhsach.add(s);
    }
    public boolean xoasach(String masach){
        return danhsach.removeIf(s->s.getmasach().equalsIgnoreCase(masach));
    }
    public boolean capnhatsoluong(String masach, int soluongmoi){
        for(sach s: danhsach){
            if(s.getmasach().equalsIgnoreCase(masach)){
                s.setsoluong(soluongmoi);
            }
        }
        return false;
    }
    public sach timkiemtheoma(String masach){
        for(sach s: danhsach){
            if(s.getmasach().equalsIgnoreCase(masach)){
                return s;
            }
        }
        return null;
    }
    public void hienthidanhsach(){
        if(danhsach.isEmpty()){
            System.out.println("Danh sach trong!");
        }
        else{
            for(sach s: danhsach){
                System.out.println(s);
            }
        }
    }
}