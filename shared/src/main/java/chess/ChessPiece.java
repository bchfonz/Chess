package chess;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private final ChessGame.TeamColor pieceColor;
    private final ChessPiece.PieceType type;
    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> legalMoves = new ArrayList<>();
        ChessPosition tempPosition = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
        ChessPosition tempPosition1 = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
        ChessPosition tempPosition2 = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
        ChessPosition tempPosition3 = new ChessPosition(myPosition.getRow(), myPosition.getColumn());
//        ChessMove newMove;
        if(board.getPiece(myPosition).type == ChessPiece.PieceType.ROOK){

        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.KNIGHT){

        }
        //Generates legal moves for Bishop
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.BISHOP){
            //TODO:Figure out how many times to loop
            //Getting out of bounds exception. Set break points. Make sure setters are working. Check values that are being used
            //Make sure the pos and neg increments work
            //Make sure logic checks out
            int pos = 1;
            int neg = -1;
            for(int i = myPosition.getColumn(); i < 8; i++) {
                if ((tempPosition.getRow() < 8) && (tempPosition.getColumn() < 8) && (tempPosition.getRow() > 0) && (tempPosition.getColumn() > 0)){
                    tempPosition.setRow(tempPosition.getRow() + pos);
                    tempPosition.setColumn(tempPosition.getColumn() + pos);
                }
                if ((tempPosition.getRow() <= 8) && (tempPosition.getColumn() <= 8) && (tempPosition.getRow() > 0) && (tempPosition.getColumn() > 0)) {

                    if (board.getPiece(tempPosition) == null) {
//                        newMove = new ChessMove(myPosition, tempPosition, PieceType.BISHOP);
                        legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition.getRow(), tempPosition.getColumn()), null));
                    } else {
                        if (board.getPiece(tempPosition).pieceColor != board.getPiece(myPosition).pieceColor) {
//                            newMove = new ChessMove(myPosition, tempPosition, PieceType.BISHOP);
                            legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition.getRow(), tempPosition.getColumn()), null));
                        }
                    }
                }
                if ((tempPosition1.getRow() < 8) && (tempPosition1.getColumn() < 8) && (tempPosition1.getRow() > 0) && (tempPosition1.getColumn() > 0)){
                    tempPosition1.setRow(tempPosition1.getRow() + pos);
                    tempPosition1.setColumn(tempPosition1.getColumn() + neg);
                }

                if ((tempPosition1.getRow() <= 8) && (tempPosition1.getColumn() <= 8) && (tempPosition1.getRow() > 0) && (tempPosition1.getColumn() > 0)) {

                    if (board.getPiece(tempPosition1) == null) {
//                        newMove = new ChessMove(myPosition, tempPosition, PieceType.BISHOP);
                        legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition1.getRow(), tempPosition1.getColumn()), null));
                    } else {
                        if (board.getPiece(tempPosition1).pieceColor != board.getPiece(myPosition).pieceColor) {
//                            newMove = new ChessMove(myPosition, tempPosition1, PieceType.BISHOP);
                            legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition1.getRow(), tempPosition1.getColumn()), null));
                        }
                    }
                }
                if ((tempPosition2.getRow() < 8) && (tempPosition2.getColumn() < 8) && (tempPosition2.getRow() > 0) && (tempPosition2.getColumn() > 0)){
                    tempPosition2.setRow(tempPosition2.getRow() + neg);
                    tempPosition2.setColumn(tempPosition2.getColumn() + pos);
                }

                if ((tempPosition2.getRow() <= 8) && (tempPosition2.getColumn() <= 8) && (tempPosition2.getRow() > 0) && (tempPosition2.getColumn() > 0)) {

                    if (board.getPiece(tempPosition2) == null) {
//                        newMove = new ChessMove(myPosition, tempPosition, PieceType.BISHOP);
                        legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition2.getRow(), tempPosition2.getColumn()), null));
                    } else {
                        if (board.getPiece(tempPosition2).pieceColor != board.getPiece(myPosition).pieceColor) {
//                            newMove = new ChessMove(myPosition, tempPosition2, PieceType.BISHOP);
                            legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition2.getRow(), tempPosition2.getColumn()), null));
                        }
                    }
                }
                if ((tempPosition3.getRow() < 8) && (tempPosition3.getColumn() < 8) && (tempPosition3.getRow() > 0) && (tempPosition3.getColumn() > 0)){
                    tempPosition3.setRow(tempPosition3.getRow() + neg);
                    tempPosition3.setColumn(tempPosition3.getColumn() + neg);
                }

                if ((tempPosition3.getRow() <= 8) && (tempPosition3.getColumn() <= 8) && (tempPosition3.getRow() > 0) && (tempPosition3.getColumn() > 0)) {

                    if (board.getPiece(tempPosition3) == null) {
//                        newMove = new ChessMove(myPosition, tempPosition, PieceType.BISHOP);
                        legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition3.getRow(), tempPosition3.getColumn()), null));
                    } else {
                        if (board.getPiece(tempPosition3).pieceColor != board.getPiece(myPosition).pieceColor) {
//                            newMove = new ChessMove(myPosition, tempPosition3, PieceType.BISHOP);
                            legalMoves.add(new ChessMove(myPosition, new ChessPosition(tempPosition3.getRow(), tempPosition3.getColumn()), null));
                        }
                    }
                }


            }
        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.QUEEN){

        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.KING){

        }
        else if(board.getPiece(myPosition).type == ChessPiece.PieceType.PAWN){

        }


        return legalMoves;
    }
}
