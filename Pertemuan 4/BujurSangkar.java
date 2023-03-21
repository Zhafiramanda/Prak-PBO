package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.jumlahSisi = 4;
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
		
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}