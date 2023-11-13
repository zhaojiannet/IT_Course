public class Book {
    String title;
    String author;
    double price;
    String category;
    String status;

    public Book(String title, String author, double price, String category, String status) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.status = "未借";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
