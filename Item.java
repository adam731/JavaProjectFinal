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

        /**
         *
         * @param name
         * @param storageLocation
         */
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

    /**
     * Returns get manufacturer object
     * @return getmanufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     *  Sets manfacturer object
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     *  Gets model object
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     *  Sets model object
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * gets price of object
     * @return getPrice
     */
    public double getPrice() {
        return price;
    }

    /**
     * sets price of object
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * gets get quantity of object
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * sets quantity of object
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * gets getType of object
     * @return
     */
    public Type getType() {
        return type;
    }

    /**
     *  sets setType of object
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     *  gets store of object
     * @return
     */
    public Store getStore() {
        return store;
    }

    /**
     *  sets store of object
     * @param store
     */
    public void setStore(Store store) {
        this.store = store;
    }

}
