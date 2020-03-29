package PGLP_4.PGLP4_2;

public class MoteurRPNTest {

	@Test
	public void test() {
		MoteurRPN moteur = new MoteurRPN();
		moteur.initMoteurRPN();
		moteur.enregistrer(5);
		moteur.enregistrer(5);
		moteur.apply("+");
		assertTrue(moteur.depiler()==10);
		moteur.enregistrer(5);
		moteur.enregistrer(5);
		moteur.apply("-");
		assertTrue(moteur.depiler()==0);
	}

}
