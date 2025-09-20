import java.util.ArrayList;
import java.util.Scanner;
class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        for (int x : list) System.out.print(x + " ");
        sc.close();
    }
}
