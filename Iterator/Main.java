public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection(5);
        bookCollection.addBook(new Book("A","a"));
        bookCollection.addBook(new Book("B","b"));
        bookCollection.addBook(new Book("C","c"));
        BookIterator bookIterator = bookCollection.createIterator();
        while(bookIterator.hasNext()){
            Book book = (Book) bookIterator.next();
            System.out.println(book);
        }
    }
}
