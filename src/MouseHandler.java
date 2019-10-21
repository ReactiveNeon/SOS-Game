import java.awt.event.*; 
import java.lang.Math;

public class MouseHandler extends MouseAdapter {

   private int x1, y1;
   
   public void mousePressed(MouseEvent e) {
      x1 = GraphicsWindow.pixelToBoard(e.getX());
      y1 = GraphicsWindow.pixelToBoard(e.getY());
   }

   public void mouseReleased(MouseEvent e) {
   
      int x2 = GraphicsWindow.pixelToBoard(e.getX());
      int y2 = GraphicsWindow.pixelToBoard(e.getY());
      
      //System.out.println(lastX + " : " + lastY);
      if (x1 == x2 && y1 == y2) {
   
         Game.instance.click(x1, y1);
         
      } else {
         
         Game.instance.drag(x1, y1, x2, y2);
         
      }
   }   
}