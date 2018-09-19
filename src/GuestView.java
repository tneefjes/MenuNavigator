import java.util.ArrayList;
import java.util.List;

public class GuestView extends View {
    List<View> guestViewNextList = new ArrayList<View>();

    // Constructor
    public GuestView() {
        guestViewNextList.add(new MenuView());
    }

    @Override
    public void show() {
        System.out.println("\n\nGuest Page");
        System.out.println("Please choose from these options:");
        System.out.println("1 - Menu");
        System.out.println("2 - Register");
        System.out.println("3 - Login");
        System.out.println("4 - Reserve a table");
        System.out.println("5 - Previous page");
    }
    @Override
    public View handler(String action) {
        View returnView;
        switch (action) {
            case "1":
                returnView = guestViewNextList.get(0);
                break;
            case "2":
                returnView = null;
                break;
            case "3":
                returnView = null;
                break;
            case "4":
                returnView = null;
                break;
            case "5":
                returnView = null;
                break;
            default:
                System.out.println("\nInvalid choice, please try again.");
                returnView = null;
        }
        return returnView;
    }
}
