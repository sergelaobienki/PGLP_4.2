package PGLP_4.PGLP4_2;

public interface GeneriqueCommand {
	public void Quit() {
		System.out.println("execution de la commande Quit");
	}
	
	public void Undo() {
		System.out.println("execution de la commande Undo");
	}

	void apply();

}
