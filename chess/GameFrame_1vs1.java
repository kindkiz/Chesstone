package chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import chess.ChessPieceSprite.ChessPieceSpriteType;

public class GameFrame_1vs1 extends JPanel {
	final int width = 600;
	final int height = 600;
	JFrame gameFrame;
	Board_1 board;
	JButton[][] square;

	public GameFrame_1vs1(Board_1 board) {
		this.board = board;

		gameFrame = new JFrame("Chess - 1vs1");
		gameFrame.setSize(width, height);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setLayout(new BorderLayout());

		JPanel chessBoard = new JPanel();
		chessBoard.setLayout(new GridLayout(8, 8));

		JButton square[][] = new JButton[8][8];
		boolean painter = false;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				square[i][j] = new JButton();
				if (painter) {
					square[i][j].setBackground(Color.ORANGE);
					painter = false;
				} else {
					square[i][j].setBackground(Color.YELLOW);
					painter = true;
				}
				chessBoard.add(square[i][j]);
			}
			painter = painter ? false : true;
		}
		gameFrame.add(chessBoard, BorderLayout.CENTER);

		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImagePanel imgPan = new ImagePanel();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				imgPan.setImage(board.getPiece(i, j).getImg());
				square[i][j].add(imgPan);
			}
		}
	}

}
