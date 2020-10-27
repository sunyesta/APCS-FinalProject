import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
public class Bubbles extends Object{
	
	private ArrayList<Image>pennyShine = new  ArrayList<Image>();
	
	private Image bubbles;
	
	int counter=0;
	int frame=0;
	int x;
	int y;
	
	boolean visible=true;
	boolean collectable=true;
	
	public Bubbles(){
		renderImages();

		frame=(int)(Math.random()*pennyShine.size());
		bubbles=new ImageIcon("images/objects/bubbles.png").getImage();

	}
	
	public void drawMe(Graphics g,int x,int y){
		this.x=x;
		this.y=y;
		if(visible){
			//drawAnimation(g);
			g.drawImage(bubbles, x, y, null);
		}
		
	}
	
	
	public void drawAnimation(Graphics g){
		counter++;
		g.drawImage(pennyShine.get(frame), x, y, null);
		if(counter==5){
			frame++;
			if(frame==pennyShine.size()){
				frame=0;
			}
			counter=0;
		}
	}
	
	
	public boolean getCollectable(){
		return collectable;
	}
	public void setCollectable(boolean collectable){
		this.collectable=collectable;
	}
	public int getXPosition(){
		return x;
	}
	public int getYPosition(){
		return y;
	}
	public int getWidth(){
		return 60;
	}
	public int getHeight(){
		return 60;
	}
	
	public boolean getVisible(){
		return visible;
	}
	
	public void setVisible(boolean visible){
		this.visible=visible;
	}
	
	public void renderImages(){
		pennyShine.add(new ImageIcon("images/objects/coin/coin0001.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0002.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0003.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0004.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0005.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0006.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0007.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0008.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0009.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0010.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0011.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0012.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0013.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0014.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0015.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0016.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0017.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0018.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0019.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
		pennyShine.add(new ImageIcon("images/objects/coin/coin0020.png").getImage());
	}
}