public class Reader {
  private String name;
  private Book book;

  public Reader(String newName) {
    this(newName, null);
  }

  public Reader(String newName, Book newBook) {
    name = newName;
    book = newBook;
  }

  // get first book available
  public void getFirstBook(Bookcase bookcase) {
    if (book == null) {
      book = bookcase.removeFirstBook();
    } else {
      System.out.println(name + " is already holding a book.");
    }
  }

  public void putBook(Bookcase bookcase) {
    if (book == null) {
      System.out.println(name + " does not have a book on hand.");
    } else {
      bookcase.addBook(book);
      book = null;
    }
  }

  public String bookToString() {
    if (book == null) {
      return name + " is not holding a book.";
    } else {
      return book.toString();
    }
  }

  public String getName() {
    return name;
  }
}
