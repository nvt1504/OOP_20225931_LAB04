package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc; // Import lớp hust.soict.dsai.aims.disc.DigitalVideoDisc từ package disc


public class Store {
    //  fixed branch
    private DigitalVideoDisc[] itemsInStore;
    private int currentCount;

    public Store(int capacity) {
        // Khởi tạo mảng các DVD trong cửa hàng với sức chứa tối đa
        this.itemsInStore = new DigitalVideoDisc[capacity];
        this.currentCount = 0;
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (currentCount < itemsInStore.length) {
            itemsInStore[currentCount] = dvd;
            currentCount++;
            System.out.println("DVD \"" + dvd.getTitle() + "\" đã được thêm vào cửa hàng.");
        } else {
            System.out.println("Cửa hàng đã đầy, không thể thêm DVD \"" + dvd.getTitle() + "\".");
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public boolean removeDVD(DigitalVideoDisc dvd) {
        boolean isRemoved = false;
        for (int i = 0; i < currentCount; i++) {
            if (itemsInStore[i].getId().equals(dvd.getId())) {
                // Xóa DVD bằng cách dịch các phần tử còn lại lên
                for (int j = i; j < currentCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[currentCount - 1] = null; // Xóa phần tử cuối cùng
                currentCount--;
                isRemoved = true;
                System.out.println("DVD \"" + dvd.getTitle() + "\" đã được xóa khỏi cửa hàng.");
                break;
            }
        }

        if (!isRemoved) {
            System.out.println("DVD \"" + dvd.getTitle() + "\" không tìm thấy trong cửa hàng.");
        }
        return isRemoved;
    }

    // Phương thức hiển thị các DVD trong cửa hàng
    public void showItemsInStore() {
        System.out.println("Danh sách DVD trong cửa hàng:");
        if (currentCount == 0) {
            System.out.println("Cửa hàng hiện tại trống.");
        } else {
            for (int i = 0; i < currentCount; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].getTitle() + " - " + itemsInStore[i].getCategory());
            }
        }
    }
}
