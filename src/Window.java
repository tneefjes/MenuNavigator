import java.util.Scanner;
import java.util.Stack;

public class Window {

    public void startWindow() {
        View currentView = new WelcomeView();
        View nextView = null;
        Stack previousPages = new Stack();
        Scanner myScanner = new Scanner(System.in);
        String selection;
        boolean finished = false;
        do {
            currentView.show();
            if (!previousPages.isEmpty()) {
                System.out.println("B - Back");
            }
            System.out.println("E - Exit");
            System.out.println("Option:");
            selection = myScanner.next();

            if (!previousPages.isEmpty()&&(selection.equals("B")||selection.equals("b"))) {
                currentView = (View) previousPages.pop();
                continue;
            } else if (selection.equals("E")||selection.equals("e")) {
                break;
            } else {
                nextView = currentView.handler(selection);
            }

            if (nextView==null) {
                continue;
            } else {
                previousPages.push(currentView);
                currentView = nextView;
            }
        } while (finished==false);
    }
}
