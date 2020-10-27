import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;


public class Walking{
	private ArrayList<Image>girlWalkingDown = new  ArrayList<Image>();
	private ArrayList<Image>girlWalkingLeft = new  ArrayList<Image>();
	private ArrayList<Image>girlWalkingUp = new  ArrayList<Image>();
	private ArrayList<Image>girlWalkingRight = new  ArrayList<Image>();
	private ArrayList<Image>girlStandingLeft = new  ArrayList<Image>();
	private ArrayList<Image>girlStandingRight = new  ArrayList<Image>();
	private ArrayList<Image>girlStandingFront = new  ArrayList<Image>();
	private ArrayList<Image>girlStandingBack = new  ArrayList<Image>();
	
	public int scene=0;
	private int counter=0;
	private int framesForWalkingUpAndDown=0;
	private int framesForWalkingLeftAndRight=0;
	private int framesForStanding=0;
	
	public Walking(){
		addWalkingAnimations();
		
	}
	
	public void drawMe(Graphics g,int x, int y,int direction, boolean moving){
		/*
		0=forward 
		1=left  
		2=right 
		3=back 
		
		*/
		
		//check for non moving
		if(direction==0 && !moving){
			drawMeStandingFront(g,x,y);
		}else if(direction==1 && !moving){
			drawMeStandingLeft(g,x,y);
		}else if(direction==2 && !moving){
			drawMeStandingRight(g,x,y);
		}else if(direction==3 && !moving){
			drawMeStandingBack(g,x,y);
		}
		//check for moving
		else if(direction==0){
			drawMeWalkingDown(g,x,y);
		}else if(direction==1){
			drawMeWalkingLeft(g,x,y);
		}else if(direction==2){
			drawMeWalkingRight(g,x,y);
		}else if(direction==3){
			drawMeWalkingUp(g,x,y);
		}
		
		
	}
	
	public void drawMeWalkingDown(Graphics g,int x, int y){
		
		counter++;
		g.drawImage(girlWalkingDown.get(framesForWalkingUpAndDown), x, y, null);
		if(counter==5){
			framesForWalkingUpAndDown++;
			if(framesForWalkingUpAndDown==girlWalkingDown.size()){
				framesForWalkingUpAndDown=0;
			}
			counter=0;
		}
			
		
	}
	
	public void drawMeWalkingUp(Graphics g,int x, int y){
		
		counter++;
		g.drawImage(girlWalkingUp.get(framesForWalkingUpAndDown), x, y, null);
		if(counter==5){
			framesForWalkingUpAndDown++;
			if(framesForWalkingUpAndDown==girlWalkingUp.size()){
				framesForWalkingUpAndDown=0;
			}
			
			counter=0;
		}
			
		
	}
	
	public void drawMeWalkingLeft(Graphics g,int x, int y){
		
		counter++;
		g.drawImage(girlWalkingLeft.get(framesForWalkingLeftAndRight), x, y, null);
		if(counter==5){
			framesForWalkingLeftAndRight++;
			if(framesForWalkingLeftAndRight==girlWalkingLeft.size()){
				framesForWalkingLeftAndRight=0;
			}
			counter=0;
		}
			
		
	}
	
	public void drawMeWalkingRight(Graphics g,int x, int y){
		
		counter++;
		g.drawImage(girlWalkingRight.get(framesForWalkingLeftAndRight), x, y, null);
		if(counter==5){
			framesForWalkingLeftAndRight++;
			if(framesForWalkingLeftAndRight==girlWalkingRight.size()){
				framesForWalkingLeftAndRight=0;
			}
			counter=0;
		}
			
		
	}
	
	public void drawMeStandingLeft(Graphics g,int x,int y){
		counter++;
		g.drawImage(girlStandingLeft.get(framesForStanding), x, y, null);
		if(counter==5){
			framesForStanding++;
			if(framesForStanding==girlStandingLeft.size()){
				framesForStanding=0;
			}
			counter=0;
		}
	}
	
	public void drawMeStandingRight(Graphics g,int x,int y){
		counter++;
		g.drawImage(girlStandingRight.get(framesForStanding), x, y, null);
		if(counter==5){
			framesForStanding++;
			if(framesForStanding==girlStandingRight.size()){
				framesForStanding=0;
			}
			counter=0;
		}
	}
	
	public void drawMeStandingFront(Graphics g,int x,int y){
		counter++;
		g.drawImage(girlStandingFront.get(framesForStanding), x, y, null);
		if(counter==5){
			framesForStanding++;
			if(framesForStanding==girlStandingFront.size()){
				framesForStanding=0;
			}
			counter=0;
		}
	}
	
	public void drawMeStandingBack(Graphics g,int x,int y){
		counter++;
		g.drawImage(girlStandingBack.get(framesForStanding), x, y, null);
		if(counter==5){
			framesForStanding++;
			if(framesForStanding==girlStandingBack.size()){
				framesForStanding=0;
			}
			counter=0;
		}
	}
	
	public void setScene(int scene){
		this.scene=scene;
	}
	
	public int getScene(){
		return scene;
	}
	
	public int getWidth(){
		return 140;
	}
	public int getHeight(){
		return 220;
	}
	
	public void addWalkingAnimations(){
		girlWalkingDown.add(new ImageIcon("images/girl/girl walking/girl1.png").getImage());
		girlWalkingDown.add(new ImageIcon("images/girl/girl walking/girl2.png").getImage());
		girlWalkingDown.add(new ImageIcon("images/girl/girl walking/girl3.png").getImage());
		girlWalkingDown.add(new ImageIcon("images/girl/girl walking/girl4.png").getImage());
		
		girlWalkingUp.add(new ImageIcon("images/girl/girl walking back/girl1.png").getImage());
		girlWalkingUp.add(new ImageIcon("images/girl/girl walking back/girl2.png").getImage());
		girlWalkingUp.add(new ImageIcon("images/girl/girl walking back/girl3.png").getImage());
		girlWalkingUp.add(new ImageIcon("images/girl/girl walking back/girl4.png").getImage());
		
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl1.png").getImage());
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl2.png").getImage());
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl3.png").getImage());
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl4.png").getImage());
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl5.png").getImage());
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl6.png").getImage());
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl7.png").getImage());
		girlWalkingLeft.add(new ImageIcon("images/girl/girl walking left/girl8.png").getImage());
		
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl1.png").getImage());
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl2.png").getImage());
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl3.png").getImage());
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl4.png").getImage());
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl5.png").getImage());
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl6.png").getImage());
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl7.png").getImage());
		girlWalkingRight.add(new ImageIcon("images/girl/girl walking right/girl8.png").getImage());
		
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0001.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0002.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0003.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0004.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0005.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0006.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0007.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0008.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0009.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0010.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0011.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0012.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0013.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0014.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0015.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0016.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0017.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0018.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0019.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0020.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0021.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0022.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0023.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0024.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0025.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0026.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0027.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0028.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0029.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0030.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0031.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0032.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0033.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0034.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0035.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0036.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0037.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0038.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0039.png").getImage());
		girlStandingLeft.add(new ImageIcon("images/girl/girl standing left/girl0040.png").getImage());
		
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0001.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0002.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0003.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0004.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0005.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0006.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0007.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0008.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0009.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0010.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0011.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0012.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0013.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0014.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0015.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0016.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0017.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0018.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0019.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0020.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0021.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0022.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0023.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0024.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0025.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0026.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0027.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0028.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0029.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0030.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0031.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0032.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0033.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0034.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0035.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0036.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0037.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0038.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0039.png").getImage());
		girlStandingRight.add(new ImageIcon("images/girl/girl standing right/girl0040.png").getImage());
		
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0001.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0002.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0003.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0004.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0005.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0006.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0007.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0008.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0009.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0010.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0011.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0012.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0013.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0014.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0015.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0016.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0017.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0018.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0019.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0020.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0021.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0022.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0023.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0024.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0025.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0026.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0027.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0028.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0029.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0030.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0031.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0032.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0033.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0034.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0035.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0036.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0037.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0038.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0039.png").getImage());
		girlStandingFront.add(new ImageIcon("images/girl/girl standing front/girl0040.png").getImage());
		
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0001.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0002.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0003.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0004.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0005.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0006.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0007.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0008.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0009.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0010.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0011.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0012.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0013.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0014.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0015.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0016.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0017.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0018.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0019.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0020.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0021.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0022.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0023.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0024.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0025.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0026.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0027.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0028.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0029.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0030.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0031.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0032.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0033.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0034.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0035.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0036.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0037.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0038.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0039.png").getImage());
		girlStandingBack.add(new ImageIcon("images/girl/girl standing back/girl0040.png").getImage());
	}	
}