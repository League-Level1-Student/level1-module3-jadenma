package _06_frogger;
import processing.core.PApplet;

public class Car extends PApplet{
	
	int carX;
	int carY;
	int carSpeed;
	int carSize;
	
	public Car(int carX, int carY, int carSpeed, int carSize) {
		this.carX=carX;
		this.carY=carY;
		this.carSpeed=carSpeed;
		this.carSize=carSize;
		
	}
	public void display()
	  {
		fill(0, 255, 0);
	    rect(carX , carY,  carSize, 50);
	  }

	public void driveLeft() {
		carX-=carSpeed;
		if (carX < (0-carSize)) {
			carX = 800;
		}
	}
	public void driveRight() {
		carX+=carSpeed;
		if (carX > width) {
			carX = 0-carSize;
		}
	}
	
	
}
