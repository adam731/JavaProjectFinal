/**
 * @author Adam Elliott
 * @version 2021-12-07
 */
public class Item {
    enum Type{
        STOCK("STOCK", "Shelf A-1"),
        GAME("GME", "Shelf B-2"),
        ACCESSORIES("ASC", "Shelf 12-4"),
        CONSOLE("CON", "Shelf 13-1"),
        PHONE("PHN", "Shelf 10-5");

        private final String name;
        private final String storageLocation;

        Type(String name, String storageLocation) {
            this.name = name;
            this.storageLocation = storageLocation;
        }

        public String getStorageLocation() {
            return storageLocation;
        }

        public String getName() {
            return name;
        }
    }

    private String manufacturer;
    private String model;
    private double price;
    private int quantity;
    private Type type;
    private Store store;

    public Item(String manufacturer, String model, double price, int quantity, Type type, Store store) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
        this.store = store;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

}
