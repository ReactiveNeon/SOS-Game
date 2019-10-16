
public class Game {

   private GraphicsWindow graphics;
   
   private int[][] board = new int[10][10];
   
   public Game() {
      this.graphics = new GraphicsWindow(400, 400); // spawns the applet window
      
      System.out.println("Created Game.");
   }
   
   public static void main(String[] args) {
      new Game(); // creates the game
   }
}