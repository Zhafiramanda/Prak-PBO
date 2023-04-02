/**
  * File : AngkaSialException.java 29/03/2023
  * Penulis : Zhafira Amanda
  * Deskripsi : Eksepsi buat sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukan angka 13 karena angka sial !!!");
	}
}
