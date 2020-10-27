import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.imageio.ImageIO;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class Screen extends JPanel implements ActionListener, MouseListener, KeyListener {
    
	
	private Image map;
	private Image winScreen;
	
    private int dialogIndex;
    private int dialogIndex2;
    private int dialogIndex3;
    private int dialogIndex4;
    private int progress;
    private int counter;
    private int endCounter;
    private int quest;

    private String name;

    private ArrayList < JButton > buttonList;
    private ArrayList < Coin > coin;
    private ArrayList < Flower > flower;
    private ArrayList < String > dialog;
    private ArrayList < String > dialog2;
    private ArrayList < String > dialog3;
    private ArrayList < String > dialog4;
    private ArrayList < Object > items;

    private JButton toInstructionsButton;
    private JButton toPrologueButton;
    private JButton toGameButton;
    private JButton scrollRight;
    private JButton scrollLeft;
    private JButton nextDialog;
    private JButton option1;
    private JButton option2;
    private JButton option3;
    private JButton schoolButton;
    private JButton parkButton;
    private JButton exitMapButton;

    private boolean goingDown;
    private boolean goingUp;
    private boolean goingLeft;
    private boolean goingRight;
    private boolean gameOver;
    private boolean freemove;
    private boolean showMap;
    private boolean win;
	
	private Character me;
    private Princle princle;
    private SceneChanger sceneChanger;
    private Inventory inventory;
    private DialogBox dialogBox;
    private DialogBox dialogBox2;
    private Coffee coffee;
    private Kid kid;
    private Bubbles bubbles;
    private Teacher teacher;
    private Kid2 kid2;
    private Kid3 kid3;
    private JumpRope jumpRope;
    private Sound sound;

    private JTextPane dialogPane;





    public Screen() {
        this.setLayout(null);
        addMouseListener(this);
        setFocusable(true);
        addKeyListener(this);

        me = new Character();
        princle = new Princle();
        sceneChanger = new SceneChanger();
        inventory = new Inventory();
        dialogBox = new DialogBox();
        dialogBox2 = new DialogBox();
        coffee = new Coffee();
        kid = new Kid();
        bubbles = new Bubbles();
        teacher = new Teacher();
        kid2 = new Kid2();
        kid3 = new Kid3();
        jumpRope = new JumpRope();
		
		map = new ImageIcon("images/objects/full map.png").getImage();
		winScreen = new ImageIcon("images/win.png").getImage();
		
        dialogIndex = 0;
        dialogIndex2 = 0;
        dialogIndex3 = 0;
        progress = 0;
        counter = 0;
		
        name = "Mary";

        buttonList = new ArrayList < JButton > ();
        coin = new ArrayList < Coin > ();
        flower = new ArrayList < Flower > ();
        dialog = new ArrayList < String > ();
        dialog2 = new ArrayList < String > ();
        dialog3 = new ArrayList < String > ();
        dialog4 = new ArrayList < String > ();
        items = new ArrayList < Object > ();

        sceneChanger.setScene(0);

        coin.add(new Coin(846, 563));
        coin.add(new Coin(106, 529));
        coin.add(new Coin(154, 717));
        coin.add(new Coin());
        coin.add(new Coin());
        coin.add(new Coin());
        coin.add(new Coin());
        coin.add(new Coin());
        coin.add(new Coin());
        coin.add(new Coin());
		sound.playSound("sound\\music.wav",true);
        flower.add(new Flower(951, 529));
        flower.add(new Flower(705, 672));
        flower.add(new Flower(339, 528));

        dialog.add("Hello " + name + ". How are you doing today? I hope you feel ashamed because what you did was not right.");
        dialog.add("Give me coffee");
        dialog.add("I'm waiting for my coffee");
        dialog.add("Thanks for the coffee. School's over now. Come back to me once you've helped two more people.");
        dialog.add("You helped 3 people already? Well, I guess I'll award you by not giving you detention");

        dialog2.add("Hey bestie! Can you get me some flowers and more bubbles?");
        dialog2.add("Yay! Thankyou! Also, I heard that Lily and Chloe need help in the park. I'll show you how to get here on this map");

        dialog3.add("Ugh. What do you want little girl?");
        dialog3.add("text here");
        dialog3.add("Come back once you've got $10");
        dialog3.add("Fine, you can go in. But I better not come in there and see you eating my chocolate bar.");
        
		dialog4.add("Hey girl! Can you help us find our missing jump rope?");
		dialog4.add("Thanks soo much!");

		
        addButtons();

        goingDown = false;
        goingUp = false;
        goingLeft = false;
        goingRight = false;
        freemove = true;

        /*
        	Scene:
        		~ 0 = start screen
        		~ 1 = instructions
        		~ 2 = proloque
        		~ 3 = office
        		~ 4 = school yard
        */
        dialogPane = new JTextPane() {
            @Override
            public void repaint() {}

            @Override
            public void repaint(int x, int y, int width, int height) {}

            @Override
            public void repaint(long tm) {}

            @Override
            public void repaint(long tm, int x, int y, int width, int height) {}

            @Override
            public void update(Graphics g) {}





        };
        dialogPane.setBounds(621, 106, 210, 116);
        dialogPane.setBackground(new Color(204, 204, 204));
        //dialogPane.setBackground(new Color(0,0,0));
        this.add(dialogPane);
        dialogPane.setForeground(Color.BLACK);
        dialogPane.setFont(new Font("Verdana", Font.BOLD, 15));
        dialogPane.setEditable(false);
        dialogPane.getCaret().deinstall(dialogPane);

        //dialogPane.setEnabled(false);
        dialogPane.setHighlighter(null);
        dialogPane.setText(dialog.get(dialogIndex));
        dialogPane.setVisible(false);
		
		


    }
    public Dimension getPreferredSize() {
        return new Dimension(1100, 900);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
		
		sceneChanger.drawMe(g);
		if(sceneChanger.getScene()==0){
			sceneChanger.drawMe(g);
			scrollLeft.setVisible(false);
			scrollRight.setVisible(false);
		}
       //System.out.println("scene: "+sceneChanger.getScene());
      // System.out.println("progress: "+progress);
        
        if (sceneChanger.getScene() == 3) {
            //scrollLeft.setVisible(true);
			//scrollRight.setVisible(true);
			me.setScene(3);
			dialogPane.setText(dialog.get(dialogIndex));
            sceneChanger.drawMe(g);
            princle.drawMe(g);
			//jumpRope.drawMe(g);
            coin.get(0).drawMe(g);
            coin.get(1).drawMe(g);
            coin.get(2).drawMe(g);
			if(progress>=4){
				jumpRope.drawMe(g);
			}
			
            me.drawMe(g);
            inventory.drawMe(g);
            dialogBox.drawMe(g, 621, 106);
            if (me.checkCollision(coin.get(0))) {
                coin.get(0).setVisible(false);
                inventory.addItem("coin");
            }
            if (me.checkCollision(coin.get(1))) {
                coin.get(1).setVisible(false);
                inventory.addItem("coin");
            }
            if (me.checkCollision(coin.get(2))) {
                coin.get(2).setVisible(false);
                inventory.addItem("coin");
            }
			if (me.checkCollision(jumpRope) && progress>=4) {
                jumpRope.setVisible(false);
                inventory.addItem("jumpRope");
				
            }
            if (me.checkCollision(princle)) {
				if(progress>=5){
					win=true;
				}
                
				if (dialogBox.getFinished()) {
                    dialogPane.setBounds(621, 106, 210, 116);
                    dialogPane.setVisible(true);

                    if (dialogIndex == 0) {
                        option1.setVisible(true);
                        option2.setVisible(true);
                        option3.setVisible(true);
                        option1.setBounds(621, 240, 210, 20);
                        option2.setBounds(621, 260, 210, 20);
                        option3.setBounds(621, 280, 210, 20);

                    } else {
                        option1.setVisible(false);
                        option2.setVisible(false);
                        option3.setVisible(false);
                    }
                    if (inventory.getObject("coffee")) {
                        sound.playSound("sound/school bell2.wav");
                        inventory.items.remove("coffee");
                        dialogIndex++;
                        progress++;
                    }
					if(progress==5){
						dialogIndex=4;
					}

                }
				if(dialogBox.getFrame()==1 && !win){
					sound.playSound("sound/man.wav");
				}else if(dialogBox.getFrame()==1 && win){
					sound.playSound("sound/win.wav");
				}
				
                dialogBox.setDirection(1);
            } else {
                if (progress == 0) {
                    dialogIndex = 0;
                }
                if (progress == 1) {
                    dialogIndex = 2;
                }
                dialogBox.setDirection(-1);
                dialogPane.setVisible(false);
                nextDialog.setVisible(false);
                option1.setVisible(false);
                option2.setVisible(false);
                option3.setVisible(false);
            }
            if (me.getXPosition() < 0 && progress >= 1) {
				 me.setYPosition(492);
				me.setXPosition(1000);
               
				
                sceneChanger.setPosition(-1100, 0);
				me.setScene(4);
                sceneChanger.setScene(4);

            }

        }
        if (sceneChanger.getScene() == 4) {
            //System.out.println("Progress: "+progress);

            me.setScene(4);
            sceneChanger.drawMe(g);
            coin.get(3).drawMe(g,sceneChanger.getX()+463+1100,623);
            coin.get(4).drawMe(g,sceneChanger.getX()+113+1100,663);
            coin.get(5).drawMe(g,sceneChanger.getX()+170+1100,704);
            coin.get(6).drawMe(g,sceneChanger.getX()+373,635);
            coin.get(7).drawMe(g,sceneChanger.getX()+482,737);
            coin.get(8).drawMe(g,sceneChanger.getX()+798,685);
            coin.get(9).drawMe(g,sceneChanger.getX()+429,653);
            
            teacher.drawMe(g, sceneChanger.getX());
            me.drawMe(g);
            dialogBox.drawMe(g, 621 + sceneChanger.getX(), 106);
            inventory.drawMe(g);
            //System.out.println("Scene Changer x:"+sceneChanger.getX()+" , Me X:"+me.getXPosition()+" , Me Y:"+me.getYPosition());
            if (me.checkCollision(coin.get(3))) {
                coin.get(3).setVisible(false);
                inventory.addItem("coin");
            }
            if (me.checkCollision(coin.get(4))) {
                coin.get(4).setVisible(false);
                inventory.addItem("coin");
            }
            if (me.checkCollision(coin.get(5))) {
                coin.get(5).setVisible(false);
                inventory.addItem("coin");
            }
			if (me.checkCollision(coin.get(6))) {
                coin.get(6).setVisible(false);
                inventory.addItem("coin");
            }
			if (me.checkCollision(coin.get(7))) {
                coin.get(7).setVisible(false);
                inventory.addItem("coin");
            }
			if (me.checkCollision(coin.get(8))) {
                coin.get(8).setVisible(false);
                inventory.addItem("coin");
            }
			if (me.checkCollision(coin.get(9))) {
                coin.get(9).setVisible(false);
                inventory.addItem("coin");
            }
			if (me.getCollisionHallwayDoor1(sceneChanger.getX())) {
                me.setScene(5);
				me.setYPosition(800);
                sceneChanger.setScene(5);

            }

           

            if (me.getXPosition() > 1100) {
                me.setScene(3);
                me.setXPosition(0);
                sceneChanger.setScene(3);

            } else if (me.getXPosition() < 192 && progress >= 3) {
                me.setScene(6);
                me.setXPosition(1000);
                sceneChanger.setScene(6);
            }else if(me.getCollisionHallwayDoor3() && progress>=2){
				me.setScene(7);
                me.setYPosition(800);
                me.setXPosition(545);
                
                sceneChanger.setScene(7);
				sceneChanger.setPosition(-1100, 0);
			}

            if (me.checkCollision(teacher, sceneChanger.getX())) {
                dialogPane.setText(dialog3.get(dialogIndex3));
				if(dialogBox.getFrame()==1){
					sound.playSound("sound/woman.wav");
				}
				if (dialogBox.getFinished()) {
                    if (counter == 1) {
                        dialogPane.setLocation(621 + sceneChanger.getX(), 106);
                    }

                    dialogPane.setVisible(true);

                    if (dialogIndex3 == 0) {
                        option1.setText("<html>" + "I need to get some coffee for\n the principle".replaceAll("\\n", "<br>") + "</html>");
                        option2.setText("<html>" + "I'm here because my cat is\nstuck back there".replaceAll("\\n", "<br>") + "</html>");
                        option3.setText("<html>" + "I'm a teacher from the future here to save the fate of the world.".replaceAll("\\n", "<br>") + "</html>");
                        option1.setVisible(true);
                        option2.setVisible(true);
                        option3.setVisible(true);
                        option1.setBounds(621, 240, 210, 40);
                        option2.setBounds(621, 280, 210, 40);
                        option3.setBounds(621, 320, 210, 50);

                    } else {
                        option1.setVisible(false);
                        option2.setVisible(false);
                        option3.setVisible(false);
                    }
					if (inventory.getCash()==10 && dialogIndex3==2) {
                        
                        inventory.setCash(inventory.getCash()-10);
                        dialogIndex3++;
                        progress++;
                    }
					


                }
                dialogBox.setDirection(1);
            } else {
				if(dialogIndex3==1){
					if(dialog3.get(dialogIndex3).equals("Oh. Well if the fate of the world depends on it, you can come in if you can give me $10. ")){
						dialogIndex3++;
					}else{
						dialogIndex3--;
					}
					
				}
                dialogBox.setDirection(-1);
                dialogPane.setVisible(false);
                nextDialog.setVisible(false);
                option1.setVisible(false);
                option2.setVisible(false);
                option3.setVisible(false);
            }

        }
        if (sceneChanger.getScene() == 5) {
            me.setScene(5);
            sceneChanger.drawMe(g);
            bubbles.drawMe(g, 113, 578);
            me.drawMe(g);
            inventory.drawMe(g);
            if (me.getYPosition() > 900) {
				me.setScene(4);

                sceneChanger.setScene(4);
                sceneChanger.setPosition(-1100, 0);
                me.setYPosition(375);
                me.setXPosition(645);
               

            }
            if (me.checkCollision(bubbles)) {
                bubbles.setVisible(false);
                inventory.addItem("bubbles");
            }


        }
        if (sceneChanger.getScene() == 6) {
            me.setScene(6);
            sceneChanger.drawMe(g);
            flower.get(0).drawMe(g);
            flower.get(1).drawMe(g);
            flower.get(2).drawMe(g);
            kid.drawMe(g);
            me.drawMe(g);
            dialogBox.drawMe(g, 108, 389);
            inventory.drawMe(g);
            for (int i = 0; i < flower.size(); i++) {
                if (me.checkCollision(flower.get(i))) {
                    flower.get(i).setVisible(false);
                    inventory.addItem("flower");
                }
            }

            if (me.checkCollision(kid)) {
                if(dialogBox.getFrame()==1){
					sound.playSound("sound/yay.wav");
				}
				if (dialogBox.getFinished()) {
                    dialogPane.setBounds(108, 391, 210, 116);
                    dialogPane.setText(dialog2.get(dialogIndex2));
                    dialogPane.setVisible(true);
					
                    if (dialogIndex == 0) {
                        
                        option1.setBounds(621, 240, 210, 20);
                        option2.setBounds(621, 260, 210, 20);
                        option3.setBounds(621, 280, 210, 20);

                    } else {
                        option1.setVisible(false);
                        option2.setVisible(false);
                        option3.setVisible(false);
                    }
                    if (inventory.getObject("flower", 3) && inventory.getObject("bubbles")) {
                        
						inventory.items.remove("flower");
                        inventory.items.remove("flower");
                        inventory.items.remove("flower");
                        inventory.items.remove("bubbles");
                        
                        progress++;
                    }
					if(progress>=4){
						dialogIndex2=1;
						if(!inventory.getObject("map")){
							inventory.addItem("map");
							sound.playSound("sound/quest.wav");
						}
					}
					

                }
                dialogBox.setDirection(1);
            } else {
                if (progress == 0) {
                    dialogIndex = 0;
                }
                if (progress == 1) {
                    dialogIndex = 2;
                }
                dialogBox.setDirection(-1);
                dialogPane.setVisible(false);
                nextDialog.setVisible(false);
                option1.setVisible(false);
                option2.setVisible(false);
                option3.setVisible(false);
            }
            if (me.getXPosition() > 1100) {
				me.setScene(4);
				me.setYPosition(524);
                me.setXPosition(195);
                
                sceneChanger.setPosition(0, 0);
                sceneChanger.setScene(4);

            }
			
			


        }
		if(sceneChanger.getScene()==7){
			me.setScene(7);
            sceneChanger.drawMe(g);
			coffee.drawMe(g, 754, 583);
            me.drawMe(g);
			
            inventory.drawMe(g);
            if (me.getYPosition() > 900) {
				me.setScene(4);
                me.setYPosition(375);
                me.setXPosition(500);
               
                sceneChanger.setScene(4);
				sceneChanger.setPosition(0, 0);
            }
             if (me.checkCollision(coffee)) {
                coffee.setVisible(false);
                inventory.addItem("coffee");
            }

		}
		if(sceneChanger.getScene()==8){
			me.setScene(8);
            sceneChanger.drawMe(g);
			kid2.drawMe(g);
			kid3.drawMe(g);
            me.drawMe(g);
            dialogBox.drawMe(g,660,287);
			
            inventory.drawMe(g);
			
			if (me.checkCollision(kid2)) {
                if(dialogBox.getFrame()==1){
					sound.playSound("sound/girl.wav");
				}
				if (dialogBox.getFinished()) {
                    dialogPane.setLocation(660,287);
                    dialogPane.setText(dialog4.get(dialogIndex4));
                    dialogPane.setVisible(true);

                    

                }
				if(progress==5){
					dialogIndex4=1;
				}
                dialogBox.setDirection(1);
            } else {
                
                dialogBox.setDirection(-1);
                dialogPane.setVisible(false);
                nextDialog.setVisible(false);
                option1.setVisible(false);
                option2.setVisible(false);
                option3.setVisible(false);
            }
            if (inventory.getObject("jumpRope")) {
				inventory.items.remove("jumpRope");
				sound.playSound("sound/quest.wav");
				progress++;
			}
            

		}


        //check for direction of travel
        if (sceneChanger.getScene() != 4) {
            sceneChanger.setPosition(0, 0);
            if (goingDown == true) {
                me.setYPosition(me.getYPosition() + 5);
            }
            if (goingUp == true) {
                me.setYPosition(me.getYPosition() - 5);
            }
            if (goingRight == true) {
                me.setXPosition(me.getXPosition() + 5);
            }
            if (goingLeft == true) {
                me.setXPosition(me.getXPosition() - 5);
            }
        } else {
            if (goingRight == true) {
                if (sceneChanger.getX() <= -1100) {
                    freemove = true;
                }
                if (freemove) {
                    me.setXPosition(me.getXPosition() + 5);
                    if (me.getXPosition() == 550) {
                        freemove = false;
                    }

                } else {
                    sceneChanger.setPosition(sceneChanger.getX() - 5, sceneChanger.getY());

                }



            }
            if (goingLeft == true) {
                if (sceneChanger.getX() >= 0) {
                    freemove = true;
                }
                if (freemove) {
                    me.setXPosition(me.getXPosition() - 5);
                    if (me.getXPosition() == 550) {
                        freemove = false;
                    }

                } else {
                    sceneChanger.setPosition(sceneChanger.getX() + 5, sceneChanger.getY());

                }
            }
            if (goingDown == true) {
                me.setYPosition(me.getYPosition() + 5);
            }
            if (goingUp == true) {
                me.setYPosition(me.getYPosition() - 5);
            }
        }
		g.drawString("quest:"+quest,972,20);
		if(progress==0){
			quest=1;
		}else if(progress==3){
			quest=2;
		}else if(progress==4){
			quest=3;
		}
		
		if(showMap){
			g.drawImage(map, 0,0, null);
			scrollLeft.setVisible(false);
			scrollRight.setVisible(false);
			dialogPane.setVisible(false);
			schoolButton.setVisible(true);
			parkButton.setVisible(true);
			exitMapButton.setVisible(true);
		}else if(sceneChanger.getScene()!=0 && sceneChanger.getScene()!=1){
			scrollLeft.setVisible(true);
			scrollRight.setVisible(true);
			schoolButton.setVisible(false);
			parkButton.setVisible(false);
			exitMapButton.setVisible(false);
		}
		if(win){
			for(JButton i: buttonList){
				i.setVisible(false);
			}
			dialogPane.setVisible(false);
			g.drawImage(winScreen, 0, 0, null);
		}
		
		
    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == toInstructionsButton) {
            sceneChanger.setScene(1);
            //removes all buttons but the proloque button******
            for (JButton i: buttonList) {
                if (i != toPrologueButton) {
                    i.setVisible(false);
                }
            }
            toPrologueButton.setVisible(true);
            //*******
        }
        if (e.getSource() == toPrologueButton) {
            sceneChanger.setScene(3);
            //removes all buttons but the proloque button******
            for (JButton i: buttonList) {
                
                    i.setVisible(false);
                
            }
            //toGameButton.setVisible(true);
            //*******

        }
        if (e.getSource() == toGameButton) {
            sceneChanger.setScene(3);

            //removes all buttons but the proloque button******
            for (JButton i: buttonList) {
                //if (i != toGameButton) {
                i.setVisible(false);
                //}
            }
            scrollRight.setVisible(true);
            scrollLeft.setVisible(true);

            //*******

        }

        if (e.getSource() == scrollRight) {
            inventory.setMovement(inventory.getMovement() - 85);
        }
        if (e.getSource() == scrollLeft) {
            inventory.setMovement(inventory.getMovement() + 85);
        }

        if (e.getSource() == nextDialog) {
            if (dialogIndex < dialog.size() - 1) {
                dialogIndex++;

            }

        }

        if (progress == 0) {
            if (e.getSource() == option1) {
                dialogIndex++;
                progress++;
                dialog.set(1, "Good, Well then get me a coffee. Three good deeds and I'll forget about giving you detention.");
            }
            if (e.getSource() == option2) {
                dialogIndex++;
                progress++;
                dialog.set(1, "Well, then get me a coffee. Three good deeds and I'll forget about giving you detention.");
                gameOver = true;
            }
            if (e.getSource() == option3) {
                dialogIndex++;
                progress++;
                dialog.set(1, "Sorry to hear that. Well then get me a coffee. Three good deeds and I'll forget about giving you detention.");
            }
        }else if(progress==1){
			if (e.getSource() == option1) {
                dialogIndex3++;
                
                dialog3.set(1, "Ya, nice try. This room is for teacher only. Come back when you've got a better excuse.");
            }
            if (e.getSource() == option2) {
                dialogIndex3++;
               
                dialog3.set(1, "Really? Well then come right in. Wait... No pets on school grounds.");
                gameOver = true;
            }
            if (e.getSource() == option3) {
                dialogIndex3++;
               
                dialog3.set(1, "Oh. Well if the fate of the world depends on it, you can come in if you can give me $10. ");
            }
			
		}
		if (e.getSource() == exitMapButton) {
            showMap=false;
               
        }
		if (e.getSource() == schoolButton) {
            sceneChanger.setScene(6);
			showMap=false;
        }
		if (e.getSource() == parkButton) {
            sceneChanger.setScene(8);
			showMap=false;
        }
		
		



        requestFocus();
        setFocusable(true);
    }

    //Adds buttons instead of putting them in the constructor
    public void addButtons() {
	
		
		
        toInstructionsButton = new JButton("Start");
        toInstructionsButton.setBounds(581, 421, 200, 50);
        toInstructionsButton.addActionListener(this);
        buttonList.add(toInstructionsButton);
        this.add(toInstructionsButton);
        toInstructionsButton.setVisible(true);

        toPrologueButton = new JButton("to game");
        toPrologueButton.setBounds(434, 636, 200, 100);
		toPrologueButton.setIcon(new ImageIcon("images/objects/startButton.png"));
        toPrologueButton.addActionListener(this);
        buttonList.add(toPrologueButton);
        this.add(toPrologueButton);
        toPrologueButton.setVisible(false);


        toGameButton = new JButton("toGameButton");
        toGameButton.setBounds(200, 100, 200, 30);
        toGameButton.addActionListener(this);
        buttonList.add(toGameButton);
        this.add(toGameButton);
        toGameButton.setVisible(false);

        scrollRight = new JButton("right");
        scrollRight.setBounds(771, 825, 50, 50);
        scrollRight.addActionListener(this);
        buttonList.add(scrollRight);
		scrollRight.setIcon(new ImageIcon("images/right arrow.png"));
        this.add(scrollRight);
		scrollRight.setBorder(null);
        scrollRight.setVisible(false);

        scrollLeft = new JButton("left");
        scrollLeft.setBounds(175, 825, 50, 50);
		scrollLeft.setIcon(new ImageIcon("images/left arrow.png"));
        scrollLeft.addActionListener(this);
        buttonList.add(scrollLeft);
		scrollLeft.setBorder(null);
        this.add(scrollLeft);
        scrollLeft.setVisible(false);

        nextDialog = new JButton("next");
        nextDialog.setBounds(766, 191, 58, 20);
        nextDialog.addActionListener(this);
        buttonList.add(nextDialog);
        this.add(nextDialog);
        nextDialog.setVisible(false);

        option1 = new JButton("good");
        option1.setBounds(621, 240, 210, 20);
        option1.addActionListener(this);
        option1.setBackground(Color.WHITE);
        buttonList.add(option1);
        this.add(option1);
        option1.setVisible(false);

        option2 = new JButton("neutrual");
        option2.setBounds(621, 260, 210, 20);
        option2.addActionListener(this);
        option2.setBackground(Color.WHITE);
        buttonList.add(option2);
        this.add(option2);
        option2.setVisible(false);

        option3 = new JButton("bad");
        option3.setBounds(621, 280, 210, 20);
        option3.addActionListener(this);
        option3.setBackground(Color.WHITE);
        buttonList.add(option3);
        this.add(option3);
        option3.setVisible(false);
		
		schoolButton = new JButton("schoolButton");
        schoolButton.setBounds(621, 260, 200, 200);
        schoolButton.setIcon(new ImageIcon("images/objects/school icon.png"));
        schoolButton.addActionListener(this);
        buttonList.add(schoolButton);
		schoolButton.setBorder(null);
        this.add(schoolButton);
        schoolButton.setVisible(false);

        parkButton = new JButton("parkButton");
        parkButton.setBounds(200, 280, 200, 200);
		parkButton.setIcon(new ImageIcon("images/objects/park icon.png"));
        parkButton.addActionListener(this);
        buttonList.add(parkButton);
		parkButton.setBorder(null);
        this.add(parkButton);
        parkButton.setVisible(false);
		
		exitMapButton = new JButton("exitMapButton");
        exitMapButton.setBounds(948, 83, 20, 20);
        exitMapButton.addActionListener(this);
        exitMapButton.setBackground(Color.WHITE);
        buttonList.add(exitMapButton);
        this.add(exitMapButton);
        exitMapButton.setVisible(false);
	

    }

    public void keyPressed(KeyEvent e) {



        //System.out.println("key code: " + e.getKeyCode());
        if (e.getKeyCode() == 40 || e.getKeyCode() == 83) {
            me.setMoving(true);
            goingDown = true;
            me.setKeyDirection(0);
        }
        if (e.getKeyCode() == 38 || e.getKeyCode() == 87) {
            me.setMoving(true);
            goingUp = true;
            me.setKeyDirection(3);
        }
        if (e.getKeyCode() == 39 || e.getKeyCode() == 68) {
            me.setMoving(true);
            goingRight = true;
            me.setKeyDirection(2);
        }
        if (e.getKeyCode() == 37 || e.getKeyCode() == 65) {
            me.setMoving(true);
            goingLeft = true;
            me.setKeyDirection(1);
        }
		if (e.getKeyCode() == 80) {
			if(progress<3){
				progress=3;
			}else if(progress<4){
				progress=4;
			}else if(progress>=4){
				win=true;
			}
        }




        //check for rooms





        repaint();

    }

    public void setText(String text) {

        //dialogBox.setText(text);

    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 40 || e.getKeyCode() == 83) {
            goingDown = false;

        }
        if (e.getKeyCode() == 38 || e.getKeyCode() == 87) {
            goingUp = false;
        }
        if (e.getKeyCode() == 39 || e.getKeyCode() == 68) {
            goingRight = false;
        }
        if (e.getKeyCode() == 37 || e.getKeyCode() == 65) {
            goingLeft = false;
        }

        if (goingDown == false && goingUp == false && goingRight == false && goingLeft == false) {
            me.setMoving(false);
        }
    }
    public void keyTyped(KeyEvent e) {}


    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {

        //Print location of x and y
        System.out.println("X: " + e.getX() + ", Y: " + e.getY());
		if(progress>=2 && e.getX()>=inventory.getXLocation("map") && e.getX()<=(inventory.getXLocation("map")+60) && e.getY()>=820 && e.getY()<=820+60){
			showMap=true;
		}
		

        repaint();
    }


	public void bellSound() {
 
        try {
            URL url = this.getClass().getClassLoader().getResource("sound/school bell2.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    public void animate() {
        while (true) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            counter++;
            if (counter == 5) {
                counter = 0;
            }
			
            repaint();
        }

    }
}