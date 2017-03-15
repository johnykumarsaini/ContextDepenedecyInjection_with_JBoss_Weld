package in.jk.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("jk")
@RequestScoped
public class MessageBean{
	
	
	@Inject Message message;
	
	//@Inject MessageImpl message;

public void showMessage(){

	
	System.out.println("Context and Dependency Injection ");
	message.showMessage();
}
 }