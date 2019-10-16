import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;

public class GraphicsWindow extends JPanel {

   private final String GRID_IMG = "imgs/grid.jpg";
   private final String S_IMG = "imgs/s.jpg";
   private final String O_IMG = "imgs/o.jpg";
   private final String BLANK_IMG = "imgs/blank.jpg";
   
   private BufferedImage grid;
   private BufferedImage[] pieces;

   public GraphicsWindow() {
      super();
      
      loadData();
   }
   
   private boolean loadData() {
      try {
         //grid = ImageIO.read(new File(GRID_IMG));
         
         pieces = new BufferedImage[3];
         pieces[0] = ImageIO.read(new File(BLANK_IMG));
         pieces[1] = ImageIO.read(new File(S_IMG));
         pieces[2] = ImageIO.read(new File(O_IMG));
      } 
      catch (IOException e) {
         System.out.println("Could not read file.");
         return false;
      }
      
      return true;
   }
   
   private void drawGrid(Graphics g) {}
   
   @Override
   public void paint(Graphics g) {
      drawGrid(g);
      g.drawImage(pieces[0], 100, 100, null);
      System.out.println("Painted the screen.");
   }
}