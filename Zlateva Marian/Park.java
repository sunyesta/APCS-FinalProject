import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class Park extends Scene{
	private Image park;
	
	public int scene=0;
	
	public Park(){
		park = new ImageIcon("images/park.png").getImage();
		 
	}
	
	public void drawMe(Graphics g, int x, int y){
		g.drawImage(park, 0, 0, null);
	}
	
	public void setScene(int scene){
		this.scene=scene;
	}
	
	public int getScene(){
		return scene;
	}
}