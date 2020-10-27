import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;

public class SceneChanger{
	SchoolYard schoolYard;
	OfficeScene officeScene;
	TitleScene titleScene;
	HallScene hallScene;
	Park park;
	EmployeeOffice employeeOffice;
	Classroom classroom;
	Instructions instructions;
	
	public int scene=0;
	public int x=0;
	public int y=0;
	
	public SceneChanger(){
		 schoolYard=new SchoolYard();
		 officeScene=new OfficeScene();
		 hallScene=new HallScene();
		 titleScene=new TitleScene();
		 park=new Park();
		 employeeOffice=new EmployeeOffice();
		 classroom=new Classroom();
		 instructions=new Instructions();
	}
	
	public void drawMe(Graphics g){
		if(scene==8){
			park.drawMe(g,x,y);
		}
		if(scene==7){
			employeeOffice.drawMe(g,x,y);
		}
		if(scene==6){
			schoolYard.drawMe(g,x,y);
		}
		if(scene==5){
			classroom.drawMe(g,x,y);
		}
		if(scene==4){
			hallScene.drawMe(g,x,y);
		}
		if(scene==3){
			officeScene.drawMe(g,x,y);
		}
		if(scene==2){
			
		}
		if(scene==1){
			instructions.drawMe(g);
		}
		if(scene==0){
			titleScene.drawMe(g);
		}
		
	}
	
	public void setPosition(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setScene(int scene){
		this.scene=scene;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
	public int getScene(){
		return scene;
	}
	public boolean getPlayerVisible(){
		return true;
	}
	
}