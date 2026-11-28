public class ReaderUser implements Reader {

    private String name;

    public ReaderUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeBook(String bookTitle, Administrator administrator) {
        System.out.println("Читатель " + name + " берет книгу \"" + bookTitle
                + "\" у администратора " + administrator.getName());
        administrator.findAndGiveBook(bookTitle, this);
    }

    public void returnBook(String bookTitle, Administrator administrator) {
        System.out.println("Читатель " + name + " возвращает книгу \"" + bookTitle
                + "\" администратору " + administrator.getName());
    }
}
