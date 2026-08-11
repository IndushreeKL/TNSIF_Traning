package org.tnsif.acce.tnsif.interfacedemo;
@FunctionalInterface
interface Notification
{
	void notifyUser(String message);
	
}
class EmailNotification implements Notification

{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email "+message);
		
	}
	
}
class SMSNotification implements Notification
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending SMS "+message);
		
	}
	
}


public class FunctionalInterfacedemo {

	public static void main(String[] args) {
		Notification email=new EmailNotification();
		email.notifyUser("Meeting at 10am");
		
		Notification sms=new SMSNotification();
		sms.notifyUser("Assignment uploaded");
		
	}

}