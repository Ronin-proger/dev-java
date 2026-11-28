public class SupplierReader implements Supplier, Reader {

    private String name;

    public SupplierReader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void bringBook(String bookTitle, Librarian librarian) {
        System.out.println("Поставщик " + name + " принес книгу \"" + bookTitle
                + "\" для библиотекаря " + librarian.getName());
    }

    public void takeBook(String bookTitle, Administrator administrator) {
        System.out.println("Поставщик-читатель " + name + " берет книгу \"" + bookTitle
                + "\" у администратора " + administrator.getName());
        administrator.findAndGiveBook(bookTitle, this);
    }

    public void returnBook(String bookTitle, Administrator administrator) {
        System.out.println("Поставщик-читатель " + name + " возвращает книгу \"" + bookTitle
                + "\" администратору " + administrator.getName());
    }
}
