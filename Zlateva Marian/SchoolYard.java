import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class SchoolYard extends Scene{
	private Image schoolYard;
	
	public int scene=0;
	
	public SchoolYard(){
		schoolYard = new ImageIcon("images/Gemstone Academy.png").getImage();
		 
	}
	
	public void drawMe(Graphics g, int x, int y){
		g.drawImage(schoolYard, 0, 0, null);
	}
	
	public void setScene(int scene){
		this.scene=scene;
	}
	
	public int getScene(){
		return scene;
	}
}