package Chess;

public class King extends ChessPiece{

    public King (String color){
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

        return (Math.abs(line - toLine) <= 1 && Math.abs(column - toColumn) <= 1);
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;

                int newLine = line + i;
                int newColumn = column + j;


                if (newLine >= 0 && newLine < 8 && newColumn >= 0 && newColumn < 8) {
                    ChessPiece piece = board.getPiece(newLine, newColumn);
                    if (piece != null && !piece.getColor().equals(this.color)) {

                        return true;
                    }
                }
            }
        }
        return false;
    }

}
