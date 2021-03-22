public class Bookcase {
  private Book[][] books;
  private int numberOfBooks;
  private final int SHELVES = 5;
  private final int BOOKS_PER_SHELF = 10;
  
  public Bookcase() {
    books = new Book[SHELVES][BOOKS_PER_SHELF];
    numberOfBooks = 0;
  }

  // O(n^2) :(
  public void addBook(Book newBook) {
    for (int i = 0; i < SHELVES; i++) {
      for (int j = 0; j < BOOKS_PER_SHELF; j++) {
        if (books[i][j] == null) {
          books[i][j] = newBook;
          numberOfBooks++;
          return;
        }
      }
    }
    return;
  }

  public Book removeFirstBook() {
    if (numberOfBooks == 0) {
      return null;
    }
    Book toRemove = null;
    for (int i = 0; i < SHELVES; i++) {
      for (int j = 0; j < BOOKS_PER_SHELF; j++) {
        if (books[i][j] != null) {
          toRemove = books[i][j];
          books[i][j] = null;
          numberOfBooks--;
          return toRemove;
        }
      }
    }
    return null;
  }

  public Book removeBook(Book book) {
    if (numberOfBooks == 0) {
      return null;
    }
    Book toRemove = null;
    for (int i = 0; i < SHELVES; i++) {
      for (int j = 0; j < BOOKS_PER_SHELF; j++) {
        if (books[i][j] == book) {
          toRemove = books[i][j];
          books[i][j] = null;
          numberOfBooks--;
        }
      }
    }
    return toRemove;
  }

  public void listBooks() {
    for (int i = 0; i < SHELVES; i++) {
      for (int j = 0; j < BOOKS_PER_SHELF; j++) {
        if (books[i][j] != null) {
          System.out.println(books[i][j].toString());
        }
      }
    }
  }
}
