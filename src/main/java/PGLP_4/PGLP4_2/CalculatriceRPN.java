package PGLP_4.PGLP4_2;

import java.util.EmptyStackException;

public class CalculatriceRPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SaisieRPN cal = new SaisieRPN();
		try {
			cal.reception();
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}catch(EmptyStackException e) {
			
		}
	}

}