import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class Instructions extends Scene{
	private Image instructions;
	
	public int scene=0;
	
	public Instructions(){
		instructions = new ImageIcon("images/instructions.png").getImage();
		 
	}
	
	public void drawMe(Graphics g){
		g.drawImage(instructions, 0, 0, null);
	}
	
	public void setScene(int scene){
		this.scene=scene;
	}
	
	public int getScene(){
		return scene;
	}
}