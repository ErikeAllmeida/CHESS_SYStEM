package boardgame;

// Classe Board representa o tabuleiro do jogo, onde cada posição pode conter uma peça.
public class Board {

	// Quantidade de linhas e colunas do tabuleiro.
	private int rows;
	private int columns;

	// Matriz bidimensional para armazenar as peças no tabuleiro.
	private Piece[][] pieces;

	// Construtor que inicializa o tabuleiro com o número de linhas e colunas
	// especificado.
	public Board(int rows, int columns) {
		this.rows = rows; // Define a quantidade de linhas do tabuleiro.
		this.columns = columns; // Define a quantidade de colunas do tabuleiro.
		pieces = new Piece[rows][columns]; // Inicializa a matriz de peças de acordo com as dimensões do tabuleiro.
	}

	// Método getter para obter o número de linhas do tabuleiro.
	public int getRows() {
		return rows;
	}

	// Método setter para definir o número de linhas do tabuleiro.
	public void setRows(int rows) {
		this.rows = rows;
	}

	// Método getter para obter o número de colunas do tabuleiro.
	public int getColumns() {
		return columns;
	}

	// Método setter para definir o número de colunas do tabuleiro.
	public void setColumns(int columns) {
		this.columns = columns;
	}

	// Método que retorna a peça na posição especificada por linha e coluna.
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	// Método que retorna a peça na posição especificada por um objeto Position.
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {

		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;

	}

}
