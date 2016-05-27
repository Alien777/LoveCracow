package pl.studia.todolist.deletetask;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import pl.studia.todolist.check.Session;
import pl.studia.todolist.login.LoginDao;

public class DeleteTask implements SessionAware {

	SessionMap<String, String> sessionmap;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() {

		if (Session.isActive() && new DeleteTaskDao().validate(id, Session.getMail())) {
			return "success";
		} else {

			return "error";
		}

	}

	public void setSession(Map map) {
		sessionmap = (SessionMap) map;
	}

}
