package FactoryPattern;

public class SMSFactory extends NotficationFactory {

    @Override
    public Notifcation createNotifcation() {
        // TODO Auto-generated method stub
        return new SMSNotifcation();
    }

}
