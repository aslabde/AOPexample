package tk.ebalsa.aop.aspects;

import java.io.IOException;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.ebalsa.aop.services.LogWriter;

@Service
@Aspect
public class LoggerAspect {
	//Define poincut with alias
	/*@Pointcut (
			"execution(* tk.ebalsa.aop.actions.LoginAction.execute(..))")
	public void login(){
	}*/
	//Call method when triggered by pointcut
	@AfterReturning("execution(* tk.ebalsa.aop.actions.LoginAction.execute(..))")
	public void newEntry(){
		try {
			this.logWriter.writeLogEntry("nueva entrada");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	private LogWriter logWriter;

	//LogWriter tool ID via Spring
	@Autowired
	public void setLogWriter(LogWriter logWriter) {
		this.logWriter = logWriter;
	}
	
	
	
	

}
