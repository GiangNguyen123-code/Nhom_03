import java.util.Scanner;
public class bai8{
    public static void main( String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap vao so phan tu:");
        int n = sc.nextInt();
        int[] ds= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("nhap vao phan tu thu "+i+":");
            ds[i]= sc.nextInt();
        }
        int phantumax = ds[0];
        int solanmax = 0;
        for(int k=0;k<n;k++)
        {
            int dem=0;
            for(int j=0;j<n;j++)
            {
                if(ds[k]==ds[j])
                    dem++;
            }
            if(dem>solanmax)
            {
            solanmax=dem;
            phantumax=ds[k];
        }
        }
        System.out.println("phan tu xuat hien nhieu nhat: "+phantumax);
        System.out.println("Xuat hien "+solanmax+"lan");
}
}