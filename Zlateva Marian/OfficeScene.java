import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class OfficeScene extends Scene{
	private Image office;
	
	public int scene=0;
	
	public boolean playerVisible=false;
	
	public OfficeScene(){
		 office = new ImageIcon("images/principles office.png").getImage();
		 
	}
	
	public void drawMe(Graphics g,int x,int y){
		g.drawImage(office, x, y, null);
		
		
	}
	
	
}