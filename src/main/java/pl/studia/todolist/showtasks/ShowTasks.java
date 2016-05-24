package pl.studia.todolist.showtasks;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import pl.studia.todolist.check.Session;

import pl.studia.todolist.model.Task;

public class ShowTasks implements SessionAware {
	SessionMap<String, String> sessionmap;
	List<Task> listTask;

	public String execute() {
		System.out.println(Session.isActive());
		return "success";
	}

	public void setSession(Map map) {
		sessionmap = (SessionMap) map;
	}

}
