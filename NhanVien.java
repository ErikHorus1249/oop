package thucHanh2;

public class NhanVien {

	private String name;
	private int namSinh;
	private String que;
	private int soNamCT;
	
	public NhanVien(String name, int namSinh, String que, int soNamCT) {
		this.name = name;
		this.namSinh = namSinh;
		this.que = que;
		this.soNamCT = soNamCT;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public int getSoNamCT() {
		return soNamCT;
	}
	public void setSoNamCT(int soNamCT) {
		this.soNamCT = soNamCT;
	}
	
}
