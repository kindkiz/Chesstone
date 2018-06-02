package pieces;

import java.util.ArrayList;

import chess.Board_1;
import chess.ChessPieceSprite;
import chess.ChessPieceSprite.ChessPieceSpriteType;

public class Rook extends Piece {

	public Rook(int col) {
		color = col;
		name = ROOK;
<<<<<<< HEAD

		if (color == BLACK || color == WHITE)
			team = 1;
		else
			team = 2;

		BufferedImage img = null;

		switch (team) {
		case (BLACK):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_ROOK);
			break;
		case (RED):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_ROOK);
			break;
		case (GREEN):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_ROOK);
			break;
		case (WHITE):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_ROOK);
			break;
		}
		icon = new ImageIcon(img);
=======
		
		if(color == BLACK || color == WHITE) 	team = 1;
		else 									team = 2;
		
		switch(color)
		{
		case(BLACK):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK);
			break;
		case(RED):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.RED_LOOK);
			break;
		case(GREEN):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_LOOK);
			break;
		case(WHITE):
			img = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK);
			break;
		}
>>>>>>> f230e60bf6960d400b88f7b5598bd2eaa9c95e55
	}

	public ArrayList<Position> getMovement(Board_1 board_1, Position now) {
		int x = now.getX();
		int y = now.getY();

		// different in 4 people
		final int MAX = 8;

		ArrayList<Position> go = new ArrayList<Position>();

		for (int i = 1; x + i < MAX; i++) {
			int goX = x + i;
			int goY = y;
<<<<<<< HEAD

			if (board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));

			else {
				if (board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));
=======
			
			if(board_1.getPiece(goX, goY) == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.getPiece(goX, goY).team != team)
					go.add(new Position(goX, goY));			
>>>>>>> f230e60bf6960d400b88f7b5598bd2eaa9c95e55
				break;
			}
		}

		for (int i = 1; x - i >= 0; i++) {
			int goX = x - i;
			int goY = y;
<<<<<<< HEAD

			if (board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));

			else {
				if (board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));
=======
			
			if(board_1.getPiece(goX, goY) == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.getPiece(goX, goY).team != team)
					go.add(new Position(goX, goY));			
>>>>>>> f230e60bf6960d400b88f7b5598bd2eaa9c95e55
				break;
			}
		}

		for (int i = 1; y + i < MAX; i++) {
			int goX = x;
			int goY = y + i;
<<<<<<< HEAD

			if (board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));

			else {
				if (board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));
=======
			
			if(board_1.getPiece(goX, goY) == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.getPiece(goX, goY).team != team)
					go.add(new Position(goX, goY));			
>>>>>>> f230e60bf6960d400b88f7b5598bd2eaa9c95e55
				break;
			}
		}

		for (int i = 1; y - i >= 0; i++) {
			int goX = x;
			int goY = y - i;
<<<<<<< HEAD

			if (board_1.board[goX][goY] == null)
				go.add(new Position(goX, goY));

			else {
				if (board_1.board[goX][goY].team != team)
					go.add(new Position(goX, goY));
=======
			
			if(board_1.getPiece(goX, goY) == null)
				go.add(new Position(goX, goY));
			
			else
			{
				if(board_1.getPiece(goX, goY).team != team)
					go.add(new Position(goX, goY));			
>>>>>>> f230e60bf6960d400b88f7b5598bd2eaa9c95e55
				break;
			}
		}

		return go;
	}

}
