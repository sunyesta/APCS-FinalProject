import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
public class JumpRope extends Object{
	
	private ArrayList<Image>pennyShine = new  ArrayList<Image>();
	
	private Image jumpRope;
	
	int counter=0;
	int frame=0;
	int x=828;
	int y=614;
	
	boolean visible=true;
	boolean collectable=true;
	
	public JumpRope(){
		

		frame=(int)(Math.random()*pennyShine.size());
		jumpRope=new ImageIcon("images/objects/jump rope.png").getImage();

	}
	
	public void drawMe(Graphics g){
		
		if(visible){
			//drawAnimation(g);
			g.drawImage(jumpRope, x, y, null);
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
	
	
}