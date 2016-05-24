package pl.studia.todolist.login;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;

public class LoginDao extends HibernateUtil {

	private Session session = sessionFactory.openSession();

	public Boolean validate(String userMail, String userPass) {

		String hql = "FROM User E where mail =:id_mail and  password =:id_password";
		System.out.println(userMail+"  "+userPass);
		Query query = session.createQuery(hql);
		query.setParameter("id_mail", userMail);
		query.setParameter("id_password", userPass);
		System.out.println(query.list().size());
		if (query.list().size() == 1) {

			return true;

		}

		return false;

	}
}