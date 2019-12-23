package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList <Polymorph> Dolydorph= new ArrayList <Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 Dolydorph.add(new MovingMorph(50, 50));
   	 Dolydorph.add(new BluePolymorph(50, 50));
   	 Dolydorph.add(new RedPolymorph(100, 100));
   	 ((BluePolymorph) Dolydorph.get(1)).setWidth(50);
   	 ((BluePolymorph) Dolydorph.get(1)).setHeight(50);
   	 ((RedPolymorph) Dolydorph.get(2)).setWidth(50);
   	 ((RedPolymorph) Dolydorph.get(2)).setHeight(50);
   	 ((MovingMorph) Dolydorph.get(0)).setWidth(50);
  	 ((MovingMorph) Dolydorph.get(0)).setHeight(50);
  	
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
	   	 g.setColor(Color.LIGHT_GRAY);
	   	 g.fillRect(0, 0, 500, 500);
	   	
	   	 //draw polymorph
	   	 for (Polymorph polymorph : Dolydorph) {
			polymorph.draw(g);
			polymorph.update();
		}

    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
