package pieces;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import chess.Board_1;
import chess.ChessPieceSprite;
import chess.ChessPieceSprite.ChessPieceSpriteType;

public class Bishop extends Piece {

	public Bishop(int team){
		color = team;
		name = BISHOP;
		
		BufferedImage img = null;
		
		switch(team)
		{
		case(BLACK):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP);
			break;
		case(RED):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_BISHOP);
			break;
		case(GREEN):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_BISHOP);
			break;
		case(WHITE):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP);
			break;
		}
        icon = new ImageIcon(img);        
	}
	
	public ArrayList<Position> getMovement(Board_1 board, Position now) {
		// TODO Auto-generated method stub
		return null;
	}

}
