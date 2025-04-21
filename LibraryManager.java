class LibraryManager {
    //method to create and return a book object
    public Book createBook(String title, Author author){
        return new Book(title, author);
    }
}
