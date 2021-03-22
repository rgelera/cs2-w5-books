public class ReaderTest {
  
  public static void main(String[] args) {
    Bookcase bc = new Bookcase();
    
    Book b1 = new Book("Think Like A Programmer", "V. Anton Spraul", "9781593274245");
    Book b2 = new Book("Clean Code", "Robert C. Martin", "9780132350884");
    Book b3 = new Book("Practical Object-Oriented Design in Ruby", "Sandi Metz", "9780321721334");

    Reader rodney = new Reader("Rodney", b3);

    System.out.println("-- Adding b1 and b2");
    bc.addBook(b1);
    bc.addBook(b2);
    System.out.println("-- Listing books in bookcase");
    bc.listBooks();
    System.out.println("-- " + rodney.getName() + " is holding " + rodney.bookToString());
    System.out.println("-- Placing " + rodney.bookToString() + " in bookcase.");
    rodney.putBook(bc);
    System.out.println("-- Listing books in bookcase");
    bc.listBooks();
    System.out.println("-- Rodney getting first book");
    rodney.getFirstBook(bc);
    System.out.println("-- Listing books in bookcase");
    bc.listBooks();
    System.out.println("-- " + rodney.getName() + " is holding " + rodney.bookToString());
  }
}
