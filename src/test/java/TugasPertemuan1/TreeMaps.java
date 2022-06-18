package TugasPertemuan1;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMaps {
	public static void main (String[] args) {
		
		
		TreeMap<Integer, String> nomorpunggung = new TreeMap<Integer, String>();
		nomorpunggung.put(7, "Cristiano Ronaldo");
		nomorpunggung.put(10, "Lionel Messi");
		nomorpunggung.put(12,"Kylian Mbappe");
		
		System.out.println("Treemap \t\t\t : " + nomorpunggung.entrySet());
		System.out.println("Ukuran Treemap \t\t\t : " + nomorpunggung.size());
		
		for (Integer key : nomorpunggung.keySet()) {
			System.out.println("Nomor Punggung Pemain " + nomorpunggung.get(key) + " adalah " + key);
		}
	}

}
