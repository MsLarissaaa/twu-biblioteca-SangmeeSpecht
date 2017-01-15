
public class ColumnFormatter {

    public String formatColumns(String title, String author, String year) {
        String recordRow = String.format("%-50s", title);
        recordRow += String.format("%-25s", author);
        recordRow += year;
        recordRow += "\n";
        return recordRow;
    }
}
