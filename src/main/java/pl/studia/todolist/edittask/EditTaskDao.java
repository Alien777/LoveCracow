package pl.studia.todolist.edittask;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;
import pl.studia.todolist.model.Task;
import pl.studia.todolist.model.User;

public class EditTaskDao extends HibernateUtil {
	private Session session = sessionFactory.openSession();

	public Task validate(int id_task, String userMail) {

		String hql = "FROM User E where mail =:id_mail";
		Query query = session.createQuery(hql);
		query.setParameter("id_mail", userMail);
		User user = (User) query.list().get(0);
		hql = "FROM Task E where user_id =:id and id=:id_task";
		query = session.createQuery(hql);
		query.setParameter("id", user.getId());
		query.setParameter("id_task", id_task);
		
		return (Task) query.list().get(0);
	}

}
