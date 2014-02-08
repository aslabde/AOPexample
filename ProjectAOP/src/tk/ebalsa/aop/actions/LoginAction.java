package tk.ebalsa.aop.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import tk.ebalsa.aop.model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class LoginAction extends ActionSupport implements ModelDriven{
	
	private User user = new User();
	
	//Allows ValueStack to encapsulate with POJO form
	public Object getModel(){
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	//View controller. Defines result to launch
	@Action(value="/login", results={
			@Result(name="admin",location="pages/admin.jsp"),
			@Result(name="user",location="pages/user.jsp"),
			@Result(name="error",location="pages/error.jsp")
		})	
	public String execute() {
		
		if(user.getName().equals("edu") && (user.getPass().equals("ude"))){
			return "admin";
		}
		
		if(user.getName().equals("lolo") && user.getPass().equals("olol")){
			return "user";
		}
		
		return "error";
	}
	
}
