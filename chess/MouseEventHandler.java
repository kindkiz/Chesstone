package chess;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class MouseEventHandler implements MouseListener{
	Board_1 board;
	GameFrame_1vs1 gameFrame1;
	public MouseEventHandler(Board_1 board, GameFrame_1vs1 gameFrame) {
		this.board = board;
		this.gameFrame1 = gameFrame;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
