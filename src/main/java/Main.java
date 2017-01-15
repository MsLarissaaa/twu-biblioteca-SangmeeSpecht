import java.io.PrintStream;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        ColumnFormatter columnFormatter = new ColumnFormatter();
        Book bookOne = new Book("Harry Potter", "Jk", "1999", printStream, columnFormatter);
        Book bookTwo = new Book("The Hobbit", "JRR", "1965", printStream, columnFormatter);
        ArrayList<Book> bookList = new ArrayList();
        bookList.add(bookOne);
        bookList.add(bookTwo);

        Welcome welcome = new Welcome(printStream);
        Library library = new Library(bookList);

        Application application = new Application(welcome, library);
        application.start();
    }
}
