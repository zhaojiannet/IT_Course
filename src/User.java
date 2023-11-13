import java.util.List;

public interface User {
    void login();
    void searchBooks(String criteria, List<Book> books);
    void displayBookList(List<Book> books);

}
