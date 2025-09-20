//Viết chương trình tính tổng các số từ 1 đến n.
import java.util.Scanner;

public class Bai4 {
    public static int sumOfN(int n){
    	int sum = 0;
        for(int i = 1; i <= n; i++){
        	sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
    	System.out.print("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfN(n);
        System.out.println("Tong tu 1 den n la: " + sum);
        sc.close();
    }
}

