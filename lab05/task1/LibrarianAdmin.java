public class LibrarianAdmin implements Librarian, Administrator {

    private String name;

    public LibrarianAdmin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void orderBook(String bookTitle, Supplier supplier) {
        System.out.println("Библиотекарь " + name + " заказал у поставщика "
                + supplier.getName() + " книгу \"" + bookTitle + "\"");
        supplier.bringBook(bookTitle, this);
    }

    public void findAndGiveBook(String bookTitle, Reader reader) {
        System.out.println("Администратор " + name + " нашел и выдал книгу \""
                + bookTitle + "\" читателю " + reader.getName());
    }

    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " уведомляет читателя "
                + reader.getName() + " о просрочке возврата");
    }
}
