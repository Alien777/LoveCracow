package pl.studia.todolist.model;

import java.util.Date;

public class Mail {
	public Mail(String email, String name, String titlt, Date date, String descript) {
		super();
		this.email = email;
		this.name = name;
		this.titlt = titlt;
		this.date = date;
		this.descript = descript;
	}

	String email;
	String name;
	String titlt;
	Date date;
	String descript;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitlt() {
		return titlt;
	}

	public void setTitlt(String titlt) {
		this.titlt = titlt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

}
