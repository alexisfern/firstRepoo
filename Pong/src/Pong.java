import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Pong extends Frame {
	
	// variables for the ball
	int x = 300;
	int y = 250;
	int z = 50;
	int vx = 0;
	int vy = 0;
	int ax = 2;
	
	//variables for paddles
	int rx = 10;
	int ry = 0;
	int rw = 20;
	int rh = 100;
	int p2Ry = 0;
	int p1x = 10;
	
	int lx = 760;
	int ly = 0;
	int lw = 20;
	int lh = 100;
	int p1Vy = 0;
	int p1y = 760;
	
	
	
	//scoring variables
	int scoreP1 = 0;
	int scoreP2 = 0;
	
	
	/* paint is getting called roughly 60x per second */
	public void paint(Graphics g) {
		super.paintComponent(g);
		
	// Ball Code color
		g.setColor(new Color(176,188,152) );
		
	// set the colour
		g.setColor(new Color(178, 230, 212));
		g.fillRect( 0, 0, 800, 600);
		
		
		//drawscore on screen
		g.setColor(new Color(0, 0, 0));
		Font plainFont = new Font("Serif", Font.PLAIN, 72);
		g.setFont(plainFont);
		
		g.drawString(scoreP1 +"", 200, 100);
		g.drawString(scoreP2 +"", 400, 100);
		
		x = x + vx; //use variable for velocity in x direction
		y = y + vy; // update y position based on velocity in y direction
		
		
		
		
		if(x > 750) { //how to check that ball is roughly about to pass right side of frame
			//what property of ball should be updated and altered so ball moves in opposite direction
			vx = vx * (-1);
		}
		
		if(x < 0) {
			vx = vx * (-1) ;
		}
		
		if(y > 520) {
			vy = vy * (-1);
		}
		
		if(y < 0) {
			vy = vy * (-1);
		}
		
		if(x >= rx && x <= rx + 15   &&  y >= ry && y <= ry + 200 ){
		      vx = -vx;
		}
		
		
	
	

		
		if(x > 750) {
			scoreP1+= 1;
		}
	
		if(x < 0) {
			scoreP2 += 1;
		}
		
		
	

		
		g.setColor(new Color(0,0,0));
		
		
		//paint the pong ball
		//vx = vx + ax;
		x = x + vx;
		//x = x + 7;
		
		//inb the variables section 
		//declare and initialize variables for a ball
		//use those variables for drawing a ball
		g.fillOval(x, y, z, 50);
			
		// Drawing the paddles
		//x,y top left corner
		// width and height\
		ly = ly + p1Vy; //paddle velocity affects paddle position
		//g.fillRect(lx, ly, 25,  100); //left paddle
		
		ry = ry + p2Ry;
		
		g.fillRect(rx, ry, rw, rh);
		g.fillRect (lx, ly, lw, lh);
	}
	
	public void keyPressed(KeyEvent arg0) {
		
		//32 is space bar
		//randomize velocity values of ball after pressing space bar
		//make sure its never 0 in x or y
		//should be possible to have negative velocities
		System.out.println(arg0.getKeyCode() == 83);
		
		if (arg0.getKeyCode() == 32) {
			 vx = (int)(Math.random()*(3)+ 2);
			 vy = (int)(Math.random()*(3)+ 2);
		}
		

		System.out.println(arg0.getKeyCode());
		// 87 is w
		if (arg0.getKeyCode() == 87) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p1Vy = -10;
		}
		

		// detect S key
		if (arg0.getKeyCode() == 83) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p1Vy = 10;
			
			
			
		}
		if (arg0.getKeyCode() == 81) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p2Ry = -10;
		}
		if (arg0.getKeyCode() == 65) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p2Ry = 10;
		}
	}

	
	public void keyReleased(KeyEvent arg0) {
		// stop paddles from moving when user stops pressing keys
		if (arg0.getKeyCode() == 87) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p1Vy = 0;

		}

		if (arg0.getKeyCode() == 83) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p1Vy = 0;
		}
		
		if (arg0.getKeyCode() == 81) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p2Ry = 0;
		}
		if (arg0.getKeyCode() == 65) {// 2 equal signs checks quality
			// code between curly runs if condition is true
			p2Ry = 0;
		}
		
	}

	
	

	public void keyTyped(KeyEvent arg0) {
		
		
	}
	public static void main(String[] arg) {
		Pong p = new Pong();
		//uncoment the code above to go back to normal
		
		//Math.random() returns a random decimal in the range [0 1]
		double x = Math.random();
		
		// what if i want a # betweeen 0 and 10
		int x2 = (int)( x * 10); // (int) -> explicity casting a non integer value as an int
		
		//System.out.println(5/2);// implicit castingis when its done automatically
		
		
		System.out.println(x2);
		// (int)(Math.random()*12);
		//whats the max # that can be produced? 
		//whats the min # that can be produced?
		//min: 0
		//max: 11 
		
		
		// want random # between 0 and 39
		// line of code to generate this range: 
		//int z = (int)(Math.random()*40)
		
		
		// (int)(math.random()*(range+1)) + min
		// {2 and 7}
		//int(Math.random()*(6)+2
		// max
		
		
		
		
		
		
		
	}
	
}
