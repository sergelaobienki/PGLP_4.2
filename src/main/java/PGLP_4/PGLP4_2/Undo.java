package PGLP_4.PGLP4_2;

public abstract class Undo implements GeneriqueCommand {

	private final Generic undo; 
	
	public Undo(Generic undo) {
		this.undo=undo;
		
	}
	public void apply() {
		// TODO Auto-generated method stub
		undo.undo();;
		
	}

	
}
