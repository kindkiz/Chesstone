package pieces;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import chess.Board_1;
import chess.ChessPieceSprite;
import chess.ChessPieceSprite.ChessPieceSpriteType;

public class Pawn extends Piece{

	public Pawn(int team){
		color = team;
		name = PAWN;
		
		BufferedImage img = null;
		
		switch(team)
		{
		case(BLACK):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN);
			break;
		case(RED):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_PAWN);
			break;
		case(GREEN):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_PAWN);
			break;
		case(WHITE):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN);
			break;
		}
        icon = new ImageIcon(img);        
	}

	public ArrayList<Position> getMovement(Board_1 board, Position now) {
		int x = now.getX();
		int y = now.getY();
		
		ArrayList<Position> go = new ArrayList<Position>();
		
		
		
		return null;
	}


}
