public class Book {

    private String title;
    private int pages;
    private int year;
    private Author author;

    public Book(String title, int pages, int year, Author author) {
        this.title = title;
        this.pages = pages;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isThickerThan(Book other) {
        return this.pages > other.pages;
    }

    public String toString() {
        return "title=" + title
                + ", pages=" + pages
                + ", year=" + year
                + ", author=" + author;
    }
}
