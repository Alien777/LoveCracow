package pl.studia.todolist.registry;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import pl.studia.todolist.check.Session;

public class Registry implements SessionAware {
	private String userName, userPass, userMail;
	SessionMap<String, String> sessionmap;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserpass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String execute() {
		if (Session.isActive()) {
			return "success";
		} else {
			if (new RegistryDao().validate(userName, userMail, userPass)) {
				return "success";
			} else {
				return "error";
			}
		}
	}

	public void setSession(Map map) {
		sessionmap = (SessionMap) map;
	}

}