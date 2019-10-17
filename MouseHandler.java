import java.awt.event.*; 
import java.lang.Math;

public class MouseHandler extends MouseAdapter {
   
   public static double dist (double x1, double y1, double x2, double y2) {
      return Math.sqrt((x2 - x1) + (y2 - y1));
   }
   
   public void mousePressed(MouseEvent e) {
      System.out.println("Mouse down at: " + GraphicsWindow.pixelXToBoard(e.getX()) + ", " + GraphicsWindow.pixelXToBoard(e.getY()));
   }

   public void mouseReleased(MouseEvent e) {
   
      int x = GraphicsWindow.pixelXToBoard(e.getX());
      int y = GraphicsWindow.pixelYToBoard(e.getY());
      
      //System.out.println(lastX + " : " + lastY);
      if (true) {
   
         Game.instance.click(x, y);
         
      } else {
         
         //Game.instance.drag(x, y, GraphicsWindow.pixelXToBoard(lastX), GraphicsWindow.pixelYToBoard(lastY));
         
      }
   } 
   
   public void mouseClicked(MouseEvent e) {
      
   }   
}