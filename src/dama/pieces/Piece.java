package dama.pieces;

import boardgame.Board;
import dama.Color;
import dama.DamaPiece;

public class Piece extends DamaPiece {

	public Piece(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if (getColor().equals(Color.BLACK)) {
			return "b";
		} else {
			return "w";

		}
	}
}
