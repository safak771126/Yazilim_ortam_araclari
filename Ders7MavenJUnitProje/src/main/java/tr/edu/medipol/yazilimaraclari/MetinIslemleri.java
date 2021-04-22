package tr.edu.medipol.yazilimaraclari;

public class MetinIslemleri {

	public static void main(String[] args) {
		String ornek = "Merhaba Arkadaþlar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		System.out.print(ornek + " -> " +sonuc);

	}

	static String buyukHarfeCevir(String orjinalMetin) {
		if(orjinalMetin == null) {
			return orjinalMetin;
		}
		return orjinalMetin.toUpperCase();
	}
}
