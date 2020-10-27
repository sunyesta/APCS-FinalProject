import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;
public class Teacher extends SideCharacter{
	
	private ArrayList<Image>standing = new  ArrayList<Image>();
	
	int counter=0;
	int frame=0;
	int direction=1;
	
	int x=450;
	int y=170;
	
	public Teacher(){
		renderImages();
		
	}
	
	public void drawMe(Graphics g,int backgroundX){
		animateStanding(g,backgroundX);
	}
	
	
	public void animateStanding(Graphics g,int backgroundX){
		counter++;
		g.drawImage(standing.get(frame), x+backgroundX, y, null);
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
		return 240;
	}
	public int getHeight(){
		return 474;
	}
	
	
	public void renderImages(){
		standing.add(new ImageIcon("images/characters/teacher1/teacher10001.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10002.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10003.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10004.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10005.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10006.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10007.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10008.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10009.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10010.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10011.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10012.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10013.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10014.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10015.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10016.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10017.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10018.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10019.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10020.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10021.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10022.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10023.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10024.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10025.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10026.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10027.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10028.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10029.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10030.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10031.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10032.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10033.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10034.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10035.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10036.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10037.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10038.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10039.png").getImage());
		standing.add(new ImageIcon("images/characters/teacher1/teacher10040.png").getImage());
	}

}