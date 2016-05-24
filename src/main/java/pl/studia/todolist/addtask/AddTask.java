package pl.studia.todolist.addtask;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import pl.studia.todolist.check.Session;

public class AddTask implements SessionAware {

	SessionMap<String, String> sessionmap;
	private String title, describe;
	private String date;

	public String execute() {
		if (Session.isActive()) {
			System.out.println("aaa" + date);
			if (new AddTaskDao().validate(Session.getMail(), title, describe, date)) {

				return "success";
			} else {
				return "error";
			}
		} else {
			return "error";
		}
	}

	public void setSession(Map map) {
		sessionmap = (SessionMap) map;
	}

	public String getData() {
		return date;
	}

	public void setDate(String date) {

		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

}
