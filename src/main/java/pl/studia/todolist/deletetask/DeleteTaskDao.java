package pl.studia.todolist.deletetask;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;
import pl.studia.todolist.model.Task;
import pl.studia.todolist.model.User;

public class DeleteTaskDao extends HibernateUtil {
	private Session session = sessionFactory.openSession();

	public boolean validate(int id, String userMail) {
		try {

			String hql = "FROM User E where mail =:id_mail";
			Query query = session.createQuery(hql);
			query.setParameter("id_mail", userMail);
			User user = (User) query.list().get(0);

			hql = "Delete FROM Task E where user_id =:id and id=:idtask ";
			query = session.createQuery(hql);
			query.setParameter("id", user.getId());
			query.setParameter("idtask", id);
			query.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			session.close();


		}

	}
}
