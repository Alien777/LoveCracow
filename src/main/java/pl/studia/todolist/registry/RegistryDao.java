package pl.studia.todolist.registry;

import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;
import pl.studia.todolist.model.User;

public class RegistryDao extends HibernateUtil {
	private Session session = sessionFactory.openSession();

	public Boolean validate(String userName, String userMail, String userPass) {
		try {
			System.out.println("mail   "+ userMail);
			session.beginTransaction();
			session.save(new User(userName, userMail, userPass));
			session.getTransaction().commit();
		} catch (Exception e) {
			return false;
		} finally {
			session.close();
		}
		return true;
	}
}
