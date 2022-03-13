class Book {

    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors.clone();

        //used clone() due to warning: The user-supplied array 'authors' is stored directly.
    }
}