package Chess;

public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }


    @Override
    public String getColor() {
        return color;
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessboard, int line, int column, int toLine, int toColumn) {

        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }


        if (line == toLine && column == toColumn) {
            return false;
        }


        int deltaX = Math.abs(toLine - line);
        int deltaY = Math.abs(toColumn - column);

        return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
    }


    @Override
    public String getSymbol() {
        return "H";
    }
}