import java.util.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

class FileManager {

   public static BufferedImage[] loadImages(String[] filePaths) {
      List<BufferedImage> data = new ArrayList<BufferedImage>();
      
      try {
         for (String filePath : filePaths) {
            BufferedImage img = ImageIO.read(new File(filePath));
            data.add(img);
         }
      } catch (IOException ioe) {
         System.out.println("Could not read images.");
         System.exit(1);
      }
      
      BufferedImage[] imgs = data.toArray(new BufferedImage[0]);
      return imgs;
   }
}