import javax.swing.*;

public class Application extends JFrame {

    private final

    Application() {
        super("SOS Game");

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}
