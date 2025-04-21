public class LibraraySystem {
    public static void main(String[] args) {
        //create an author
        Author author1 = new Author("John Smith", " USA");


        //pass thhe author to librarayManager to get a BOOk
        LibraryManager manager = new LibraryManager();
        Book myBook = manager.createBook("English", author1);

        myBook.displayBook();
    }
}
