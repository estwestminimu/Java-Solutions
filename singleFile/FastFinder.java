public class FastFinder implements FindSth {


    @Override
    public Position2D tryToFind(Locator locator) {
        int maxCol = locator.maxCol();
        int maxRow = locator.maxRow();
        int minCol = locator.minCol();
        int minRow = locator.minRow();

        int midRow = ((maxRow - minRow) / 2) + minRow;
        int midCol = ((maxCol - minCol) / 2) + minCol;

        while (minRow <= maxRow && minCol <= maxCol) {
            try {
                locator.here(new Position2D(midCol, midRow));
                return new Position2D(midCol, midRow);
            } catch (Locator.RowToHighException error) {
                maxRow--;
                midRow = ((maxRow - minRow) / 2) + minRow;
            } catch (Locator.ColumnToHighException error) {
                maxCol--;
                midCol = ((maxCol - minCol) / 2) + minCol;
            } catch (Locator.ColumnToLowException error) {
                minCol++;
                midCol = ((maxCol - minCol) / 2) + minCol;
            } catch (Locator.RowToLowException error) {
                minRow++;
                midRow = ((maxRow - minRow) / 2) + minRow;
            }
        }
        return null;
    }
}