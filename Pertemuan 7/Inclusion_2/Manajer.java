/**
  * File : Manajer.java 07/05/2023
  * Penulis : Zhafira Amanda
  * Deskripsi : Kelas Manajer yang merupakan turunan dari kelas Pegawai
 **/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
