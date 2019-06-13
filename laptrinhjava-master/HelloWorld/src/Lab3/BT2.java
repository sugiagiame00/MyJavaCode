package Lab3;
import java.util.Scanner;
public class BT2 {

	public static void main(String[] args) {
	    int lineNumber;
	    String chuoi = "HelloWorld!";
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số nguyên bất kỳ: ");
	        lineNumber = scanner.nextInt();
	    } while (lineNumber < 1);
	         
	    for (int i = 0; i < lineNumber; i++) {
	        System.out.println(chuoi);
	    }
	    scanner.close();
	}
}
