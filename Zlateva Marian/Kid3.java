import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;

public class Kid3 extends SideCharacter{
	

	private ArrayList<Image>standing = new  ArrayList<Image>();
	
	private Image kid;
	
	private int counter=0;
	private int frame=0;
	private int frame2=0;
	private int direction=1;
	private int x=619;
	private int y=412;
	
	private boolean type;
	
	
	public Kid3(){
		renderImages();
		frame=(int)(Math.random()*standing.size());
		kid=new ImageIcon("images/characters/kid.jpg").getImage();
		
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
	
	public boolean randomBoolean(){
		return Math.random() < 0.3;
	}
	public void renderImages(){
		
	
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0001.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0002.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0003.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0004.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0005.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0006.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0007.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0008.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0009.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0010.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0011.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0012.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0013.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0014.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0015.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0016.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0017.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0018.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0019.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0020.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0021.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0022.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0023.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0024.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0025.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0026.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0027.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0028.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0029.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0030.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0031.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0032.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0033.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0034.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0035.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0036.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0037.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0038.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0039.png").getImage());
		standing.add(new ImageIcon("images/characters/kid3/standing/standing0040.png").getImage());
		
		
	}

}