package lab1;

import java.util.Scanner;

public class Inthongtinsinhvien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int year;
		String address, ketquaxeploai;
		double diemki1, diemki2, diemTb;
		Scanner scanner = new Scanner (System.in);
		for (int i=1; i<6; i++) {
		System.out.println(i);
		
		
		System.out.println("Nhap ho va ten cua sinh vien:");
		name = scanner.nextLine();
		System.out.println("nhap nam sinh cua sinh vien:");
		year = Integer.parseInt(scanner.nextLine()) ;
		System.out.println("nhap dia chi cua sinh vien:");
		address = scanner.nextLine();
		
		System.out.println("Nhap diem hoc ki 1:");
		diemki1 = scanner.nextDouble();
		System.out.println("Nhap diem hoc ki 2:");
		diemki2 = scanner.nextDouble();
		diemTb = ((diemki1 + diemki2*2)/3 );
		if (diemTb >=8.5) {
			ketquaxeploai = "Loai Gioi";
		}else if ((diemTb >=7) && (diemTb <8.5)){
			ketquaxeploai = "loai Kha";
		}else if ((diemTb >=5.5) && (diemTb <7)){
			ketquaxeploai = "loai TB";
		}else if ((diemTb >=4) && (diemTb <5.5)){
			ketquaxeploai = "loai yeu";
		}else{
			ketquaxeploai = "loai kem";
		}
		System.out.println("ho va ten cua sinh vien:" +name);
		System.out.println("tuoi cua sinh vien:" +year);
		System.out.println("dia chi cua sinh vien:" +address);
		System.out.println("diem trung binh:" +diemTb);
		System.out.println("ket qua xep loai:" + ketquaxeploai);
		scanner.nextLine();
	}
		scanner.close();
	}
}
