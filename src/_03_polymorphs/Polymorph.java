package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
  
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    int getX() {
    	return x;
    }
    int getY() {
    	return y;
    }
    
    void setX(int a) {
    	x = a;
    }
    void setY(int a) {
    	y = a;
    }
 
}
