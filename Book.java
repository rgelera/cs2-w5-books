public class Book {
  private String title;
  private String author; 
  private String isbn;

  public Book(String newTitle, String newAuthor, String newIsbn) {
    title = newTitle;
    author = newAuthor;
    isbn = newIsbn;
  }

  public String getTitle() { return title; }
  public String getAuthor() { return author; }
  public String getIsbn() { return isbn; }

  public String toString() {
    return title + " by " + author;
  }
}
