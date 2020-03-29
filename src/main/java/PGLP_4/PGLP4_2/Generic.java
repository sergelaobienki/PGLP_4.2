package PGLP_4.PGLP4_2;

import java.util.Stack;

public class Generic {
	
	public void quit() {
		System.out.println("Commande \"quit\" executer");
		System.exit(0);
	}
	
	public void undo(Stack <Double> history,MoteurRPN moteur) {
		
		int i=0;
		if(history.size()>1) {
			moteur.depiler();
			history.remove(history.size()-1);
			while(i<2) {
				moteur.enregistrer(history.pop());
				i++;
			}
			while(!history.empty())
				history.pop();
		}
		
	}

}