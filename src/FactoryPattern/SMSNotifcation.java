package FactoryPattern;

public class SMSNotifcation implements Notifcation {

    @Override
    public void notifyuser() {
        System.out.println("SMS Notification Sending");
        
    }

}
