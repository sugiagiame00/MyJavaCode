package JavaMang;

import java.util.Scanner;

public class TTvaTBC {

	public static void main(String[] args) {
	    int n, sum = 0, k;
	    float TBC;	    
	    Scanner scanner = new Scanner(System.in);    
	    do {
	        System.out.println("Nhập vào số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n < 0);
	         
	    int array[] = new int[n];
	    for (k=0; k<10; k++)
	    {
	         
	    System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        array[i] = scanner.nextInt();
	    }
	         
	    System.out.println("\nMảng ban đầu: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	         
	    for (int i = 0; i < n; i++) {
	        sum += array[i];
	    }
	    System.out.println("\nTổng các phần tử có trong mảng = " + sum);
	    
	    TBC = sum / n;

	    System.out.println ("trung binh cong cua mang:"+TBC);
	    
	    } 
	    scanner.close();

	}
	
}
