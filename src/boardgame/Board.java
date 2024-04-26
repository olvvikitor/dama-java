package boardgame;

import dama.DamaPiece;

public class Board {
	
	private int rows;
	private int columns;
	
	private Pieces[][] pieces;

	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Pieces piece(int row, int colunm) {
		return pieces[row][colunm];
	}
	public Pieces piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(DamaPiece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	

	

}
