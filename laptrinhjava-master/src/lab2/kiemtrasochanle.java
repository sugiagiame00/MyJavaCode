package lab2;
import java.util.Scanner;
public class kiemtrasochanle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số cần kiểm tra: ");
        number = scanner.nextInt();
        if (number % 2 == 0) 
        {
            System.out.println(number + " là số chẵn");
        }
        else {
            System.out.println(number + " là số lẻ");
        	}
        scanner.close();
	}

}
