package pl.studia.todolist.login;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import pl.studia.todolist.check.Session;

public class Login implements SessionAware {
	private String userMail, userPass;
	SessionMap<String, String> sessionmap;

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String execute() {
		System.out.println(Session.isActive());
		if (Session.isActive()) {
			return "success";
		} else {

			if (new LoginDao().validate(userMail, userPass)) {
				sessionmap.put("login", userMail);
				return "success";
			} else {
				return "error";
			}
		}
	}

	public void setSession(Map map) {
		sessionmap = (SessionMap) map;
	}

	public String logout() {
		sessionmap.invalidate();
		return "success";
	}

}