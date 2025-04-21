class Author{
    String name;
    String nationality;

    Author(String name, String nationality){
        this.name = name;
        this.nationality = nationality;

    }
    //display author data
    void displayAuthor(){
        System.out.println("Author name: " + name);
        System.out.println("Nationality: " + nationality);
    }
}