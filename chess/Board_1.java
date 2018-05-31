package chess;

import pieces.Piece;
import pieces.Position;

public class Board_1 {

	// 20180531 RedJen Initialized

	public Piece[][] board = new Piece[8][8];
	public int turn;
	public boolean p1_catchable[][] = new boolean[8][8];
	public boolean p2_catchable[][] = new boolean[8][8];

	void Move(Position PiecePosition, Position dest) {
		Position tempPosition = null;
		
	}

	Piece getPiece(int PieceX, int PieceY) {
		Piece resultPiece = null; //Board haven't enough info yet
		return resultPiece;
	}
}
