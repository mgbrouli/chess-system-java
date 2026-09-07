package org.example.application;

import org.example.boardgame.Board;
import org.example.chess.ChessMatch;

public class Program {


    static void main() {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());


    }
}
