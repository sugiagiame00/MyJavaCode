package lab2;
import java.util.Scanner;
public class timsolonnhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, solonnhat;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        c = scanner.nextInt();
        if (a >= b){
            if (a >= c) {
                solonnhat = a;
            } else {
                solonnhat = c;
            }
        } else if (b >= c) {
            solonnhat = b;
        } else {
            solonnhat = c;
        }
        System.out.println("Số lớn nhất trong 3 số " + a + ", " + b + 
                        " và " + c + " là " + solonnhat);
		scanner.close();

	}

}
