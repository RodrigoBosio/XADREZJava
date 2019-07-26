/*@Author Rodrigo Bosio
 *@since July-2019*/
package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
