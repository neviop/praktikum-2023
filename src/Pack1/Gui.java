package Pack1;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {
 
JFrame jf;
Zeichnen zeichnen;
static JButton btn[]= new JButton[9]; /* Erstellung der Spielfelder*/
 
	public Gui() {
		jf = new JFrame(); 
		jf.setSize(800,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setTitle("Game");
		
		for(int i=0;i<btn.length;i++) {
		 btn[i]= new JButton();
		 btn[i].setVisible(true);
		btn[i].addActionListener(new Eingabe() );
		btn[i].setFocusPainted(false);
		btn[i].setContentAreaFilled(false);
		btn[i].setBorder(null);
		jf.add(btn[i]);
		}
		
		zeichnen = new Zeichnen();
		zeichnen.setBounds(0,0,800,900);
		zeichnen.setVisible(true);
		jf.add(zeichnen);
		jf.setVisible(true);
	}

}
