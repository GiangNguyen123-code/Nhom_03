package BAITAP;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        if (b != 0) {
            System.out.println("Thương: " + (a / b));
            System.out.println("Phần dư: " + (a % b));
        } else {
            System.out.println("Không thể chia cho 0");
        }
    }
}
