import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
public class Flower extends Object{
	
	
	
	
	
	int counter=0;
	int frame=0;
	int x;
	int y;
	int ran;
	
	private ArrayList<Image>flower = new  ArrayList<Image>();
	
	boolean visible=true;
	boolean collectable=true;
	
	public Flower(int x,int y){
		
		System.out.println("ran: "+ran);
		renderImages();
		this.x=x;
		this.y=y;
		flower.add(new ImageIcon("images/objects/flower1.png").getImage());
		flower.add(new ImageIcon("images/objects/flower2.png").getImage());
		flower.add(new ImageIcon("images/objects/flower3.png").getImage());
		flower.add(new ImageIcon("images/objects/flower4.png").getImage());
		flower.add(new ImageIcon("images/objects/flower5.png").getImage());
		
		ran=(int)(Math.random()*flower.size());
	}
	
	public void drawMe(Graphics g){
		if(visible){
			//drawAnimation(g);
			g.drawImage(flower.get(ran), x, y, null);
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
		
	}
}