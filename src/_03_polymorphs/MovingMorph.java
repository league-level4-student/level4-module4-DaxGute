package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	int width;
	int height;
	MovingMorph(int x, int y) {
		super(x, y);

	}
	 public void update(){
	   	 x ++;
	   	 y ++;
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
