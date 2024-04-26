package dama;

import boardgame.Board;
import boardgame.Pieces;

public class DamaPiece extends Pieces{
	private Color color;

	public DamaPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
