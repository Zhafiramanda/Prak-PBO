public class PolimorfismeCoercion{
	
	public static int kuadarat(int bilangan){
		return bilangan*bilangan;
	}
	
	public static void main(String[] args){
		//deklrasi objek integer
		Integer bilangan = 10;
		
		//objek integer 'dipaksa' untuk diubah
		//menjadi primitif
		int hasilKuadarat = kuadarat(bilangan);
		
		System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadarat);
	}
}	