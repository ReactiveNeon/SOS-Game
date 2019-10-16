import java.util.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

class FileManager {

   public static BufferedImage[] loadImages(String[] filePaths) throws IOException {
      List<BufferedImage> data = new ArrayList<BufferedImage>();
      
      for (String filePath : filePaths) {
         BufferedImage img = ImageIO.read(new File(filePath));
         data.add(img);
      }
      
      BufferedImage[] imgs = data.toArray(new BufferedImage[0]);
      return imgs;
   }
}