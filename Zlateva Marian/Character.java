import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.geom.Area;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Character {

    Walking walkingAnimation = new Walking();
	//check collision in the direction that i'm moving and if there is a collision, don't allow me to move in that direction
    int xPrevious = 500;
    int yPrevious = 500;
    int x = 500;
    int y = 500;
    int width = 140;
    int height = 220;
    int direction = 0;
    int keyDirection = 0;
    int scene = 0;
	
    boolean moving = false;
	
	private Sound sound;
	
    private Image standing;

    public Character() {
        standing = new ImageIcon("images/girl.png").getImage();

    }

    public void drawMe(Graphics g) {
        walkingAnimation.drawMe(g, x, y, getKeyDirection(), moving);
		 
        
        //g.drawImage(standing, x, y, null);
    }
    public void setXPosition(int x) {
        if (!detectCollision()) {
            xPrevious = this.x;
            this.x = x;
            yPrevious = y;
        }else{
			this.x=xPrevious;
		}

    }
    public void setYPosition(int y) {
        if (!detectCollision()) {
            yPrevious = this.y;
            this.y = y;
            xPrevious = x;
        }else{
			this.y=yPrevious;
		}

    }
    public int getXPosition() {
        return x;
    }
    public int getYPosition() {
        return y;
    }


    public int findDirection() {
        /*
        0=forward 
        1=left  
        2=right 
        3=back 
		
        */
        int yDirection = y - yPrevious;
        int xDirection = x - xPrevious;

        if (xDirection < 0 && yDirection == 0) {
            return 1;
        } else if (xDirection > 0 && yDirection == 0) {
            return 2;
        } else if (yDirection < 0) {
            return 3;
        } else if (yDirection > 0) {
            return 0;
        }

        return 0;
    }
	
	public void setKeyDirection(int keyDirection){
		this.keyDirection=keyDirection;
	}
	
	public int getKeyDirection(){
		return keyDirection;
	}

    public void setMoving(boolean moving) {

        this.moving = moving;
        int yDirection = y - yPrevious;
        int xDirection = x - xPrevious;
        if (xDirection == 0 && yDirection == 0) {
            this.moving = false;
        }


    }

    public boolean checkCollision(Princle princle) {
        int x2 = princle.getXPosition();
        int y2 = princle.getYPosition();
        int width2 = princle.getWidth();
        int height2 = princle.getHeight();
        if ((x - 50 + width) > x2 && x + 50 < (x2 + width2) && (y + height+100) > y2 && y < (y2 + height2)) {
            
			return true;
        }
        return false;
    }
	public boolean checkCollision(Kid kid) {
        int x2 = kid.getXPosition();
        int y2 = kid.getYPosition();
        int width2 = kid.getWidth();
        int height2 = kid.getHeight();
        if ((x - 50 + width) > x2 && x + 50 < (x2 + width2) && (y + height+100) > y2 && y < (y2 + height2)) {
            return true;
        }
        return false;
    }
	public boolean checkCollision(Kid2 kid2) {
        int x2 = kid2.getXPosition();
        int y2 = kid2.getYPosition();
        int width2 = kid2.getWidth();
        int height2 = kid2.getHeight();
        if ((x - 50 + width) > x2-100 && x + 50 < (x2 + width2+width2) && (y + height+100) > y2 && y < (y2 + height2+50)) {
            return true;
        }
        return false;
    }

    public boolean checkCollision(Coin coin) {
        int x2 = coin.getXPosition();
        int y2 = coin.getYPosition();
        int width2 = coin.getWidth();
        int height2 = coin.getHeight();
        if(coin.getVisible()==false){
			return false;
		}
		if ((x - 50 + width) > x2 && x + 50 < (x2 + width2) && (y + height) > y2 && y + 200 < (y2 + height2)) {
            coinSound();
			return true;
        }
        return false;
    }
	public boolean checkCollision(Coffee coffee) {
        int x2 = coffee.getXPosition();
        int y2 = coffee.getYPosition();
        int width2 = coffee.getWidth();
        int height2 = coffee.getHeight();
        if(coffee.getVisible()==false){
			return false;
		}
		if ((x - 50 + width) > x2 && x + 50 < (x2 + width2) && (y + height) > y2 && y + 200 < (y2 + height2)) {
            //System.out.println("fsdf");
			grabSound();
			return true;
			
        }
        return false;
    }
	public boolean checkCollision(Flower flower) {
        int x2 = flower.getXPosition();
        int y2 = flower.getYPosition();
        int width2 = flower.getWidth();
        int height2 = flower.getHeight();
        if(flower.getVisible()==false){
			return false;
		}
		if ((x - 50 + width) > x2 && x + 50 < (x2 + width2) && (y + height) > y2 && y + 200 < (y2 + height2)) {
            //System.out.println("fsdf");
			grabSound();
			return true;
			
        }
		
        return false;
    }
	
	public boolean checkCollision(Bubbles bubbles) {
        int x2 = bubbles.getXPosition();
        int y2 = bubbles.getYPosition();
        int width2 = bubbles.getWidth();
        int height2 = bubbles.getHeight();
        if(bubbles.getVisible()==false){
			return false;
		}
		if ((x - 50 + width) > x2 && x + 50 < (x2 + width2) && (y + height) > y2 && y + 200 < (y2 + height2)) {
            System.out.println("fsdf");
			return true;
			
        }
        return false;
    }
	
	public boolean checkCollision(JumpRope jumpRope) {
        int x2 = jumpRope.getXPosition();
        int y2 = jumpRope.getYPosition();
        int width2 = jumpRope.getWidth();
        int height2 = jumpRope.getHeight();
        if(jumpRope.getVisible()==false){
			return false;
		}else if ((x - 50 + width) > x2 && x + 50 < (x2 + width2) && (y + height) > y2 && y + 200 < (y2 + height2)) {
            //System.out.println("fsdf");
			grabSound();
			return true;
			
        }
        return false;
    }
	
	public boolean checkCollision(Teacher teacher,int backgroundX) {
        int x2 = teacher.getXPosition();
        int y2 = teacher.getYPosition();
        int width2 = teacher.getWidth();
        int height2 = teacher.getHeight();
        
		if ((x - 50 + width) > x2+backgroundX && x + 50 < (x2+backgroundX + width2) && (y + height) > y2 && y + 200 < (y2 + height2)) {
            //System.out.println("fsdf");
			return true;
			
        }
        return false;
    }

    public boolean detectCollision() {
        if (scene == 3) {
            return getCollisionWithBackgroundScene3();
        }else if(scene==4){
			return y<373 || x<192;
		}
		return false;
       
    }

    public boolean getCollisionWithBackgroundScene3() {
         int[] xpoints = new int[] {1100,873,0,0,1100
        };
        int[] ypoints = new int[] {626,490,488,0,0
        };
        Polygon shapeA = new Polygon(xpoints, ypoints, xpoints.length);
        Rectangle shapeB = new Rectangle(x, y + 200, width, height - 200);
        Area areaA = new Area(shapeA);
        areaA.intersect(new Area(shapeB));
        return !areaA.isEmpty();
    }

    public void setScene(int scene) {
        this.scene = scene;
    }
	public boolean getCollisionHallwayDoor1(int backgroundX){
		if(x<677 && backgroundX<-1000 && y<378){
			return true;
		}
		return false;
	}
	public boolean getCollisionHallwayDoor3(){
		if(x<535 && x>285 && y<378){
			return true;
		}
		return false;
	}
	
	public void grabSound() {
 
        try {
            URL url = this.getClass().getClassLoader().getResource("sound/grab.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
	public void coinSound() {
 
        try {
            URL url = this.getClass().getClassLoader().getResource("sound/grab.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }




}