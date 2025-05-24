package FactoryPattern;



public class MainNotifcation {

        
        public static void main(String[] args) {
            NotficationFactory factory;

        // Let's say we get notification type dynamically
        String type = "SMS";

        if (type.equalsIgnoreCase("SMS")) {
            factory = new SMSFactory();
        } else {
            factory = new EmailFactory();
        }

            Notifcation not = factory.createNotifcation();
            not.notifyuser();
        
        }
}
