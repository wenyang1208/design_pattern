public class BookIterator implements Iterator{

    private Book[] books;
    private int position  = 0;

    public BookIterator(Book[] books){
        this.books = books;
    }

    public boolean hasNext(){
        if(books[position] != null && position < books.length){
            return true;
        }
        return false;
    }

    public Object next(){
        Book book = books[position];
        position++;
        return book;
    }
}
