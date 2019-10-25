import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
   
   final int playerIndex;
   
   public ButtonListener(int playerIndex) {
      this.playerIndex = playerIndex;
   } 
   
   @Override
   public void actionPerformed(ActionEvent e) {
      Game.instance.updatePoints(playerIndex);
   }
}