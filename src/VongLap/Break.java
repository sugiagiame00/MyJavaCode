package VongLap;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;
	    Scanner scanner = new Scanner(System.in);   
	     
	    do {
	        System.out.println("Nhập vào số:");
	        i = scanner.nextInt();
	 
	        /*
	         * Nếu số nhập < 0 thì sẽ kết thúc vòng lặp 
	         * và thực hiện câu lệnh bên ngoài vòng lặp.
	         */
	        if (i < 0) {
	            break;
	        }
	        sum += i;
	    } while (i >= 0);    // i còn lớn hơn hoặc bằng 0 thì còn tiếp tục
	         
	    System.out.println("Kết quả = " + sum);
	}
	
	}


