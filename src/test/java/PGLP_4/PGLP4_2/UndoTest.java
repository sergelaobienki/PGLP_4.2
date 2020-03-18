package PGLP_4.PGLP4_2;

import org.junit.Test;

public class UndoTest {

	@Test
	public void test() {
		Generic genericProg=new Generic();
		
		GeneriqueCommand undoprog = new Undo(genericProg);
		
		Interpreteur commandGenrric = new Interpreteur();
		commandGenrric.register("Undo", undoprog);
		
		commandGenrric.execute("Undo");
	}
}
