package pl.studia.todolist.showtasks;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import pl.studia.todolist.check.Session;
import pl.studia.todolist.model.Task;

public class ShowTasks implements SessionAware {
	SessionMap<String, String> sessionmap;
	List<Task> list;

	public List<Task> getList() {
		return list;
	}

	public void setList(List<Task> list) {
		this.list = list;
	}

	public String execute() {
		if (Session.isActive()) {
			list = new ShowTasksDao().getTasks(Session.getMail());

			return "success";
		} else
			return "error";

	}

	public void setSession(Map map) {
		sessionmap = (SessionMap) map;
	}
}