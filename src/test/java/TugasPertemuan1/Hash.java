package TugasPertemuan1;

import java.util.HashMap;

public class Hash {
	public static void main (String[] args) {
		
		
		HashMap<Integer, String> nomorpunggung = new HashMap<Integer, String>();
		nomorpunggung.put(7, "Cristiano Ronaldo");
		nomorpunggung.put(10, "Lionel Messi");
		nomorpunggung.put(12,"Kylian Mbappe");
		
		System.out.println("Hashmap \t\t\t : " + nomorpunggung.entrySet());
		System.out.println("Ukuran Hashmap \t\t\t : " + nomorpunggung.size());
		
		for (Integer key : nomorpunggung.keySet()) {
			System.out.println("Nomor Punggung Pemain " + nomorpunggung.get(key) + "adalah " + key);
		}
	}

}
