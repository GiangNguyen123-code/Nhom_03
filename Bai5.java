import java.util.Scanner;
class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i * i <= n && isPrime; i++) if (n % i == 0) isPrime = false;
        System.out.println(isPrime ? "YES" : "NO");
        sc.close();
    }
}
