package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarfeCevir() {
		String ornek = "Merhaba Arkadaşlar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		assertEquals("MERHABA ARKADAŞLAR",sonuc);
	}

}
