package PGLP_4.PGLP4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRPNTest {

	@Test
	public void test() {
		MoteurRPN moteur = new MoteurRPN();
		moteur.initMoteurRPN();
		moteur.enregistrer(2);
		moteur.enregistrer(2);
		moteur.apply("+");
		assertTrue(moteur.depiler()==5);
		moteur.enregistrer(5);
		moteur.enregistrer(5);
		moteur.apply("-");
		assertTrue(moteur.depiler()==0);
		moteur.enregistrer(5);
		moteur.enregistrer(5);
		moteur.apply("*");
		assertTrue(moteur.depiler()==15);
		moteur.enregistrer(5);
		moteur.enregistrer(5);
		moteur.apply("/");
		assertTrue(moteur.depiler()==3);
		
	}

}