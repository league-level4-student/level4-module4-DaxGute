package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	int width;
	int height;
	CircleMorph(int x, int y) {
		super(x, y);

	}
	 public void update(){
	   	 double degrees = Math.atan(y/(x + 0.01));
	   	 double distance = Math.sqrt((y^2) + (x^2));
	   	 x = (int)((Math.cos(degrees + 1)) * distance);
	   	 y = (int)((Math.sin(degrees + 1)) * distance);
	 }
	 public void draw(Graphics g) {
			g.setColor(Color.black);
			g.fillRect(x, y, width, height);
	}
	int getWidth() {
		return width;
	}
    int getHeight() {
    	return height;
    }
    
    void setWidth(int a) {
    	width = a;
    }
    void setHeight(int a) {
    	height = a;
    }
}
