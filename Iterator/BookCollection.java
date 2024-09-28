public class BookCollection implements Collection{

    private Book[] books;
    private int index = 0;

    public BookCollection(int size){
        this.books = new Book[size];
    }

    public void addBook(Book book){
        if(index < books.length){
            books[index] = book;
            index++;
        }else{
            System.out.println("FULL");
        }
    }

    public BookIterator createIterator(){
        return new BookIterator(books);
    }
}
