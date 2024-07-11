/*
package logica;


public class BookTest {

    public static void main(String[] args) {
        // Create book instances using different constructors
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9781234567890", 218, 1925);
        Book book2 = new Book("1984", "George Orwell", "9781234567891");

        // Print book details
        System.out.println(book1);
        System.out.println(book2);

        // Set additional details for book2
        book2.setNumPages(328);
        book2.setPublishedYear(1949);

        // Print updated book2 details
        System.out.println(book2);

        // Validate book instances
        System.out.println("Is book1 valid? " + book1.isValid(book1.getTitle(), book1.getAuthor(), book1.getIsbn(), book1.getNumPages(), book1.getPublishedYear()));
        System.out.println("Is book2 valid? " + book2.isValid(book2.getTitle(), book2.getAuthor(), book2.getIsbn(), book2.getNumPages(), book2.getPublishedYear()));

        // Check valid ISBNs
        System.out.println("Is book1's ISBN valid? " + Book.isValidISBN(book1.getIsbn()));
        System.out.println("Is book2's ISBN valid? " + Book.isValidISBN(book2.getIsbn()));

        // Create a book with invalid ISBN
        Book book3 = new Book("Invalid Book", "Unknown Author", "123");
        System.out.println("Is book3 valid? " + book3.isValid(book3.getTitle(), book3.getAuthor(), book3.getIsbn(), book3.getNumPages(), book3.getPublishedYear()));
        System.out.println("Is book3's ISBN valid? " + Book.isValidISBN(book3.getIsbn()));

        // Output all books' details using toString method
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
*/