package FactoryPattern;

public class EmailNotifcation implements Notifcation {

    @Override
    public void notifyuser() {
        
        System.out.println("Sending Email Notif");
    }
    

}
