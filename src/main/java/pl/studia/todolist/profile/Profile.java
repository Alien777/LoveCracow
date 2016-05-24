package pl.studia.todolist.profile;

import pl.studia.todolist.check.Session;

public class Profile {

	public String execute() {
		if (Session.isActive()) {
			return "success";
		} else {
			return "error";
		}
	}
}