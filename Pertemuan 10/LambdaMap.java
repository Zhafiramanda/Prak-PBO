/**
 * Penulis : Zhafira Amanda 31/05/2023
 * File : LambdaMap.java
 * Deskripsi : implementasi lambda pada map
**/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(40100, "Zhafira Amanda");
        mahasiswaMap.put(40124, "Athiya Puteri Hidayat");
        mahasiswaMap.put(40164, "Zenobia Wirandi Zenaide");
        mahasiswaMap.put(30080, "Thifa Ziada Taqiyya");


        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
