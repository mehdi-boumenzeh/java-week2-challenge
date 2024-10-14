class EBook extends LibraryItem {
    private double fileSize; // in MB
    private String format; // e.g., PDF, ePub

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB, Format: " + format);
    }

    @Override
    public String getItemType() {
        return "EBook";
    }
}