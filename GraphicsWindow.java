import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;

public class GraphicsWindow extends JFrame {

   private final String GRID_IMG = "imgs/grid.jpg";
   private final String S_IMG = "imgs/s.jpg";
   private final String O_IMG = "imgs/o.jpg";
   private final String BLANK_IMG = "imgs/blank.jpg";
   
   private BufferedImage grid;
   private BufferedImage[] pieces;

   public GraphicsWindow(int w, int h) {
      super("SOS Game");
      
      setSize(w, h);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      loadData();
      
      repaint();
      
      setVisible(true);
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
      
      System.out.println("Painted the screen.");
   }
}