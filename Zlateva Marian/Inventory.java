import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Font;

public class Inventory{
	private Image inventoryBar;
	private Image coinIcon;
	private Image cat;
	private Image dog;
	private Image coffee;
	private Image flower;
	private Image bubbles;
	private Image map;
	private Image jumpRope;
	
	public ArrayList<String>items=new ArrayList<String>();
	
	public int scene=0;
	private int movement=0;
	
	private int cash=0;
	
	private boolean coinAdded=false;
	
	public Inventory(){
		inventoryBar = new ImageIcon("images/inventory bar.png").getImage();
		coinIcon = new ImageIcon("images/objects/coin icon.png").getImage();
		cat = new ImageIcon("images/objects/cat.png").getImage();
		dog = new ImageIcon("images/objects/dog.png").getImage();
		coffee = new ImageIcon("images/objects/coffee.png").getImage();
		flower = new ImageIcon("images/objects/flower1.png").getImage();
		bubbles = new ImageIcon("images/objects/bubbles.png").getImage();
		map = new ImageIcon("images/objects/map.png").getImage();
		jumpRope = new ImageIcon("images/objects/jump rope icon.png").getImage();
	}
	
	public void drawMe(Graphics g){
		g.drawImage(inventoryBar, 0, 0, null);
		int x=254;
		for(int i=0;i<items.size();i++){
			if(x+movement>=254 && x+movement<=254+85*5){
				if(items.get(i).equals("coin")){
					g.drawImage(coinIcon, x+movement,820, null);
					 g.setFont(new Font("Verdana", Font.BOLD, 15));
					g.drawString("$"+ Math.round(cash * 100.0) / 100.0,x+5+movement,830);
				}
				if(items.get(i).equals("cat")){
					g.drawImage(cat, x+movement,820, null);
				}
				if(items.get(i).equals("dog")){
					g.drawImage(dog, x+movement,820, null);
				}
				if(items.get(i).equals("coffee")){
					g.drawImage(coffee, x+movement,820, null);
				}
				if(items.get(i).equals("flower")){
					g.drawImage(flower, x+movement,820, null);
				}
				if(items.get(i).equals("bubbles")){
					g.drawImage(bubbles, x+movement,820, null);
				}
				if(items.get(i).equals("map")){
					g.drawImage(map, x+movement,820, null);
				}
				if(items.get(i).equals("jumpRope")){
					g.drawImage(jumpRope, x+movement,820, null);
				}
			}
			
			x+=85;
		}
	}
	
	public void setScene(int scene){
		this.scene=scene;
	}
	
	public int getScene(){
		return scene;
	}
	
	public void setMovement(int movement){
		this.movement=movement;
	}
	
	public int getMovement(){
		return movement;
	}
	public int getCash(){
		return cash;
	}
	public void setCash(int cash){
		this.cash=cash;
		if(cash==0){
			items.remove("coin");
			coinAdded=false;
		}
	}
	public boolean getObject(String object){
		for(int i=0;i<items.size();i++){
			if(items.get(i).equals(object)){
				return true;
			}
		}
		return false;
	}
	public boolean getObject(String object,int num){
		int count=0;
		for(int i=0;i<items.size();i++){
			if(items.get(i).equals(object)){
				count++;
			}
		}
		return count==num;
	}
	public void addItem(String item){
		if(item.equals("coin")){
			if(!coinAdded){
				items.add(item);
			}
			coinAdded=true;
			cash+=1;
			
		}else{
			items.add(item);
		}
	}
	public int getXLocation(String item){
		System.out.println("x: "+((85*(items.indexOf(item)))+254));
		if((85*(items.indexOf(item)+1))+movement>=254 && (85*(items.indexOf(item)+1))+movement<=254+85*5){
			System.out.println("got");
			
			return ((85*(items.indexOf(item)))+254+movement);
		}
		return 254;
	}
	
}

/*
		if x position of a certian image is greater than
		the max or less than the min, then don't show it
		
		there will be arrow keys to change x positions


*/