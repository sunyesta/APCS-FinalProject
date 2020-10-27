import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class TitleScene extends Scene{
	private Image titlePage;
	
	public int scene=0;
	
	public TitleScene(){
		titlePage = new ImageIcon("images/titlePage.png").getImage();
		 
	}
	
	public void drawMe(Graphics g){
		g.drawImage(titlePage, 0, 0, null);
	}
	
	public void setScene(int scene){
		this.scene=scene;
	}
	
	public int getScene(){
		return scene;
	}
}