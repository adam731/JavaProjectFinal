import java.util.ArrayList;
/**
 * @author Adam Elliott
 * @version 2021-12-07
 */
public class Store {

    private String name;
    private ArrayList<Item> items = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void displayInventory() {
        // Println -------
        //
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