package dama;

import boardgame.Board;
import boardgame.Position;
import dama.pieces.Dama;
import dama.pieces.Piece;

public class DamaMatch {
	
	private Board board;

	public DamaMatch() {
		
		board = new Board(8, 8);
		initialSetup();
	}
	
	public DamaPiece[][] getPieces(){
		DamaPiece[][] mat = new DamaPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for(int j = 0 ; j < board.getColumns(); j++) {
				mat[i][j] = (DamaPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void initialSetup() {
		board.placePiece(new Piece(board, Color.BLACK), new Position(1, 0));
		board.placePiece(new Piece(board, Color.BLACK), new Position(2, 0));
		board.placePiece(new Piece(board, Color.BLACK), new Position(3, 0));
	}
	
}
