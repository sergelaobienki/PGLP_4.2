package PGLP_4.PGLP4_2;

public  class Undo implements GeneriqueCommand {

	private final Generic Undo; 
	
	public Undo(Generic undo) {
		this.Undo=undo;
		
	}
	public void apply() {
		// TODO Auto-generated method stub
		Undo.undo();;
		
	}

	
}
