/**
 * Penulis : Zhafira Amanda 31/05/2023
 * File : LambdaList.java
 * Deskripsi : implementasi lambda pada list, digunakan sebagai parameter pada method
**/

public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakab sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}