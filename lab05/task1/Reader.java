public interface Reader {

    String getName();

    void takeBook(String bookTitle, Administrator administrator);

    void returnBook(String bookTitle, Administrator administrator);
}
