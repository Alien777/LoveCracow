package pl.studia.todolist.registry;

import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;
import pl.studia.todolist.model.User;
import pl.studia.todolist.validate.Validate;

public class RegistryDao extends HibernateUtil {
	private Session session = sessionFactory.openSession();

	public Boolean validate(String userName, String userMail, String userPass) {
		try {
			System.out.println("mail   " + userMail);

			session.beginTransaction();
			if (!new Validate().isValidEmailAddress(userMail))
				return false;
			if (!new Validate().isValidName(userName))
				return false;
			if (!new Validate().isValidPassword(userPass))
				return false;

			session.save(new User(userName, userMail, new Validate().md5Password(userPass)));
			session.getTransaction().commit();
		} catch (Exception e) {
			return false;
		} finally {
			session.close();
		}
		return true;
	}
}
