public class sachgiaotrinh extends sach{
    private String monhoc;
    private String capdo;
    public sachgiaotrinh(){
        super();
    }
    public sachgiaotrinh(String masach, String tieude, String tacgia, int namxuatban, int soluong, String monhoc, String capdo, double giacoban){
        super(masach,tieude,tacgia,namxuatban,soluong,giacoban);
        this.monhoc= monhoc;
        this.capdo= capdo;
    }
    public void setmonhoc(String monhoc){
        this.monhoc=monhoc;
    }
    public String getmonhoc(){
        return monhoc;
    }
    public void setcapdo(String capdo){
        this.capdo=capdo;
    }
    public String getcapdo(){
        return capdo;
    }
    @Override
    public double tinhgiaban(){
        int sonam = 2025 - namxuatban;
        return giacoban + (sonam*5000);
    }
    @Override 
    public void hienthithongtin(){
        super.hienthithongtin();
        System.out.println("Mon hoc:"+monhoc);
        System.out.println("Cap do:"+capdo);
        System.out.println("Gia ban:"+tinhgiaban()+"VND");
    }
}