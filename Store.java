import java.util.ArrayList;
/**
 * @author Adam Elliott
 * @version 2021-12-07
 */
public class Store {

    private String name;
    private ArrayList<Item> items = new ArrayList<>();

    /**
     * variable for store name object
     * @param name
     */
    public Store(String name) {
        this.name = name;
    }

    /**
     * gets name of object
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * sets store name of object
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets arraylist of get items for object
     * @return
     */

    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * sets item array list for item object
     * @param items
     */

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    public void displayInventory() {
        // Println -------
        // Print formating and get name
        // Print -----
        // Print formating wityh manufacturer and model and type and qty and price
        // make an enhanced for loop for item item into items
        // print item.get manufactuer / .getModel / .getType.getName / item.getQuantity and item.getprice
        // print location storage for item.getType
        // Print formating
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Store Name: %s%n",getName());
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-20s%-20s%-10s%-15s%-10s\n","Manufacturer","Model","Type","Qty","Price");
        System.out.println("----------------------------------------------------------------------");
        for (Item item : items) {
            System.out.printf("%-20s%-20s%-10s%-15s%-10s\n",item.getManufacturer(),item.getModel(),item.getType().getName(),item.getQuantity(),item.getPrice());
            System.out.println("      Location Storage: "+item.getType().getStorageLocation());
        }
        System.out.println("----------------------------------------------------------------------");
    }
    // make public void additmes with Item item in field
    // then print items add item
    public void addItems(Item item) {
        this.items.add(item);
    }

    public void displayAvailableInventory() {
        // PSEUDO code
        // print -----------
        // printf .getname in format
        // printf manufacturer, model, type , Qty, price in string print format
        // print -----------
        // enhanced for loop going into Item item and into items then making if for checking item get Quanity less then zero
        // printf item get manufactuer, item getModel, item getType ,item getQuantit and item getPrice.
        // println line ----------
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Store Name: %s%n",getName());
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-20s%-20s%-10s%-15s%-10s\n","Manufacturer","Model","Type","Qty","Price");
        System.out.println("----------------------------------------------------------------------");
        for (Item item : items) {
            if (item.getQuantity() > 0) {
                System.out.printf("%-20s%-20s%-10s%-15s%-10s\n",item.getManufacturer(),item.getModel(),item.getType().getName(),item.getQuantity(),item.getPrice());
                System.out.println("      Location Storage: "+item.getType().getStorageLocation());
            }
        }
        System.out.println("----------------------------------------------------------------------");
    }
}