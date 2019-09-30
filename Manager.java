package thucHanh2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	private static String name;
	private static String que;
	private static int namSinh;
	private static int soNamCT;
	private NhanVien nhanVien;
	private List<NhanVien> list = new ArrayList<NhanVien>();
	private Scanner scanner;
	// phuong thuc khoi tao ham quan ly
	public Manager(NhanVien nhanVien, List<NhanVien> list, Scanner scanner) {
		this.list = list;
		this.nhanVien = nhanVien;
		this.scanner = scanner;
	}
	// ham nhap vao tu ban phim
	public   void input() {
		scanner.nextLine();
		System.out.println("Nhap vao ten nhan vien :");
		name = scanner.nextLine();
		System.out.println("Nhap vao que quan nhan vien :");
		que = scanner.nextLine();
		System.out.println("Nhap vao nam sinh :");
		namSinh = scanner.nextInt();
		System.out.println("Nhap vao so nam cong tac :");
		soNamCT = scanner.nextInt();
		System.out.println("DONE !");
		NhanVien nhanVien = new NhanVien(name, namSinh, que, soNamCT);
		list.add(nhanVien);
	}
	// phuong thuc dung edit
	public  void edit() {
		System.out.println("Nhap vao ten Nhan vien can sua :");
		scanner.nextLine();
		String keyName = scanner.nextLine();
		int size = list.size();
		for(int i = 0; i<size; i++) {
			if(keyName.equals(list.get(i).getName())) {
				System.out.println("Nhap vao ten nhan vien :");
				name = scanner.nextLine();
				System.out.println("Nhap vao que quan nhan vien :");
				que = scanner.nextLine();
				System.out.println("Nhap vao nam sinh :");
				namSinh = scanner.nextInt();
				System.out.println("Nhap vao so nam cong tac :");
				soNamCT = scanner.nextInt();
				list.get(i).setName(name);
				list.get(i).setQue(que);
				list.get(i).setNamSinh(namSinh);
				list.get(i).setSoNamCT(soNamCT);
				System.out.println("DONE !");
				break;
			}
		}
	}
	// phuong thuc dung de xoa
	public  void delete() {
		NhanVien nhanVien = null;
		scanner.nextLine();
		String keyName = scanner.nextLine();
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if(keyName.equals(list.get(i).getName())) {
				nhanVien = list.get(i);
				break;
			}
		}
		list.remove(nhanVien);
	}
	// phuong thuc so sanh
	public void SoSanhNamCT() {
		Collections.sort(list, new ComparationY() );
	}
	public void SoSanhTuoi() {
		Collections.sort(list, new compareY1());
	}
}
