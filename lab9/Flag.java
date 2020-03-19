import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Flag extends JFrame{
	public Flag() {
		setTitle("Flag");
		setVisible(true);
		setSize(750,750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		super.paint(g);
		
//		border of the flag
		
		g.setColor(new Color(0, 56, 147));
		int[] xPoints0 = {50,50,540,250,545};
		int[] yPoints0 = {40,670,670,381,381};
		g.fillPolygon(xPoints0, yPoints0, 5);

//		red color portion of flag
		int[] xPoints = {60,60,510,220,510};
		int[] yPoints = {60,660,660,371,371};
		g.setColor(new Color(220, 20, 60));
		g.fillPolygon(xPoints,yPoints,5);

//		Sun of the flag
		g.setColor(new Color(255,255,255));
		g.fillArc(172-56,515-56, 112, 112, 0, 360);
		
//		Moon of the flag
		g.fillArc(172-95, 240-95, 190, 190,0,-180);
		g.setColor(new Color(220, 20, 60));
		g.fillArc(172-95, 215-95, 190, 190,0,-180);
		g.setColor(Color.WHITE);
		g.fillArc(172-56, 311-56, 112, 112, 0, 180);
		
//		Guide Lines
	/*
		g.setColor(Color.GREEN);
		g.drawLine(60, 210,510 , 660);
		g.drawLine(77,0,77,1000);
		g.drawLine(0, 255, 1000, 255);
		g.drawLine(267, 0, 267, 1000);
		g.drawLine(172, 0, 172, 1000);
		g.drawLine(60, 215, 510, 371);
		g.drawLine(0, 515, 1000, 515);
		g.drawLine(0, 215, 1000, 215);
		g.drawLine(116, 0, 116, 1000);
		g.drawArc(172-95, 240-95, 190, 190,0,360);
		g.drawArc(172-95, 215-95, 190, 190,0,360);
		g.drawArc(172-56, 311-56, 112, 112,0,360);
		g.drawArc(172-95, 515-95, 190, 190,0,360);
	*/
	}
	public static void main(String[] args) {
		Flag flag = new Flag();
		flag.repaint();
	}
}