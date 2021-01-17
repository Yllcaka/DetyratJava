import java.io.*;

public class CheckUser {
    public static void main(String[] args) {
        User user1 = new User(1, "diem@hotmail.com", "password", false);
        User user2 = new User(2, "carpe@hotmail.com", "1234d", true);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
