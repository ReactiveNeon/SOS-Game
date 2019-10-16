import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class GraphicsWindow extends JComponent {
  
   private BufferedImage[] pieces;
   
   private Graphics g;
   private JPanel board;
   
   public GraphicsWindow(BufferedImage[] pieces) {
      super();
      
      this.pieces = pieces;
   }
   
   private void drawGrid(Graphics g) {}
   
   @Override
   public void paint(Graphics g) {
      for (int x = 0; x < 10; x++) {
         for (int y = 0; y < 10; y++) {
            g.drawImage(pieces[0], x * 50, y * 50, null);
         }
      }
      g.drawImage(pieces[1], 0, 0, null);
      
      System.out.println("Painted the screen.");
   }
}