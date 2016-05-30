package pl.studia.todolist.login;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;
import pl.studia.todolist.validate.Validate;

public class LoginDao extends HibernateUtil {

	private Session session = sessionFactory.openSession();

	public Boolean validate(String userMail, String userPass) {

		String hql = "FROM User E where mail =:id_mail and  password =:id_password";


		Query query = session.createQuery(hql);
		
		if (!new Validate().isValidEmailAddress(userMail))
			return false;
 
		if (!new Validate().isValidPassword(userPass))
			return false;
		query.setParameter("id_mail", userMail);
		query.setParameter("id_password", new Validate().md5Password(userPass));
		System.out.println(query.list().size());
		if (query.list().size() == 1) {

			return true;

		}

		return false;

	}
}