package chess;

public class Checker {
	
	public boolean isChecked(Board_1 board)
	{
		//find king position
		int WKingX=0,WKingY=0;	//player1
		int BKingX=0,BKingY=0;	//player2
		
		for(int X = 0;X < 8; X++)
		{
			for(int Y=0;Y < 8; Y++)
			{
				if((board.getPiece(X, Y).getName() == 1) && board.getPiece(X, Y).getColor() == 1)
				{
					WKingX = X;
					WKingY = Y;
				}
				else if((board.getPiece(X, Y).getName() == 1) && board.getPiece(X, Y).getColor() == 3)
				{
					BKingX = X;
					BKingY = Y;
				}
			}
		}
		//done
		if(board.p2_catchable[WKingX][WKingY]) {return true;}
		if(board.p1_catchable[BKingX][BKingY]) {return true;}
		
		return false;
	}
	
	public boolean isChecked(Board_2 board) {
		//find king position
		
		return false;
	}
	
	public boolean isCheckMate(Board_1 board) {
		if(!isChecked(board)) {return false;}
		else
		{
			//find king position
			int WKingX=0,WKingY=0;	//player1
			int BKingX=0,BKingY=0;	//player2
			
			for(int X = 0;X < 8; X++)
			{
				for(int Y=0;Y < 8; Y++)
				{
					if((board.getPiece(X, Y).getName() == 1) && board.getPiece(X, Y).getColor() == 1)
					{
						WKingX = X;
						WKingY = Y;
					}
					else if((board.getPiece(X, Y).getName() == 1) && board.getPiece(X, Y).getColor() == 3)
					{
						BKingX = X;
						BKingY = Y;
					}
				}
			}
			//done
			//king을 둘러싼 8칸이 모두 아군이거나 catchable 이면 checkMate
			
			
		}
		return false;
	}
	
	public boolean isCheckMate(Board_2 board) {
		if(!isChecked(board)) {return false;}
	
		return false;
	}
	
	public boolean isStaleMate(Board_1 board) {
		if(isChecked(board)) {return false;}
		
		return false;
	}
	
	public boolean isStaleMate(Board_2 board) {
		if(isChecked(board)) {return false;}
		
		return false;
	}
}
