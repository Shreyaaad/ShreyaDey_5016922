package Exercise_6;

public class LibraryManagementSystem {
    private Book[] books;
    private int size;

    
    public LibraryManagementSystem(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    
    public void addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Array is full. Cannot add more books.");
        }
    }

    
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; 
    }

    
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }

    
    public void traverseBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(10);

        Book book1 = new Book(1, "Harry Potter", "J.K. Rowling");
        Book book2 = new Book(2, "The Hobbit", "J.R.R. Tolkien");
        Book book3 = new Book(3, "1984", "George Orwell");

        lms.addBook(book1);
        lms.addBook(book2);
        lms.addBook(book3);

        System.out.println("All Books:");
        lms.traverseBooks();

        System.out.println("Linear Search for 'The Hobbit':");
        System.out.println(lms.linearSearchByTitle("The Hobbit"));

        System.out.println("Binary Search for '1984':");
        System.out.println(lms.binarySearchByTitle("1984"));
    }
}
