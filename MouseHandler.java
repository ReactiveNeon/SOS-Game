import java.awt.event.*;

public class MouseHandler extends MouseAdapter {

   public void mouseReleased(MouseEvent e) {
      int x = GraphicsWindow.pixelXToBoard(e.getX());
      int y = GraphicsWindow.pixelYToBoard(e.getY());
   
      Game.instance.click(x, y);
   }    
}