package pl.studia.todolist.edittask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import pl.studia.todolist.check.Session;
import pl.studia.todolist.model.Task;

public class EditTask implements SessionAware {

	SessionMap<String, String> sessionmap;
	private String title, describe;
	private String date;
	private int id;
	private Date datee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatee() {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date1 = null;
		try {
			date1 = simpleDateFormat.parse(date);
			System.out.println(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date1;

	}

	public String execute() {
		if (Session.isActive()) {
			Task task = new EditTaskDao().validate(id, Session.getMail());
			this.setId(task.getId());
			this.setTitle(task.getTitle());
			this.setDescribe(task.getDescription());
			this.setDate(task.getDate().toString());
			return "success";
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

	public void setDatee(Date datee) {
		this.datee = datee;
	}

}
