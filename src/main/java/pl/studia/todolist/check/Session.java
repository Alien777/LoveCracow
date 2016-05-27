package pl.studia.todolist.check;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Session {
	public static boolean isActive() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String s = (String) session.getAttribute("login");
	
 
		if (s != null && !s.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	public static String getMail() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String s = (String) session.getAttribute("login");
		return s;
	}
	
	public static Integer getId() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		Integer s = (Integer) session.getAttribute("id");
		return s;
	}
}
