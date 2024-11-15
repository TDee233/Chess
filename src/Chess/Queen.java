package Chess;

public class Queen extends ChessPiece{

    public Queen (String color){
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

        return (line == toLine || column == toColumn || Math.abs(line - toLine) == Math.abs(column - toColumn));
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
