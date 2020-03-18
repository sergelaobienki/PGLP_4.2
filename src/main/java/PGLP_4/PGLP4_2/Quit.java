package PGLP_4.PGLP4_2;

public class Quit implements GeneriqueCommand  {

		
		private final GeneriqueCommand quit; 
		
		public Quit(GeneriqueCommand quit) {
			this.quit=quit;
			
		}

		public void apply() {
			// TODO Auto-generated method stub
			quit.Quit();
			
		}

		public void quit() {
			// TODO Auto-generated method stub
			
		}

		public void undo() {
			// TODO Auto-generated method stub
			
		}

		public void Quit() {
			// TODO Auto-generated method stub
			
		}

		public void Undo() {
			// TODO Auto-generated method stub
			
		}

}
