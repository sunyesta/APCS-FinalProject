import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class Classroom extends Scene{
	private Image park;
	
	public int scene=0;
	
	public Classroom(){
		park = new ImageIcon("images/classroom.png").getImage();
		 
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