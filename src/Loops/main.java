package Loops;

import java.util.ArrayList;
import java.util.List;

public class main extends Tests1000 {

	public static void main(String[] args) {
		int[] a = {4,6,1,3};
		System.out.println(noDublicate(a)+" int");
		
		List<Integer> b = new ArrayList();
		b.add(1);
		b.add(2);
		b.add(6);
		b.add(11);
		b.add(12);
		b.add(10);
		System.out.println(noDublicate2(b)+" List");
	}

}
