package FactoryPattern;

public class SMSFactory extends NotficationFactory {

    @Override
    public Notifcation createNotifcation() {
        
        return new SMSNotifcation();
    }

}
