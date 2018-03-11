package Loops;

import java.util.List;

public class Tests1000 {

	public static boolean noDublicate(int[] list) {
		if (list.length <= 0)
			return false;
		for (int i = 0; i < list.length; i++) {
			for (int j = 1; j < list.length; j++) {
				if ((list[i] == list[j]) && (i != j)) {
					return true;
				}
			}
		}
		return false;
	}
//-------------------------------------------------------------
	public static boolean noDublicate2(List<Integer> listArr) {
		if (listArr.size() <= 1) return false;
		for (int i = 0; i < listArr.size(); i++) {
			for (int j = i + 1; j < listArr.size(); j++) {
				if ((listArr.get(i) == listArr.get(j))) {
					return true;
				}
			}
		}
		return false;
	}

}
