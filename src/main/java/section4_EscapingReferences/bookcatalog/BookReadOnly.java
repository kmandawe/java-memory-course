package section4_EscapingReferences.bookcatalog;

public interface BookReadOnly {

  int getId();

  String getTitle();

  String getAuthor();

  String toString();

  //TODO: check if Price is immutable
  Price getPrice();
}
