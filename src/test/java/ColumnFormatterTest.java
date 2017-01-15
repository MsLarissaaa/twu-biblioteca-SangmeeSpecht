import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class ColumnFormatterTest {
    @Test
    public void shouldReturnBookInfoAsString() {
        String bookTitle = "Harry Potter and the Goblet of Fire";
        String author = "JK Rowling";
        String yearPublished = "2000";
        ColumnFormatter columnFormatter = new ColumnFormatter();

        String result = columnFormatter.formatColumns(bookTitle, author, yearPublished);
        String formattedBookInfo = String.format("%-50s%-25s%s\n", bookTitle, author, yearPublished);

        assertThat(result, is(formattedBookInfo));
    }
}