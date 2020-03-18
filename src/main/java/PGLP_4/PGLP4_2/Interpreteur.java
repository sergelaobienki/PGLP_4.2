package PGLP_4.PGLP4_2;

import java.util.HashMap;

public class Interpreteur {
 private final HashMap<String, Command> commandMap = new HashMap<String, Command>();
	 
	 public void register(String commandName, GeneriqueCommand quitprog) {
	        commandMap.put(commandName, (Command) quitprog);
	    }
	    
	    public void execute(String commandName) {
	        Command command = commandMap.get(commandName);
	        if (command == null) {
	            throw new IllegalStateException("no command registered for " + commandName);
	        }
	        command.apply();
	    }
}
