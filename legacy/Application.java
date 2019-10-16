import javax.swing.*;

public class Application extends JFrame {

    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    
    private Game game;

    Application() {
      super("SOS Game");

      setSize(WIDTH, HEIGHT);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      graphics = new GraphicsWindow();
      add(graphics);
      
      game = new Game(graphics);
      add(game.createGraphics);
      
      setVisible(true);
    }

    public static void main(String[] args) {
      new Application();
    }
}