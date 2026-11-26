public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book onegin = new Book("Евгений Онегин", 240, 1833, pushkin);
        Book war = new Book("Война и мир", 1225, 1869, tolstoy);

        System.out.println(onegin);
        System.out.println(war);

        if (war.isThickerThan(onegin)) {
            System.out.println(war.getTitle() + " толще, чем " + onegin.getTitle());
        }

        User user1 = new User("brad@pitt.com", "Брэд", "Питт");
        User user2 = new User("leo@dicaprio.com", "Леонардо", "ДиКаприо");
        User user3 = new User("keanu@reeves.com", "Киану", "Ривз");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("Сейчас онлайн: " + User.totalOnline);
    }
}
