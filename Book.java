class Book {
    String title;
    Author author; //HAS-A relationship(book ha an author)

    //constructor that receives an Author object
    Book(String title, Author author){
        this.title = title;
        this.author = author;

    }
    void displayBook(){
        System.out.println("Book Tilte: " + title);
        author.displayAuthor(); //using author object
    }
}
