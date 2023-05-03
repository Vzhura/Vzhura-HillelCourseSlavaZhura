package hillel.lesson08;

public class UserDetailPage extends BasePage {
    public UserDetailPage(String userParam) {
        super(userParam);
        System.out.println("UserDetailedPage created");
    }
public void openUserDetails() {
    System.out.println("open user details");
}
}
