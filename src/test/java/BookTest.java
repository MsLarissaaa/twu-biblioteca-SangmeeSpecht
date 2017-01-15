import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BookTest {
    private PrintStream printStream;
    private ColumnFormatter columnFormatter;
    private Book book;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        columnFormatter = mock(ColumnFormatter.class);
        book = new Book("Harry Potter", "JK Rowling", "1995", printStream, columnFormatter);
    }

    @Test
    public void shouldGenerateFormattedBookInfo() {
        book.displayInformation();

        verify(columnFormatter).formatColumns("Harry Potter", "JK Rowling", "1995");
    }

    @Test
    public void shouldPrintBookInfo() {
        when(columnFormatter.formatColumns("Harry Potter", "JK Rowling", "1995")).thenReturn("formatted text");
        book.displayInformation();
        verify(printStream).println("formatted text");
    }

}