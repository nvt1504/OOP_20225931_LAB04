package hust.soict.dsai.aims.media;

public class Track {
    private String title;  // Tiêu đề bài hát
    private int length;    // Độ dài bài hát

    // Constructor đầy đủ
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Constructor chỉ với tiêu đề
    public Track(String title) {
        this.title = title;
        this.length = 0;  // Mặc định độ dài là 0 nếu không cung cấp
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Setters (nếu cần)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Phương thức hiển thị thông tin Track
    public void showInfo() {
        System.out.println("Track Title: " + title);
        System.out.println("Track Length: " + (length > 0 ? length + " minutes" : "N/A"));
    }

    // Kiểm tra hai Track có cùng tiêu đề và độ dài không

}
