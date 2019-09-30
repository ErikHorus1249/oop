package thucHanh2;

import java.util.Comparator;

public class compareY1 implements Comparator<NhanVien>{

	
	public int compare(NhanVien o1, NhanVien o2) {

		if(o1.getNamSinh() > o2.getNamSinh()) {
			return 1;
		}
		return -1;
	}

}
