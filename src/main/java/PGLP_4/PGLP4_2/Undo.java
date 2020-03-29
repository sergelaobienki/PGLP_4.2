package PGLP_4.PGLP4_2;
import java.util.Stack;

public class Undo implements GeneriqueCommand {
	
	private final Generic undo; 
	private final Stack <Double> history;
	private final MoteurRPN moteur;
	public Undo(Generic undo,Stack <Double> history,MoteurRPN moteur) {
		this.moteur = moteur;
		this.undo=undo;
		this.history=history;
		
	}

	public void apply() {
		// TODO Auto-generated method stub
		undo.undo(this.history,this.moteur);
		
		
	}
	
	

}