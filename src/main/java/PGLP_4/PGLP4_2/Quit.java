package PGLP_4.PGLP4_2;

public class Quit implements GeneriqueCommand  {

		
private final Generic quit; 
	
	public Quit(Generic quit) {
		this.quit=quit;
		
	}

	public void apply() {
		// TODO Auto-generated method stub
		quit.quit();
		

}
}
