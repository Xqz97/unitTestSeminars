package seminar3.task1;

public class User {
    public String userName;
    public String password;

    boolean isAutontificate = false;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean authentication(String password, String userName){
        isAutontificate = ((userName.equals(this.userName)) || (password.equals(this.password)));
        return isAutontificate;
}
}
