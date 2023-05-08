/**
  * File : Programmer.java 07/05/2023
  * Penulis : Zhafira Amanda
  * Deskripsi : Kelas Programmer yang merupakan turunan dari kelas Pegawai
 **/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+bonus);
    }
}
