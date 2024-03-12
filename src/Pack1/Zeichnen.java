package Pack1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Zeichnen extends JLabel {
	
	
private static final long serialVersionUID = 1L;
	
	protected void paintComponent (Graphics g) {
		System.out.println("as");
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Ab hier wird Gezeichnet//
		g.setColor(Color.BLUE);
		
		//Quer//
		g.drawLine(325, 50,325 , 500);
		g.drawLine(475, 50, 475, 500);
		
		//hoch//
		g.drawLine(175, 200, 625, 200);
		g.drawLine(175, 350, 625, 350);
	
	}

}
