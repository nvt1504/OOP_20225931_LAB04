package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;               // Nghệ sĩ biểu diễn
    private ArrayList<Track> tracks;    // Danh sách các bài hát

    // Constructor đầy đủ
    public CompactDisc(String title, String category, float price, int length, String director, String artist) {
        super(++Disc.nbDiscs, title, category, price, length, director);  // Gọi constructor của Disc
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    // Getter cho artist
    public String getArtist() {
        return artist;
    }

    // Phương thức thêm bài hát
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }

    // Phương thức xóa bài hát
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    // Phương thức tính tổng độ dài CD
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Phương thức hiển thị thông tin CD
    public void showInfo() {
        System.out.println("CD ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Price: $" + getPrice());
        System.out.println("Length: " + getLength() + " minutes");
        System.out.println("Director: " + (getDirector() != null ? getDirector() : "N/A"));
        System.out.println("Artist: " + (artist != null ? artist : "N/A"));
        System.out.println("Tracks:");
        for (Track track : tracks) {
            System.out.println(" - " + track.getTitle() + " (" + track.getLength() + " minutes)");
        }
    }
}
