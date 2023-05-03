package hillel.lesson08;

public class AdminDetailPage extends UserDetailPage {

    public AdminDetailPage(String adminParam) {
        super(adminParam);
        System.out.println("AdminDetailPage created");
    }
    @Override
    public void openUserDetails() {
        super.openUserDetails();
        System.out.println("admin details");
    }
    public void OpenUserDetails(String role)  {

    }

    }
