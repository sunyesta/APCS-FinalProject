import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Graphics;

public class Kid extends SideCharacter{
	
	private ArrayList<Image>blowingBubbles = new  ArrayList<Image>();
	private ArrayList<Image>sitting = new  ArrayList<Image>();
	
	private Image kid;
	
	private int counter=0;
	private int frame=0;
	private int frame2=0;
	private int direction=1;
	private int x=59;
	private int y=515;
	
	private boolean type;
	
	
	public Kid(){
		renderImages();
		
		kid=new ImageIcon("images/characters/kid.jpg").getImage();
		
	}
	
	public void drawMe(Graphics g){
		if(frame==0 && frame2==0){
			type = randomBoolean();
			counter=4;
		}	
		if(type){
			animateSitting(g);
		}else{
			animateBlowingBubbles(g);
		}
		
		
		
	}
	
	
	public void animateSitting(Graphics g){
		counter++;
		g.drawImage(blowingBubbles.get(frame), x, y, null);
		if(counter==5){
			frame+=direction;
			if(frame==blowingBubbles.size()){
				frame=0;
			}
			counter=0;
		}
	}
	public void animateBlowingBubbles(Graphics g){
		counter++;
		g.drawImage(sitting.get(frame), x, y, null);
		if(counter==5){
			frame+=direction;
			if(frame==blowingBubbles.size()){
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
		return 195;
	}
	public int getHeight(){
		return 259;
	}
	
	public boolean randomBoolean(){
		return Math.random() < 0.3;
	}
	public void renderImages(){
		
		
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0001.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/sitting/sitting0001.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0002.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0003.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0004.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0005.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0006.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0007.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0008.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0009.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0010.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0011.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0012.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0013.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0014.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0015.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0016.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0017.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0018.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0019.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0020.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0021.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0022.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0023.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0024.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0025.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0026.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0027.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0028.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0029.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0030.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0031.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0032.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0033.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0034.png").getImage());
		blowingBubbles.add(new ImageIcon("images/characters/rosset/blowing bubbles/sitting0035.png").getImage());
	
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0001.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0002.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0003.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0004.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0005.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0006.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0007.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0008.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0009.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0010.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0011.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0012.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0013.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0014.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0015.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0016.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0017.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0018.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0019.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0020.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0021.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0022.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0023.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0024.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0025.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0026.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0027.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0028.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0029.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0030.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0031.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0032.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0033.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0034.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0035.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0036.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0037.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0038.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0039.png").getImage());
		sitting.add(new ImageIcon("images/characters/rosset/sitting/sitting0040.png").getImage());
		
		
	}

}