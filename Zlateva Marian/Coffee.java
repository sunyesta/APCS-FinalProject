import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
public class Coffee extends Object{
	
	private ArrayList<Image>coffee = new  ArrayList<Image>();
	
	int counter=0;
	int frame=0;
	int x;
	int y;
	
	boolean visible=true;
	
	public Coffee(){
		renderImages();
	}
	
	public void drawMe(Graphics g,int x,int y){
		this.x=x;
		this.y=y;
		if(visible){
			drawAnimation(g);
		}
		
	}
	
	
	public void drawAnimation(Graphics g){
		g.drawImage(coffee.get(0), x, y, null);
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
		coffee.add(new ImageIcon("images/objects/coffee.png").getImage());
		
	}
}