class Author {
    String name;

    Author(String name) {
        this.name = name;
    }
    void displayAuthor() {
        System.out.println("Author: " + name);
    }
}
class Book {
    String title;
    Author author;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
    void displayBook() {
        System.out.println("Book Title: " + title);
        author.displayAuthor();
    }
}
class Library {
    String libraryName;
    Book book1;
    Book book2;

    Library(String libraryName, Book book1, Book book2) {
        this.libraryName = libraryName;
        this.book1 = book1;
        this.book2 = book2;
    }
    void displayLibrary() {
        System.out.println("Library: " + libraryName);

        book1.displayBook();
        System.out.println();

        book2.displayBook();
    }
}
public class MainLibrary {
    public static void main(String[] args) {   
        Author a1 = new Author("James Gosuling");
        Author a2 = new Author("Dennis rich");
        Book b1 = new Book("Java", a1);
        Book b2 = new Book("C", a2);
        Library library = new Library("local Library", b1, b2);
        library.displayLibrary();
    }
}