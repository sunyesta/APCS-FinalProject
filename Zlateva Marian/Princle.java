import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
public class Princle extends SideCharacter{
	
	private ArrayList<Image>standing = new  ArrayList<Image>();
	
	int counter=0;
	int frame=0;
	int direction=1;
	
	int x=450;
	int y=170;
	
	public Princle(){
		renderImages();
		
	}
	
	public void drawMe(Graphics g){
		animateStanding(g);
	}
	
	
	public void animateStanding(Graphics g){
		counter++;
		g.drawImage(standing.get(frame), x, y, null);
		if(counter==5){
			frame+=direction;
			if(frame==standing.size()){
				frame=0;
			}
			counter=0;
		}
	}
	public int getXPosition(){
		return x;
	}
	public int getYPosition(){
		return y;
	}
	public int getWidth(){
		return 140;
	}
	public int getHeight(){
		return 220;
	}
	
	
	public void renderImages(){
		standing.add(new ImageIcon("images/characters/char1/man0001.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0002.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0003.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0004.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0005.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0006.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0007.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0008.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0009.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0010.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0011.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0012.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0013.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0014.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0015.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0016.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0017.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0018.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0019.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0020.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0021.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0022.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0023.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0024.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0025.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0026.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0027.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0028.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0029.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0030.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0031.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0032.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0033.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0034.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0035.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0036.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0037.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0038.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0039.png").getImage());
		standing.add(new ImageIcon("images/characters/char1/man0040.png").getImage());
	}

}