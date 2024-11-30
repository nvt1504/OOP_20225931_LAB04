package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc; // Import lớp hust.soict.dsai.aims.disc.DigitalVideoDisc từ package disc
import java.util.ArrayList; // Import lớp ArrayList cho danh sách DVD

import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> dvdList;
    private final int capacity;

    public Cart() {
        this.dvdList = new ArrayList<>();
        this.capacity = 20; // Giới hạn tối đa cho giỏ hàng
    }

    public ArrayList<DigitalVideoDisc> getDvdList() {
        return dvdList;
    }

    public void addDisc(DigitalVideoDisc disc) {
        if (dvdList.size() < capacity) {
            dvdList.add(disc);
            System.out.println("DVD \"" + disc.getTitle() + "\" đã được thêm vào giỏ hàng.");
        } else {
            System.out.println("Không thể thêm DVD. Giỏ hàng đã đầy.");
        }
    }

    public boolean removeDisc(DigitalVideoDisc disc) {
        boolean isRemoved = dvdList.remove(disc);
        if (isRemoved) {
            System.out.println("DVD \"" + disc.getTitle() + "\" đã được xóa khỏi giỏ hàng.");
        } else {
            System.out.println("DVD \"" + disc.getTitle() + "\" không tìm thấy trong giỏ hàng.");
        }
        return isRemoved;
    }

    public float calculateTotalPrice() {
        float totalPrice = 0;
        for (DigitalVideoDisc disc : dvdList) {
            totalPrice += disc.getPrice();
        }
        return totalPrice;
    }

    public void showItems() {
        System.out.println("Giỏ hàng có " + dvdList.size() + " DVD:");
        for (DigitalVideoDisc disc : dvdList) {
            disc.showInfo();
            System.out.println();
        }
        System.out.println("Tổng giá: $" + calculateTotalPrice());
    }

    //overloading
    public void addDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (this.dvdList.size() < capacity) {
                this.dvdList.add(disc);
                System.out.println("DVD \"" + disc.getTitle() + "\" đã được thêm vào giỏ hàng.");
            } else {
                System.out.println("Giỏ hàng đã đầy, không thể thêm DVD \"" + disc.getTitle() + "\".");
                break; // Dừng lại nếu giỏ hàng đầy
            }
        }
    }
    
    // method allows to pass an arbitrary number of arguments for dvd.
    // public void addDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc... dvdArray) {
    //     for (hust.soict.dsai.aims.disc.DigitalVideoDisc disc : dvdArray) {
    //         if (this.dvdList.size() < capacity) {
    //             this.dvdList.add(disc);
    //             System.out.println("DVD \"" + disc.getTitle() + "\" đã được thêm vào giỏ hàng.");
    //         } else {
    //             System.out.println("Giỏ hàng đã đầy, không thể thêm DVD \"" + disc.getTitle() + "\".");
    //             break; // Dừng lại nếu giỏ hàng đầy
    //         }
    //     }
    // }
    
    public void addDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (this.dvdList.size() < capacity) {
            this.dvdList.add(dvd1);
            System.out.println("DVD \"" + dvd1.getTitle() + "\" đã được thêm vào giỏ hàng.");
        } else {
            System.out.println("Giỏ hàng đã đầy, không thể thêm DVD \"" + dvd1.getTitle() + "\".");
            return; // Nếu giỏ hàng đầy, không thêm DVD thứ hai
        }

        if (this.dvdList.size() < capacity) {
            this.dvdList.add(dvd2);
            System.out.println("DVD \"" + dvd2.getTitle() + "\" đã được thêm vào giỏ hàng.");
        } else {
            System.out.println("Giỏ hàng đã đầy, không thể thêm DVD \"" + dvd2.getTitle() + "\".");
        }
    }

    public void printCartDetails() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        if (dvdList.isEmpty()) {
            System.out.println("Giỏ hàng hiện tại trống.");
        } else {
            int count = 1;
            for (DigitalVideoDisc disc : dvdList) {
                System.out.println(count + ". DVD - " + disc.getTitle() + " - " + disc.getCategory() + " - " 
                    + disc.getDirector() + " - " + disc.getLength() + " minutes: $" + disc.getPrice());
                count++;
            }
        }
        System.out.println("Total cost: $" + calculateTotalPrice());
        System.out.println("***************************************************");
    }
    
}
