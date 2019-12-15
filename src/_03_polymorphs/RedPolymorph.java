package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{
	int width;
	int height;
	
	RedPolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
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
