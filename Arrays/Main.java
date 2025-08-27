// Exercise 1: Array of Objects
// Bruce Eckel emphasizes that arrays of objects store references, not objects themselves.
// Task
// Create a class Book with fields title and author.


// Create an array of 3 Book references.


// Initialize each element with a new Book object.


// Print out the titles of all books.


// 💡 Edge Case: What happens if you try to print before initializing?

// int a = it is initialized 
// book b  = reference of book type



class Book {
    String title;
    String author;

    Book( String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class Main {
    public static void main(String[] args) {
        // Step 2: Array of references
        Book[] books = new Book[3];

        // Step 3: Initialize
        books[0] = new Book("java", "Joshua Bloch");
        books[1] = new Book("python", "Robert C. Martin");
        books[2] = new Book("Thinking in Java", "Bruce Eckel");

        // Step 4: Print titles
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title);
        }
        System.out.println(books[0].author);
    }
}
