package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int hopDistance;
	int x;
	int y;
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
    	ellipse(400, 570, 30, 30);
    	

    }
    public void keyPressed() {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y-=2;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y+=2;
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	x+=2;
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x-=2;
            }
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
