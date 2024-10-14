public class LibrarySystem {
    public static void main(String[] args) {
        // Create an array of LibraryItem objects
        LibraryItem[] items = new LibraryItem[4];

        // Add different types of items to the array
        items[0] = new Book("1984", "George Orwell", "Dystopian");
        items[1] = new Magazine("National Geographic", "Various", 2023);
        items[2] = new Journal("IEEE Transactions", "John Doe", "Engineering");
        items[3] = new EBook("Java Programming", "James Gosling", 15.5, "PDF");

        // Loop through each item and demonstrate polymorphism
        for (LibraryItem item : items) {
            System.out.println("Item Type: " + item.getItemType());
            item.displayInfo(); // Polymorphic call
            System.out.println(); // For better readability
        }
    }
}
