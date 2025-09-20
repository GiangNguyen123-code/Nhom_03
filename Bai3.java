import java.util.Scanner;
public class Bai3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Tong: "+(a+b));
        System.out.println("Hieu: "+(a-b));
        System.out.println("Tich: "+(a*b));
        if(b!=0){
            System.out.println("Thuong: "+(a/b));
            System.out.println("Phan du: "+(a%b));
        }else System.out.println("Khong the chia cho 0");
        sc.close();
    }
}
