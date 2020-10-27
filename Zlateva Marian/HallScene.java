import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class HallScene extends Scene{
	private Image hall;
	
	public int scene=0;
	
	public boolean playerVisible=false;
	
	public HallScene(){
		 hall = new ImageIcon("images/hallway.png").getImage();
		 
	}
	
	public void drawMe(Graphics g,int x,int y){
		g.drawImage(hall, x, y, null);
		
		
	}
	
	
	
}