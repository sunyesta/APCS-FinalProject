import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;


public class DialogBox{
	private ArrayList<Image>box = new  ArrayList<Image>();
	
	
	public int scene=0;
	private int counter=0;
	private int frames=1;
	private int direction=1;
	
	public DialogBox(){
		animation();
		
	}
	
	public void drawMe(Graphics g,int x, int y){
		counter++;
		g.drawImage(box.get(frames), x, y, null);
		if(counter==3){
			if(frames+direction<box.size()&& frames+direction>=0){
				frames+=direction;
			}
			
			
			counter=0;
		}
		
		
	}
	
	public void setDirection(int direction){
		this.direction=direction;
	}
	public void reset(){
		frames=0;
	}
	
	public boolean getFinished(){
		return frames==box.size()-1;
	}
	public int getFrame(){
		return frames;
	}
	
	public void animation(){
		
		box.add(new ImageIcon("").getImage());
		box.add(new ImageIcon("").getImage());
		box.add(new ImageIcon("images/objects/dialog box/dialog box0001.png").getImage());
		box.add(new ImageIcon("images/objects/dialog box/dialog box0002.png").getImage());
		box.add(new ImageIcon("images/objects/dialog box/dialog box0003.png").getImage());
		box.add(new ImageIcon("images/objects/dialog box/dialog box0004.png").getImage());
		box.add(new ImageIcon("images/objects/dialog box/dialog box0005.png").getImage());
		box.add(new ImageIcon("images/objects/dialog box/dialog box0006.png").getImage());
		box.add(new ImageIcon("images/objects/dialog box/dialog box0007.png").getImage());
		
		
	}	
}