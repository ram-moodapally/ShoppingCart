package implementations;

import services.NotificationStrategy;

public class SMSNotification implements NotificationStrategy {

    @Override
    public void sendNotification(){
        System.out.println("sending notification using SMS");
    }
}
