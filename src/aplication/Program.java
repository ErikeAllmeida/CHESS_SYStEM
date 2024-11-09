package aplication;
//@Autor_ErikeAllmeida

import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
	
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard (chessMatch.getPieces());
		
		
	}
}
