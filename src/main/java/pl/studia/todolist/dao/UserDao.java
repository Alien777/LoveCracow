package pl.studia.todolist.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.daoimpl.ActionUser;
import pl.studia.todolist.model.User;

public class UserDao extends HibernateUtil implements ActionUser {
	private Session session = sessionFactory.openSession();

	@Override
	public boolean add(User user) {
		try {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();

		} catch (Exception e) {
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	public List<?> getUsersWithPassword(User user) {
		String hql = "FROM User E where mail =:id_mail and  password =:id_password";
		Query query = session.createQuery(hql);
		query.setParameter("id_mail", user.getMail());
		query.setParameter("id_password", user.getPassword());
		return (query.list());
	}

	public List<?> getAllUser(User user) {
		String hql = "FROM User E where mail =:id_mail";
		Query query = session.createQuery(hql);
		query.setParameter("id_mail", user.getMail());
		return (query.list());
	}

}
