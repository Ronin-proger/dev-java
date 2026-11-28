public class Main {

    public static void main(String[] args) {
        LibrarianAdmin vasya = new LibrarianAdmin("Вася");
        SupplierReader petya = new SupplierReader("Петя");
        ReaderUser masha = new ReaderUser("Маша");

        vasya.orderBook("Игра престолов", petya);
        masha.takeBook("Война и мир", vasya);
        vasya.overdueNotification(masha);
        petya.takeBook("Мастер и Маргарита", vasya);
        masha.returnBook("Война и мир", vasya);
    }
}
