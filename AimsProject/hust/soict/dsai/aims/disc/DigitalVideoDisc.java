package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;  // Thêm thuộc tính lớp để đếm số lượng DVD đã tạo
    private String id;
    private String title;
    private String category;
    private float price;
    private String director;
    private int length;

    // Constructor with title only
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = "DVD" + (++nbDigitalVideoDiscs);  // Cập nhật id và tăng số lượng DVD
    }

    // Constructor with title, category, and price
    public DigitalVideoDisc(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.id = "DVD" + (++nbDigitalVideoDiscs);  // Cập nhật id và tăng số lượng DVD
    }

    // Constructor with director, category, title, and price
    public DigitalVideoDisc(String director, String category, String title, float price) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.price = price;
        this.id = "DVD" + (++nbDigitalVideoDiscs);  // Cập nhật id và tăng số lượng DVD
    }

    // Full constructor
    public DigitalVideoDisc(String id, String title, String category, float price, String director, int length) {
        this.id = "DVD" + (++nbDigitalVideoDiscs);  // Cập nhật id và tăng số lượng DVD
        this.title = title;
        this.category = category;
        this.price = price;
        this.director = director;
        this.length = length;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setlength(int length) {
        this.length = length;
    }

    // Method to display DVD information
    public void showInfo() {
        System.out.println("DVD ID: " + this.id);  // Hiển thị ID của DVD
        System.out.println("DVD Title: " + (this.title != null ? this.title : "N/A"));
        System.out.println("Category: " + (this.category != null ? this.category : "N/A"));
        System.out.println("Price: $" + this.price);
        System.out.println("Director: " + (this.director != null ? this.director : "N/A"));
        System.out.println("length: " + (this.length > 0 ? this.length + " minutes" : "N/A"));
    }

    // Check if the length is valid
    public boolean isValidlength() {
        return (this.length > 0);
    }

    // Check if the title matches a given search term
    public boolean matchesTitle(String searchTerm) {
        return title.toLowerCase().contains(searchTerm.toLowerCase());
    }

    // Check if the category matches
    public boolean matchesCategory(String searchCategory) {
        return category.equalsIgnoreCase(searchCategory);
    }

    // Check if the price is within a specified range
    public boolean isWithinPriceRange(Float minPrice, Float maxPrice) {
        if (minPrice != null && price < minPrice) {
            return false;
        }
        if (maxPrice != null && price > maxPrice) {
            return false;
        }
        return true;
    }
    // Constructor with title, category, director, length, and price
    public DigitalVideoDisc(String title, String category, String director, int length, float price) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.price = price;
        this.id = "DVD" + (++nbDigitalVideoDiscs); // Cập nhật id và tăng số lượng DVD
    }


    // Getter for nbDigitalVideoDiscs
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    
}
