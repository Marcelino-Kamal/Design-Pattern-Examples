package FactoryPattern;

public class EmailFactory extends NotficationFactory {

    @Override
    public Notifcation createNotifcation() {
        return new EmailNotifcation();
    }

}
