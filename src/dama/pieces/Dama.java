package dama.pieces;

import boardgame.Board;
import dama.Color;
import dama.DamaPiece;

public class Dama extends DamaPiece {

	public Dama(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if (getColor().equals(Color.BLACK)) {
			return "B";
		} else {
			return "W";
		}
	}
}