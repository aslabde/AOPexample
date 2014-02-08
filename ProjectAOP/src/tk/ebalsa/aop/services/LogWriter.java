package tk.ebalsa.aop.services;

import java.io.IOException;

public interface LogWriter {
	
	//adds new entry to log	
	public void writeLogEntry (String entry) throws IOException;

}
