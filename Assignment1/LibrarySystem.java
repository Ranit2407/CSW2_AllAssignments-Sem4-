import java.time.LocalTime;
import java.time.LocalDate;

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1=new Book("Title 1","Author 1",100);
        Magazine m1=new Magazine("Title 1","Author 1",LocalDate.of(2024,7,24));
        DVD d1=new DVD("Title 1","Author 1",LocalTime.of(12,30));
        System.out.println("Book Details");
        b1.displayDetails();
        System.out.println("Magazine Details");
        m1.displayDetails();
        System.out.println("DVD Details");
        d1.displayDetails();

    }
}

abstract class LibraryResource{
    private String title;
    private String author;
    LibraryResource(String title,String author){
        this.title=title;
        this.author=author;
    }

    void setTitle(){
        this.title=title;
    }
    void setAuthor(){
        this.author=author;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }

    abstract void displayDetails();

}

class Book extends LibraryResource{
    private int pageCount;
    Book(String title,String author, int pageCount){
        super(title,author);
        this.pageCount=pageCount;
    }

    int getPageCount(){
        return pageCount;
    }

    void setPageCount(int pageCount){
        this.pageCount=pageCount;
    }


    void displayDetails() {
        System.out.println("Title :"+getTitle());
        System.out.println("Author :"+getAuthor());
        System.out.println("Page Count :"+getPageCount());
    }
}

class Magazine extends LibraryResource{
     LocalDate issueDate;

    Magazine(String title,String author,LocalDate issueDate){
        super(title,author);
        this.issueDate=issueDate;
    }

    LocalDate getIssueDate(){
        return issueDate;
    }

    void setIssueDate(LocalDate issueDate){
        this.issueDate=issueDate;
    }

    void displayDetails(){
        System.out.println("Title :"+getTitle());
        System.out.println("Author :"+getAuthor());
        System.out.println("Issue Date :"+issueDate);
    }
}

class DVD extends LibraryResource{
    LocalTime duration;
    DVD(String title,String author,LocalTime duration){
        super(title,author);
        this.duration=duration;
    }

    LocalTime getDuration(){
        return duration;
    }

    void displayDetails(){
        System.out.println("Title :"+getTitle());
        System.out.println("Author :"+getAuthor());
        System.out.println("Duration :"+duration);
    }
}

