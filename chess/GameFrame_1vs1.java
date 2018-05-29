package chess;

import javax.swing.JFrame;

public class GameFrame_1vs1 {
	final int width = 600;
	final int height = 600;
	JFrame gameFrame;
	
	public GameFrame_1vs1(){
		gameFrame = new JFrame("Chess - 1vs1");
		gameFrame.setSize(width, height);
		gameFrame.setLocationRelativeTo(null);
		
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
	}
	
}
