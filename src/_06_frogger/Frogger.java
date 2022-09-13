package _06_frogger;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int hopDistance;
	int x = 400;
	int y = 580;
	Car car1 = new Car(400, 300, 10, 100, this);
	Car car2 = new Car(600, 100, 10, 100, this);
	Car car3 = new Car(200, 400, 10, 100, this);
	Car car4 = new Car(50, 500, 10, 100, this);
	Car car5 = new Car(750, 200, 10, 100, this);
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }
    
    @Override
    public void draw() {
    	background(0, 0, 255);
    	fill(150, 150, 150);
    	noStroke();
    	rect(0, 560, 800, 40);
    	rect(0, 0, 800, 40);
    	fill(0, 255, 0);
    	ellipse(x, y, 30, 30);
    	keepInCanvas();
    	car1.driveLeft();
    	car2.driveRight();
    	car3.driveLeft();
    	car4.driveRight();
    	car5.driveLeft();
    	car1.display();
    	car2.display();
    	car3.display();
    	car4.display();
    	car5.display();
    	if (intersects(car1) == true) {
    		x = 400;
    		y = 580;
    	}
    	if (intersects(car2) == true) {
    		x = 400;
    		y = 580;
    	}
    	if (intersects(car3) == true) {
    		x = 400;
    		y = 580;
    	}
    	if (intersects(car4) == true) {
    		x = 400;
    		y = 580;
    	}
    	if (intersects(car5) == true) {
    		x = 400;
    		y = 580;
    	}
    	if (y < 25) {
    		JOptionPane.showMessageDialog(null, "You Win!");
    		System.exit(0);
    	}
    	
    }
    boolean intersects(Car car) {
		 if ((y+15 > car.getY() && y-15 < car.getY()+50) &&
		                (x+15 > car.getX() && x-15 < car.getX()+car.getSize())) {
		   return true;
		  }
		 else  {
		  return false;
		 }
	}
    
    public void keyPressed() {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y-=5;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y+=5;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	x+=5;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x-=5;
            }
        }
    }
    public void keepInCanvas() {
    	if (x > 810) {
    		x = 810;
    	}
    	if (x < -10) {
    		x = -10;
    	}
    	if (y > 610) {
    		y = 610;
    	}
    	if (y < -10) {
    		y = -10;
    	}
    }
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
