/**
 *Penulis : Zhafira Amanda 17/05/2023
 * File : ArrayListTest.java
 * Deskripsi : program penggunaan objek ArrayListTest sebagai Collection class
**/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArrayList yang hanya dapat
		//berisi onjek String
		ArrayList<String> strings = new ArrayList<String>();
		// menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan geneerics");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}