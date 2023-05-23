/**
 *Penulis : Zhafira Amanda 17/05/2023
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
**/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Salah satu cara untuk memberikan nama yang lebih deskriptif kepada parameter generik adalah dengan mengganti karakter 'T' dengan karakter lain,
//misalnya T1, T2, T1234. Pendekatan ini dimaksudkan untuk memberikan fleksibilitas 
//dalam penggunaan data dan juga untuk membedakan ketika ada lebih dari satu parameter generik dalam kelas tersebut.

