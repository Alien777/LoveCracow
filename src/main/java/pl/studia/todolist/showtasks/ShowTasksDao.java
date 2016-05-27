package pl.studia.todolist.showtasks;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;
import pl.studia.todolist.model.Task;
import pl.studia.todolist.model.User;

public class ShowTasksDao extends HibernateUtil {
	private Session session = sessionFactory.openSession();

	public List<Task> getTasks(String userMail) {
		try {

			String hql = "FROM User E where mail =:id_mail";
			Query query = session.createQuery(hql);
			query.setParameter("id_mail", userMail);
			User user = (User) query.list().get(0);

			hql = "FROM Task E where user_id =:id";
			query = session.createQuery(hql);
			query.setParameter("id", user.getId());

			return query.list();
		} catch (Exception e) {
			return new LinkedList<Task>();
		} finally {
			session.close();
		}

	}
}
