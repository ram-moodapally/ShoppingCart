package implementations;

import services.NotificationStrategy;

public class EmailNotification implements NotificationStrategy {

    @Override
    public void sendNotification(){
        System.out.println("Sends the email notificaiton");
    }
}
