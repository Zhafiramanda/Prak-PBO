/**
  * File : MLingkaran.java 28/03/2023
  * Penulis : Zhafira Amanda
  * Deskripsi : Implementasi untuk menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jari-jari lingkaran : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jari-jari "+jejari+" satuan adalah "+l.hitungLuas());
	}
}