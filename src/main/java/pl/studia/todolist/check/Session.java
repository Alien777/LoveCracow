package pl.studia.todolist.check;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Session {
	public static boolean isActive() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String s = (String) session.getAttribute("login");
		System.out.println(s);
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
}
