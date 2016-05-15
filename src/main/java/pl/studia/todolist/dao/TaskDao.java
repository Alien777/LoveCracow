package pl.studia.todolist.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.daoimpl.TaskAction;
import pl.studia.todolist.model.Task;
import pl.studia.todolist.model.User;

public class TaskDao extends HibernateUtil implements TaskAction {
	private Session session = sessionFactory.openSession();

	@Override
	public boolean add(User user, Task task) {
		String hql = "FROM User where mail =:id_mail";
		Query query = session.createQuery(hql);
		query.setParameter("id_mail", user.getMail());
		int idUser = ((User) query.list().get(0)).getId();
		System.out.println(idUser);
		user.setId(idUser);
		task.setUser(user);
		session.beginTransaction();
		session.save(task);
		session.getTransaction().commit();
		session.close();
		return false;
	}

	@Override
	public boolean delete(User user, Task task) {
		String hql = "FROM User where mail =:id_mail";
		Query query = session.createQuery(hql);
		query.setParameter("id_mail", user.getMail());
		int idUser = ((User) query.list().get(0)).getId();
		user.setId(idUser);
		task.setUser(user);
		session.beginTransaction();
		session.delete(task);
		session.getTransaction().commit();
		session.close();
		return false;
	}

	@Override
	public boolean update(User user, Task task) {

		return false;
	}
	
}
