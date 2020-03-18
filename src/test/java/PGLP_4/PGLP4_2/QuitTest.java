package PGLP_4.PGLP4_2;

import org.junit.Test;

public class QuitTest {

	@Test
	public void test() {
		
		Generic genericProg=new Generic();
		
		GeneriqueCommand quitprog = new Quit(genericProg);
		
		Interpreteur commanGenrric = new Interpreteur();
		commanGenrric.register("Quit", quitprog);
		
		commanGenrric.execute("Quit");;
		
	}
}
