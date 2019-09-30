package thucHanh2;

import java.util.ArrayList;
import java.util.List;

public class Display {
	private List<NhanVien> dsNhanvien = new ArrayList<NhanVien>();
	// phuong thuc khoi tao ham hien thi
	public Display(List<NhanVien> dsNhanVien) {
		this.dsNhanvien = dsNhanVien;
	}
	// phuong thuc hien thi menu
	public void menu() {
		
		System.out.println("1. Nhap vao thong tin nhan vien.");
		System.out.println("2. Sua thong tin nhan vien.");
		System.out.println("3. Xoa thong tin nhan vien.");
		System.out.println("4. Liet ke danh sach nhan vien.");
		System.out.println("5. Xuat ra man hinh Top 2 nhan vien tham nien cao nhat.");
		System.out.println("6. Xuat ra man hinh Top 2 nhan vien nhieu tuoi nhat.");
		System.out.println("0. Thoat.");
		System.out.println();
	}
	// phuong thuc hien thi danh sach nhan vien
	public  void Show() {
		int id = 1;
		for (NhanVien nv : dsNhanvien) {
			System.out.println();
			System.out.format("%5d |" , id);
			System.out.format("%20s |", nv.getName());
			System.out.format("%5d |", nv.getNamSinh());
			System.out.format("%15s |", nv.getQue());
			System.out.format("%5d |", nv.getSoNamCT());
			id++;
		}
	}
	// phuong thuc hien thi top 2
	public void showTop21() {
		int id = 1;
		for (NhanVien nv : dsNhanvien) {
			System.out.println();
			System.out.format("%5d |" , id);
			System.out.format("%20s |", nv.getName());
			System.out.format("%5d |", nv.getNamSinh());
			System.out.format("%15s |", nv.getQue());
			System.out.format("%5d |", nv.getSoNamCT());
			if(id == 2) {
				break;
			}
			id++;
		}
	}
	
}
