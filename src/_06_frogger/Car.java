package _06_frogger;
import processing.core.PApplet;

public class Car {
	
	int carX;
	int carY;
	int carSpeed;
	int carSize;
	PApplet processing;
	
	public Car(int carX, int carY, int carSpeed, int carSize, PApplet processing) {
		this.carX=carX;
		this.carY=carY;
		this.carSpeed=carSpeed;
		this.carSize=carSize;
		this.processing = processing;
		
	}
	public void display()
	  {
		processing.fill(255, 0, 0);
	    processing.rect(carX , carY,  carSize, 50);
	  }

	public void driveLeft() {
		carX-=carSpeed;
		if (carX < (0-carSize)) {
			carX = 800;
		}
	}
	public void driveRight() {
		carX+=carSpeed;
		if (carX > processing.width) {
			carX = 0-carSize;
		}
	}
	
	public int getX() {
		return carX;
	}
	public int getY() {
		return carY;
	}
	public int getSize() {
		return carSize;
	}
	
	
}
