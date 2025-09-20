import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        if(n<0)
            System.out.println("La so am");
        else {
                if(n>0)
                    System.out.println("La so duong");
                else
                    System.out.println("La so 0");
            }
    }
}
