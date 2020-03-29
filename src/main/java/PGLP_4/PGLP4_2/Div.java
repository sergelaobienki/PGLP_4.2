package PGLP_4.PGLP4_2;

import java.util.EmptyStackException;

public class Div implements SpecificCommand {
	
	private final Specific calcul; 
	private final MoteurRPN moteur;
	
	public Div(Specific calcul,MoteurRPN moteur) {
		this.calcul=calcul;
		this.moteur=moteur;
	}

	/**
	 * Methode de calcul
	 */
	public void apply() {
		double a=0,b = 0;
		int vide=0;//variable permettant de verifier si la pile est ou contient plus d'un element
		try {
			a= moteur.depiler();
			vide++;
	    	b= moteur.depiler();
	    	
			if(a==0)
				throw new ArithmeticException() ;
			moteur.enregistrer(this.operation(b, a));
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("Ajoutez une operande ...");
			if(vide==1)
				moteur.enregistrer(a);
		}catch(ArithmeticException e) {
			System.out.println("Division par zero impossible ...");
			moteur.enregistrer(a);
		}
		
	}

	public double operation(double a, double b) {
		// TODO Auto-generated method stub
		return calcul.Div(a, b);
	}

	public void apply(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}


