package PGLP_4.PGLP4_2;

import org.junit.Test;

public class UndoTest {

	@Test
	public void test() {
		MoteurRPN moteur = new MoteurRPN();
		moteur.initMoteurRPN();
		moteur.enregistrer(2);
		moteur.enregistrer(2);
		moteur.affiche();
		moteur.apply("+");
		moteur.affiche();
		moteur.apply("undo");
		moteur.affiche();

	}

}