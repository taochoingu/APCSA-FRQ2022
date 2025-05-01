import java.util.*;
class Book {
    private String title;
    private double price;
    public Book(String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
    }
    public String getTitle() {
        return title;
    }
    public String getBookInfo() {
        return title + "-" + price;
    }
}
class Textbook extends Book {
    private int edition;
    public Textbook(String title, double price, int edition) {
        super(title, price);
        this.edition = edition;
    }
    public int getEdition() {
        return edition;
    }
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }
    public boolean canSubstituteFor(Textbook a) {
        return edition > a.getEdition() && getTitle().equals(a.getTitle());
    }
}

/*public class Main {
    public static void main(String[] args) {
        Textbook bio2015 = new Textbook("Biology", 49.75, 2);
        Textbook bio2019 = new Textbook("Biology", 39.75, 3);
        System.out.println(bio2019.getEdition());
        System.out.println(bio2019.getBookInfo());
        System.out.println(bio2019.canSubstituteFor(bio2015));
        System.out.println(bio2015.canSubstituteFor(bio2019));
        Textbook math = new Textbook("Calculus", 45.25, 1);
        System.out.println(bio2015.canSubstituteFor(math));
    }
}
*/
