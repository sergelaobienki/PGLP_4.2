package PGLP_4.PGLP4_2;

import java.util.EmptyStackException;
import java.util.Stack;

public class MoteurRPN {
	
	private static final GeneriqueCommand CommandQuit = null;

	private static final GeneriqueCommand CommandUndo = null;

	/**
	 * La Pile qui va stocke les operandes
	 */
    private Stack <Double> pile =new Stack<>();
	
    /**
     * les commandes specifiques pour les operations
     */
	private Specific specificProg=new Specific();
	private SpecificCommand calculplus = new(specificProg,this);
	private SpecificCommands calculmoins = new Soustraction(specificProg,this);
	
	/**
	 * les commandes generiques
	 */
	private Generic genericProg= new Generic();
	private GeneriqueCommand commandquit= new Quit(genericProg);
	private GeneriqueCommand commandundo= new Undo(genericProg);
	
	private Interpreteur interpre = new Interpreteur();
	
	
	/**
	 * Initialisation de l'interpretateur
	 * @param CalculSoustraction 
	 * @param CalculAddition 
	 */
	public void initMoteurRpn(GeneriqueCommand CalculSoustraction, GeneriqueCommand CalculAddition) {
		interpre.register("+", CalculAddition);
		interpre.register("-", CalculSoustraction);
		interpre.register("Quit", CommandQuit);
		interpre.register("Undo", CommandUndo);
	}
	
    
    /**
     * Methode d'enregistrement des operandes
     * @param operande
     */
	public void enregistrer (double operande)
    {
        this.pile.push(operande);
    }
	
	/**
     * Methode retour des operandes
     * @param operande
     */
    public double depiler(){
    	
    		if(this.pile.isEmpty()) {
    			System.out.println("Ajoutez une operande de plus ..");
   	    		throw new EmptyStackException() ;
    		}
    		else
    		{
    			return pile.pop();
    		}
		
    }
    
    /**
     * Methode qui execute la commande correspond passer
     * @param commande
     */
    public void apply  (String commande)
     {
    	try {
        	interpre.execute(commande);
    	}catch (IllegalStateException e) {
			// TODO: handle exception
		}
     }
    
    /**
     * Methode d'affichage de l'expression courante 
     */
    public void affiche() {
    	System.out.print("L'expression courante est:\t");
    	if(!this.pile.isEmpty()) {
    		for(int i=0;i< this.pile.size();i++){
    			System.out.print(this.pile.elementAt(i)+"\t");
    		}	
    	}
    	System.out.println("");
    }

}