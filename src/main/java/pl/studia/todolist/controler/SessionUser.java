package pl.studia.todolist.controler;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import pl.studia.todolist.dao.UserDao;
import pl.studia.todolist.model.User;

public class SessionUser {
	public static ConcurrentHashMap<String,User> userSession = new ConcurrentHashMap<>();

	public boolean loggin(User user) {
		Boolean isCorrect = new Validation().userValidation(user);
		List<?> listUser = new UserDao().getUsersWithPassword(user);
		if (isCorrect && (listUser).size() == 1) {
	
		 userSession.put(((User) listUser.get(0)).getMail(),(User) listUser.get(0));
			return true;
		}
		return false;
	}
	
	public boolean logout(User user) {		
			userSession.remove(user);
			return true;
	}

	public boolean registry(User user) {

		Boolean isCorrect = new Validation().userValidation(user);

		if (isCorrect && (new UserDao().getAllUser(user)).size() == 0)
			
			return new UserDao().add(user);

		return false;
	}

}
