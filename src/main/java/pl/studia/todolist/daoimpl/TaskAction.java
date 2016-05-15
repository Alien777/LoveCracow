package pl.studia.todolist.daoimpl;

import pl.studia.todolist.model.Task;
import pl.studia.todolist.model.User;

public interface TaskAction {
	boolean add(User user, Task task);
	boolean delete(User user, Task task);
	boolean update(User user, Task task);
}
