package pl.studia.todolist.addtask;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;

import pl.studia.todolist.check.HibernateUtil;
import pl.studia.todolist.model.Task;
import pl.studia.todolist.model.User;

public class AddTaskDao extends HibernateUtil {
	private Session session = sessionFactory.openSession();

	public boolean validate(String mailUser, String titleTask, String describeTask, String dateTask) {
		try {

			User user = new User();
			Task task = new Task();
			String hql = "FROM User where mail =:id_mail";
			Query query = session.createQuery(hql);
			query.setParameter("id_mail", mailUser);
			int idUser = ((User) query.list().get(0)).getId();
			user.setId(idUser);
			System.out.println("aaaaaaaaaaaaaaaaaa1");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");

			Date date = simpleDateFormat.parse(dateTask);
			System.out.println(date);
			task.setDate(date);
			task.setDescription(describeTask);
			task.setTitle(titleTask);
			task.setUser(user);
			session.beginTransaction();
			session.save(task);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			session.close();
		}
	}

}
