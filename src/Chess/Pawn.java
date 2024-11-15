package Chess;

public class Pawn extends ChessPiece {

    public Pawn (String color){
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

        // Проверка, что пешка не пытается двигаться на то же место
        if (line == toLine && column == toColumn) {
            return false;
        }

        // Логика движения пешки
        if (color.equals("White")) {
            // Белая пешка может двигаться на 1 или 2 поля вперед с начальной позиции
            if (column == toColumn) {
                if (line == 1 && toLine == line + 2) {
                    return true; // Двойной ход с начальной позиции
                }
                return toLine == line + 1; // Обычный ход на 1 поле вперед
            }
        } else if (color.equals("Black")) {
            // Черная пешка может двигаться на 1 или 2 поля вперед с начальной позиции
            if (column == toColumn) {
                if (line == 6 && toLine == line - 2) {
                    return true; // Двойной ход с начальной позиции
                }
                return toLine == line - 1; // Обычный ход на 1 поле вперед
            }
        }

        return false; // Не соответствует правилам движения
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
