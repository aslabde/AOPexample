package tk.ebalsa.aop.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class LogWriterImpl implements LogWriter  {

	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
//adds new entry to log	
public void writeLogEntry (String entry) throws IOException{
	Date date = new Date();
	StringBuilder sb = new StringBuilder();
	sb.append(dateFormat.format(date)).
	append(" ").
	append(entry);
	File file =new File("C:\\aplis\\log.txt");
	
		
	try {
		if(!file.exists()){
			file.createNewFile();
		}
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
	    out.println(sb.toString());
	    out.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		
		e.printStackTrace();
	}
	
		
}


}
