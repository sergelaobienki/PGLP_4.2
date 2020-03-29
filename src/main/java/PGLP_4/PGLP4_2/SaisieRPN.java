package PGLP_4.PGLP4_2;

import java.util.Scanner;

public class SaisieRPN {
	
	private Scanner rep=new Scanner(System.in);
	private MoteurRPN Moteur=new MoteurRPN();
	private String saisie=new String();
	
	/**
	 * Fonction d'interaction avec l'utilisateur et qui invoque le Moteur RPN
	 * d'oprande pour effectuer un calcul
	 * 
	 */
	public void reception()
	{
		Moteur.initMoteurRPN();
		System.out.println("L'expression courante est: ");
		do{
			this.saisie=rep.nextLine();
			if(verifisaisie(this.saisie)==false){
					Moteur.apply(this.saisie);
			}else{
			
				Moteur.enregistrer(Double.parseDouble(saisie));
			}
			
			Moteur.affiche();
		
		}while(true);
		
	}
	
	/**
	 * Fonction qui permet de verifier si utilisateur a saisie une operande ou un operateur
	 * et renvoi un booleen
	 * @param val : valeur saisie par utilisateur
	 * @return Renvoi Vrai si c'est une operande et Faux si non
	 */
	private boolean verifisaisie(String val){
		try{
			double test=Double.parseDouble(val);
		}
		catch(Exception e)
		{
			return false;
		} 
		return true;
		
	}



}