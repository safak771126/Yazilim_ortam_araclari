package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarfeCevir() {
		String ornek = "Merhaba Arkada�lar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("MERHABA ARKADA�LAR",sonuc);
	}
	@Test
	public final void testBuyukHarfeCevirNullKontrolu() {
		String ornek = null;
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals(null,sonuc);
	}
	@Test
	public final void testBuyukHarfeCevirBosKontrolu() {
		String ornek = "";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("",sonuc);
	}

}
