import java.util.Scanner;
    public class bai6{
        public static int ucln( int a, int b){
            int r;
            while (b != 0)
            {
            r=a%b;
            a=b;
            b=r;
            }
        return a;
        }
        public static int bcnn (int a, int b){
         return (a*b)/ucln(a,b);
        }
        public static void main(String[] args)
        {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so thu nhat:");
        int x = sc.nextInt();
        System.out.print("nhap so thu hai:");
        int y= sc.nextInt();
        int UCLN= ucln(x,y);
        int BCNN= bcnn(x,y);
        System.out.println("Uoc chung lon nhat " + x + " va " + y + " la: " +UCLN);
        System.out.println("Boi chung nho nhat " + x + " va " + y + " la: " +BCNN);
        sc.close();
        }
}
