import javax.swing.*;

public class Application extends JFrame {

    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    
    private GraphicsWindow graphics;

    Application() {
      super("SOS Game");

      setSize(WIDTH, HEIGHT);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      graphics = new GraphicsWindow();
      add(graphics);
      
      setVisible(true);
    }

    public static void main(String[] args) {
      new Application();
    }
}