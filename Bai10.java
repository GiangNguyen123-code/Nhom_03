import java.util.Scanner;

public class Bai10 {
  // Create an array of n elements from user input
  public static int[] create_array(Scanner sc, int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
      array[i] = sc.nextInt();
    }
    return array;
  }

  // Print the array
  public static void print_array(int[] array, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("A[" + (i + 1) + "] = " + array[i]);
    }
  }

  // Insert an element at a specified position
  public static int[] insert_element(int[] array, int n, int value, int pos) {
    if (pos < 1 || pos > n + 1) {
      System.out.println("Vi tri chen khong hop le.");
      return array;
    }
    int[] newArray = new int[n + 1];
    for (int i = 0; i < pos - 1; i++) {
      newArray[i] = array[i];
    }
    newArray[pos - 1] = value;
    for (int i = pos; i < n + 1; i++) {
      newArray[i] = array[i - 1];
    }
    return newArray;
  }

  // Delete an element at a specified position
  public static int[] delete_element(int[] array, int n, int pos) {
    if (pos < 1 || pos > n) {
      System.out.println("Vi tri xoa khong hop le.");
      return array;
    }
    int[] newArray = new int[n - 1];
    for (int i = 0; i < pos - 1; i++) {
      newArray[i] = array[i];
    }
    for (int i = pos; i < n; i++) {
      newArray[i - 1] = array[i];
    }
    return newArray;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so phan tu: ");
    int n = sc.nextInt();
    int[] array = create_array(sc, n);
    System.out.println("Danh sach ban dau:");
    print_array(array, n);

    // Insert
    System.out.print("Nhap gia tri can chen: ");
    int value = sc.nextInt();
    System.out.print("Nhap vi tri can chen (1-based): ");
    int posInsert = sc.nextInt();
    array = insert_element(array, n, value, posInsert);
    n++;
    System.out.println("Danh sach sau khi chen:");
    print_array(array, n);

    // Delete
    System.out.print("Nhap vi tri can xoa (1-based): ");
    int posDelete = sc.nextInt();
    array = delete_element(array, n, posDelete);
    n--;
    System.out.println("Danh sach sau khi xoa:");
    print_array(array, n);
  }
}
