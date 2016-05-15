package pl.studia.todolist.main;
 

import java.sql.Date;
import java.sql.Time;

import pl.studia.todolist.controler.SessionUser;
import pl.studia.todolist.dao.TaskDao;
import pl.studia.todolist.dao.UserDao;
import pl.studia.todolist.model.Task;
import pl.studia.todolist.model.User;

public class MainJar {

	public static void main(String[] args) {
		User user;
		Task task;
		user = new User("Adam", "mail", "pass");
		//System.out.println(new UserDao().add(user));
		
		task = new Task(12,"title2", "description2", new Date(213214), new Time(321321));
		//new TaskDao().add(user, task);
		//new TaskDao().delete(user, task );
		
		System.out.println(new SessionUser().loggin(user));
		System.out.println(new SessionUser().logout(user));

	}
}
