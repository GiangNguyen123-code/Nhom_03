/*Viết chương trình thực hiện các phép tính cơ bản (cộng, trừ, nhân, chia) dựa trên lựa chọn của người dùng.*/
import java.util.Scanner;
public class Bai3{
    public static double basicOperators(Scanner sc, double x, double y){
        System.out.print("1.Phep cong\n2.Phep tru\n3.Phep nhan\n4.Phep chia\n");
        int choice = sc.nextInt();
        double z;
            switch(choice){
                case 1:
                    z = x + y;
                    break;
                case 2:
                    z = x - y;
                    break;
                case 3:
                    z = x * y;
                    break;
                case 4:
                    if(y == 0){
                        System.out.println("Khong chia duoc cho 0");
                        z = Double.NaN;
                    }else{
                        z = x / y;
                    }
                    break;
                default:
                    System.out.println("Nhap sai!");
                    z = Double.NaN;
                    break;
            }
        return z;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap 2 so:");
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double z = basicOperators(sc,x,y);
    System.out.println("Ket qua la: " + z);
    sc.close();
    }
}