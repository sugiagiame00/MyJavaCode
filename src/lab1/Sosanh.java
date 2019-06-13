package lab1;
import java.util.Scanner;
public class Sosanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
		A = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		B = scanner.nextInt();
		System.out.println("Kết quả của so sánh bằng " + A + " và " + 
				B + " là " + (A == B));
		System.out.println("Kết quả của so sánh không bằng " + A + " và " + 
				B + " là " + (A != B));
		System.out.println("Kết quả của so sánh lớn hơn " + A + " và " + 
				B + " là " + (A > B));
		System.out.println("Kết quả của so sánh lớn hơn hoặc bằng " + A + " và " + 
				B + " là " + (A >= B));
		System.out.println("Kết quả của so sánh nhỏ hơn " + A + " và " + 
				B + " là " + (A < B));
		System.out.println("Kết quả của so sánh nhỏ hơn hoặc bằng " + A + " và " + 
				B + " là " + (A <= B));
		scanner.close();
	}

}
