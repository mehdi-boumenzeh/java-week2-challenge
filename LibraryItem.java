// Superclass
class LibraryItem {
    private String title;
    private String author;
    public LibraryItem(String title, String author) {
    this.title = title;
    this.author = author;
    }
    public String getTitle() {
    return title;
    }
    public String getAuthor() {
    return author;
    }
    public void displayInfo() {
    System.out.println("Title: " + title + ", Author: " + author);
    }
    // New method to return item type
    public String getItemType() {
        return "Library Item";
    }
    }