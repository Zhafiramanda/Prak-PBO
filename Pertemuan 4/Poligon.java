/**
  * File : Poligon.java 08/03/20023
  * Penulis : Zhafira Amanda
  * Deskripsi : representasi dasar dari objek poligon (segi banyak)
  */
  
package org.Poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public Poligon(){
		this.jumlahSisi = 0;
	} 
	public void setJumlahSisi(int jumlahSisi){
		this.jumlahSisi = jumlahSisi;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}