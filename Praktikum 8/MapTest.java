/**
 *Penulis : Zhafira Amanda 17/05/2023
 * File : MapTest.java
 * Deskripsi : program yang menggunakan Gneric untuk pasangan kunci-nilai
**/

import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai -> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> key = map.keySet();
		//iterasi untuk mengambil keseluruhan nilai dari kunci
		for (Integer k : key){
			String value = map.get(k);
			System.out.println(value);
		}
	}
}
