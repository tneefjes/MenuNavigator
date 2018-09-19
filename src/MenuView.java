import java.sql.SQLOutput;

public class MenuView extends View {
    @Override
    public void show() {
        System.out.println("\nMENU");
        System.out.println("1 - Pizza");
        System.out.println("2 - Lasagna\n");
    }
    @Override
    public View handler(String action) {
        return null;
    }
}
