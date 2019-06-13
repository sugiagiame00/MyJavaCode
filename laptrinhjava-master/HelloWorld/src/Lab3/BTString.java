package Lab3;
import java.util.Scanner;
public class BTString {

	public static void main(String[] args) {
	    String chuoi1, chuoi2;
	    int result;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào chuỗi thứ nhất: ");
	    chuoi1 = scanner.nextLine();
	    System.out.println("Nhập vào chuỗi thứ hai: ");
	    chuoi2 = scanner.nextLine();
	         
	    System.out.println("Kết quả so sánh sử dụng hàm compareTo(): ");
	    // so sánh 2 chuỗi sử dụng hàm compareTo()
	    // compareTo(): so sánh có phân biệt chữ hoa chữ thường
	    // nếu biến result < 0 thì chuỗi 1 < chuỗi 2
	    // nếu biến result > 0 thì chuỗi 1 > chuỗi 2
	    // nếu biến result == 0 thì chuỗi 1 = chuỗi 2
	    result = chuoi1.compareTo(chuoi2);
	    if (result < 0) {
	        System.out.println("Chuỗi " + chuoi1 + " nhỏ hơn " + chuoi2);
	    } else if (result > 0) {
	        System.out.println("Chuỗi " + chuoi1 + " lớn hơn " + chuoi2);
	    } else {
	        System.out.println("Chuỗi " + chuoi1 + " bằng " + chuoi2);
	    }
	         
	    System.out.println("Kết quả so sánh sử dụng hàm compareToIgnoreCase(): ");
	    // so sánh 2 chuỗi sử dụng hàm compareToIgnoreCase()
	    // compareToIgnoreCase(): so sánh không phân biệt chữ hoa chữ thường
	    // nếu biến result < 0 thì chuỗi 1 < chuỗi 2
	    // nếu biến result > 0 thì chuỗi 1 > chuỗi 2
	    // nếu biến result == 0 thì chuỗi 1 = chuỗi 2
	    result = chuoi1.compareToIgnoreCase(chuoi2);
	    if (result < 0) {
	        System.out.println("Chuỗi " + chuoi1 + " nhỏ hơn " + chuoi2);
	    } else if (result > 0) {
	        System.out.println("Chuỗi " + chuoi1 + " lớn hơn " + chuoi2);
	    } else {
	        System.out.println("Chuỗi " + chuoi1 + " bằng " + chuoi2);
	    }
	    scanner.close();
	}
}
