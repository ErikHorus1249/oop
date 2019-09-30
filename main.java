package thucHanh2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// khoi tao cac doi duong quan ly, hien thi, danh sach
		int n;
		Scanner scanner = new Scanner(System.in);
	    List<NhanVien> dsNhanvien = new ArrayList<NhanVien>();
	    Display display = new Display(dsNhanvien);
	    NhanVien nv = null;
	    Manager boss = new Manager(nv, dsNhanvien, scanner);
	    display.menu();// hien thi menu
	    // menu chay ket hop do-while va Switch-Case
		do {
			System.out.println("Let PRESS : ");
			n = scanner.nextInt();// nhap vao tinh nang
			int value = n;
			switch (value) {
			case 1:// nhap vao thong tin
				boss.input();
				break;
			case 2:// sua thong tin theo ten
				boss.edit();
				break;
			case 3:// xoa thong tin theo ten
				boss.delete();
				break;
			case 4://hien thi danh sach nhan vien
				display.Show();
				break;
			case 5://so sanh va hie thi hai nhan vien tham nien lau nam
				boss.SoSanhNamCT();	
				display.showTop21();
				break;
			case 6:// so sanh va hien thi hai nhan vien cao tuoi
				boss.SoSanhTuoi();
				display.showTop21();
				break;

			default:
				System.out.println("EXIT !");//thoat
				break;
			}
			System.out.println();
		}while(n!=0);

	}

}
