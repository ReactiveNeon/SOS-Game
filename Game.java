import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;

public class Game extends JFrame {

   private final String GRID_IMG = "imgs/grid.jpg";
   private final String S_IMG = "imgs/s.jpg";
   private final String O_IMG = "imgs/o.jpg";
   private final String BLANK_IMG = "imgs/blank.jpg";
   private GraphicsWindow graphics;
   
   private int[][] board = new int[10][10];
   
   public Game() {
      super("SOS Game");
      
      setSize(500, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      try {
      
         BufferedImage[] data = FileManager.loadImages(new String[]{BLANK_IMG, S_IMG, O_IMG});
         graphics = new GraphicsWindow(data);
         add(graphics);
      } 
      catch (IOException ioe) {
         System.out.println("Couldn't load images");
         System.exit(1);
      }
      
      setVisible(true);
      
      System.out.println("Created Game.");
   }
   
   private BufferedImage[] loadData() {
      BufferedImage[] pieces;
        
      try {
         pieces = new BufferedImage[3];
         pieces[0] = ImageIO.read(new File(BLANK_IMG));
         pieces[1] = ImageIO.read(new File(S_IMG));
         pieces[2] = ImageIO.read(new File(O_IMG));
         
         return pieces;
      } 
      catch (IOException e) {
         System.out.println("Could not read file.");
      }
      
      return null;
   }
   
   public static void main(String[] args) {
      new Game(); // creates the game
   }
}