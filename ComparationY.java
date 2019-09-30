package thucHanh2;

import java.util.Comparator;

public class ComparationY implements Comparator<NhanVien> {

	@Override
	public int compare(NhanVien o1, NhanVien o2) {
		if(o1.getSoNamCT() < o2.getSoNamCT()) {
			return 1;
		}
		return -1;
	}
}
