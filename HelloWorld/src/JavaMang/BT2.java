package JavaMang;

import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
	    int n;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n <= 0);
	         
	    int A[] = new int[n];
	         
	    System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        A[i] = scanner.nextInt();
	    }
	         
	    // tìm và hiển thị các phần tử trong mảng chia hết cho 3
	    System.out.println("Các phần tử chia hết cho 3 là: ");
	    for (int i = 0; i < n; i++) {
	        if (A[i] % 3 == 0) {
	            System.out.print(A[i] + "\t");
	        }
	        scanner.close();
	    }
	}
}
