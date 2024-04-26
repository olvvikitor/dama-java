package boardgame;

import boardgame.exceptions.BoardException;
import dama.DamaPiece;

public class Board {

	private int rows;
	private int columns;

	private Pieces[][] pieces;

	public Board(int rows, int columns) {
		if (rows < 8 && columns < 8) {
			throw new BoardException("Valor minimo de linhas e colunas para comecar um jogo: 8 linhas e 8 colunas");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Pieces piece(int row, int colunm) {
		return pieces[row][colunm];
	}

	public Pieces piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(DamaPiece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça nesta posicao " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição nao localizada no tabuleiro");
		}
		return piece(position) != null;
	}

}
