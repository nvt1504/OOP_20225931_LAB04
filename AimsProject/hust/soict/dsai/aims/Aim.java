package hust.soict.dsai.aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc; // Import lớp hust.soict.dsai.aims.disc.DigitalVideoDisc từ package disc
import hust.soict.dsai.aims.cart.Cart;

public class Aim {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create some new DVDs
        DigitalVideoDisc movie1 = new DigitalVideoDisc("Inception", "Sci-Fi", 19.99f);
        DigitalVideoDisc movie2 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 19.99f);
        DigitalVideoDisc movie3 = new DigitalVideoDisc("Dunkirk", "War", "Christopher Nolan", 107, 19.99f); // Sửa cách gọi constructor

        // Add DVDs to the cart
        cart.addDisc(movie1);
        cart.addDisc(movie2);
        cart.addDisc(movie3);

        // Display cart contents before removal
        System.out.println("Before removing a DVD:");
        cart.showItems();

        // Print cart details
        cart.printCartDetails();

        // Remove a DVD from the cart
        boolean dvdRemoved = cart.removeDisc(movie2);
        if (dvdRemoved) {
            System.out.println("DVD \"" + movie2.getTitle() + "\" has been removed from the cart.");
        } else {
            System.out.println("DVD \"" + movie2.getTitle() + "\" could not be found in the cart.");
        }

        // Display cart contents after removal
        System.out.println("After removing a DVD:");
        cart.showItems();
    }
}
