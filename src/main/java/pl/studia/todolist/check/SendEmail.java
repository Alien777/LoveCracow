package pl.studia.todolist.check;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	SendEmail(String mail, String user) {
		SimpleEmail email = new SimpleEmail();
		try {
			email.setHostName("mail.myserver.com");
			email.addTo(mail, user);
			email.setFrom("me@apache.org", "Me");
			email.setSubject("Test message");
			email.setMsg("This is a simple test of commons-email");
			email.send();
		} catch (EmailException e) {
		}
	}

}