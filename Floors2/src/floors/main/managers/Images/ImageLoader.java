package floors.main.managers.Images;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import floors.main.managers.GameManager;

public class ImageLoader extends GameManager {
	
	  public Image getImage(String path) {
		    Image tempImage = null;
		    try {
		      URL imageUrl = ImageLoader.class.getResource(path);
		      tempImage = Toolkit.getDefaultToolkit().getImage(imageUrl);
		    }
		    catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    return tempImage;
		  }
		  

}
