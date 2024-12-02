package hust.soict.dsai.aims;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.cart.Cart;

public class Aim {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();

        // Tạo một số đối tượng DigitalVideoDisc
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Inception", "Sci-Fi", 19.99f, "Christopher Nolan", 148);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Interstellar", "Sci-Fi", 24.99f, "Christopher Nolan", 169);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Dunkirk", "War", 14.99f, "Christopher Nolan", 107);

        // Thêm DVD vào giỏ hàng
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        // Tạo một đối tượng Book
        Book book1 = new Book(4, "Java Programming", "Education", 29.99f);
        book1.addAuthor("James Gosling");
        book1.addAuthor("Herbert Schildt");

        // Thêm Book vào giỏ hàng
        cart.addMedia(book1);

        // Tạo một CompactDisc
        CompactDisc cd1 = new CompactDisc(5, "Thriller", "Music", 15.99f, "Michael Jackson");
        cd1.addTrack(new Track("Thriller", 5));
        cd1.addTrack(new Track("Billie Jean", 4));
        cd1.addTrack(new Track("Beat It", 4));

        // Thêm CompactDisc vào giỏ hàng
        cart.addMedia(cd1);

        // Hiển thị giỏ hàng trước khi xóa
        System.out.println("\nGiỏ hàng trước khi xóa:");
        cart.showItems();

        // Tính tổng chi phí giỏ hàng
        System.out.println("\nTổng chi phí giỏ hàng: $" + cart.calculateTotalPrice());

        // Xóa DVD khỏi giỏ hàng
        System.out.println("\nĐang xóa DVD...");
        boolean removed = cart.removeMedia(dvd2);
        if (removed) {
            System.out.println("DVD \"" + dvd2.getTitle() + "\" đã được xóa khỏi giỏ hàng.");
        } else {
            System.out.println("Không tìm thấy DVD \"" + dvd2.getTitle() + "\" trong giỏ hàng.");
        }

        // Hiển thị giỏ hàng sau khi xóa
        System.out.println("\nGiỏ hàng sau khi xóa:");
        cart.showItems();

        // Phát thử CompactDisc
        System.out.println("\nPhát thử CompactDisc:");
        cd1.play();
    }
}
