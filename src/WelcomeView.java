import java.util.ArrayList;
import java.util.List;

public class WelcomeView extends View {
    List<View> welcomeViewNextList = new ArrayList<View>();

    // Constructor
    public WelcomeView() {
        welcomeViewNextList.add(new GuestView());
        welcomeViewNextList.add(new EmployeeView());
    }

    @Override
    public void show() {
        System.out.println("\nWelcome to the website of Molveno Lake Resort Restaurant.");
        System.out.println("Please choose from these options:");
        System.out.println("1 - Guest");
        System.out.println("2 - Employee");
    }
    @Override
    public View handler(String selection) {
        View returnView;
        switch (selection) {
            case "1":
                returnView = welcomeViewNextList.get(0);
                break;
            case "2":
                returnView = welcomeViewNextList.get(1);
                break;
            default:
                System.out.println("\nInvalid choice, please try again.");
                returnView = null;
        }
        return returnView;
    }
}
