package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int hopDistance;
	int x = 400;
	int y = 570;
	Car car1 = new Car(400, 300, 50, 50);
	Car car2 = new Car(600, 100, 30, 65);
	Car car3 = new Car(200, 400, 40, 40);
	Car car4 = new Car(50, 500, 50, 55);
	Car car5 = new Car(750, 200, 35, 45);
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
    	if (x > 815) {
    		x = 814;
    	}
    	if (x < -15) {
    		x = -14;
    	}
    	if (y > 615) {
    		y = 614;
    	}
    	if (y < -15) {
    		y = -14;
    	}
    }
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
