public class LocatorImpl implements Locator {
    private final int targetRow;
    private final int targetCol;
    private final int minRow;
    private final int maxRow;
    private final int minCol;
    private final int maxCol;

    public LocatorImpl(int minRow, int maxRow, int minCol, int maxCol, int targetRow, int targetCol) {
        this.minRow = minRow;
        this.maxRow = maxRow;
        this.minCol = minCol;
        this.maxCol = maxCol;
        this.targetRow = targetRow;
        this.targetCol = targetCol;
    }

    @Override
    public int maxRow() {
        return maxRow;
    }

    @Override
    public int minRow() {
        return minRow;
    }

    @Override
    public int maxCol() {
        return maxCol;
    }

    @Override
    public int minCol() {
        return minCol;
    }

    @Override
    public void here(Position2D position) throws ColumnToHighException, ColumnToLowException, RowToHighException, RowToLowException {
        if (position.row() > targetRow) {
            throw new RowToHighException();
        }
        if (position.row() < targetRow) {
            throw new RowToLowException();
        }
        if (position.col() > targetCol) {
            throw new ColumnToHighException();
        }
        if (position.col() < targetCol) {
            throw new ColumnToLowException();
        }
        // Znaleziono poprawną pozycję – brak wyjątku
    }
}
