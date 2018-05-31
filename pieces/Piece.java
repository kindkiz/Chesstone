package pieces;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import chess.Board_1;
import chess.ConstDef;

public abstract class Piece implements ConstDef{
	protected int color;
	protected int name;
	protected ImageIcon icon;
	
	public int getColor() { return color; }
	public int getName() { return name; }
	public ImageIcon getIcon() { return icon; }
	
	abstract public ArrayList<Position> getMovement(Board_1 board, Position now);
}
