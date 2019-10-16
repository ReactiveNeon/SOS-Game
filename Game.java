import javax.swing.*;
import javax.imageio.*;
import java.io.*;
//import java.awt.BorderLayout;
import java.util.*;

public class Game extends JFrame {
   
   public static Game instance;
  
   private GraphicsWindow graphics;
   
   private int[][] board = new int[10][10];
   private List<Line> lines = new ArrayList<Line>();
   
   public Game() {
      super("SOS Game");
      
      if (instance != null) {
         System.out.println("More than one game running");
      } else {
         instance = this;
      }
      
      setSize(500, 524);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      //setLayout(new BorderLayout());
      
      updateBoard();
      add(graphics);
      
      //addMouseListener(new MouseHandler());
      
      setVisible(true);
      
      System.out.println("Created Game.");
   }
      
   public void click(int x, int y) {
      int index = board[x][y];
      
      if (index == 2) {
         index = 0;
      } else {
         index++;
      }
      
      System.out.println(index);
      board[x][y] = index;
      updateBoard();
   }
   
   public void drag(int x1, int y1, int x2, int y2) {
      lines.add(new Line(x1, y1, x2, y2));
   }
   
   private void updateBoard() {
      if (graphics != null) {
         remove(graphics);
      }
      
      graphics = new GraphicsWindow(board);
      add(graphics);
      
      revalidate();
      repaint();
   }
   
   public static void main(String[] args) {
      new Game(); // creates the game
   }
}