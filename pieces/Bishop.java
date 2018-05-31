package pieces;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import chess.Board_1;
import chess.ChessPieceSprite;
import chess.ChessPieceSprite.ChessPieceSpriteType;

public class Bishop extends Piece {

	public Bishop(int col){
		color = team;
		name = BISHOP;
		
		if(color == BLACK || color == WHITE) 	team = 1;
		else 									team = 2;
		
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
	
	public ArrayList<Position> getMovement(Board_1 board_1, Position now) {
		
		int x = now.getX();
		int y = now.getY();
		final int MAX = 8;
		
		ArrayList<Position> go = new ArrayList<Position>();
		
		for(int i = 1, j = 1; i < MAX && j < MAX; i++, j++)
		{
			int goX = x + i;
			int goY = y + j;
			
			if(board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));			
				break;
			}
		}
		
		for(int i = 1, j = 1; i < MAX && j >= 0; i++, j--)
		{
			int goX = x + i;
			int goY = y - j;
			
			if(board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));			
				break;
			}
		}
		
		for(int i = 1, j = 1; i >= 0 && j < MAX; i--, j++)
		{
			int goX = x - i;
			int goY = y + j;
			
			if(board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));			
				break;
			}
		}
		
		for(int i = 1, j = 1; i >= 0 && j >= 0; i--, j--)
		{
			int goX = x - i;
			int goY = y - j;
			
			if(board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));			
				break;
			}
		}
		
		return go;
	}

}
