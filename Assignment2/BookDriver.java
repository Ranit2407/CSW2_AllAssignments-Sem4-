import java.math.BigDecimal;

class Book<T extends Comparable<T>> {
    private int bookId;
    private String bookName;
    private T price;

    // Constructor
    public Book(int bookId, String bookName, T price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    // Overloaded toString method
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    // Overloaded equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book<?> book = (Book<?>) obj;

        if (bookId != book.bookId) return false;
        if (!bookName.equals(book.bookName)) return false;
        return price.equals(book.price);
    }
}

public class BookDriver {
    public static void main(String[] args) {
        // Creating book objects with different price types
        Book<Double> book1 = new Book<>(101, "Java Programming", 29.99);
        Book<Integer> book2 = new Book<>(102, "Data Structures", 20);

        // Comparing book objects based on price
        BigDecimal price1 = BigDecimal.valueOf(book1.getPrice());
        BigDecimal price2 = BigDecimal.valueOf(book2.getPrice().doubleValue());
        int compareResult = price1.compareTo(price2);

        if (compareResult < 0) {
            System.out.println(book1.getBookName() + " is cheaper than " + book2.getBookName());
        } else if (compareResult > 0) {
            System.out.println(book2.getBookName() + " is cheaper than " + book1.getBookName());
        } else {
            System.out.println("Both books have the same price.");
        }

        // Printing details of book objects
        System.out.println("Book 1 Details:");
        System.out.println(book1);

        System.out.println("\nBook 2 Details:");
        System.out.println(book2);
    }
}