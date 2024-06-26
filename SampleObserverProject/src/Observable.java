import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> userList;

    Observable(){
        this.userList= new ArrayList<>();
    }

    public void registerUser(Observer user){
        this.userList.add(user);
    }

    public void publishPost(String announcement){
        for(Observer user : userList){
            user.getPostNotification(this,announcement);
        }
    }
}

