package PGLP_4.PGLP4_2;

import java.util.HashMap;

public class Interpreteur {
	
	private final HashMap<String, Command> commandMap = new HashMap<String, Command>();
	 
	public void register(String commandName, Command command) {
	        commandMap.put(commandName, command);
	    }
	    
	public void execute(String commandName) {
	        Command command = commandMap.get(commandName);
	        try {
	        	if (command == null) {
		        	System.out.println("erreur de commande ...");
		            throw new IllegalStateException("no command registered for " + commandName);
		        }
	        command.apply();
	        
	        } catch (IllegalStateException e) {
	        	
	        }
	}
	}
