import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * @author Adam Elliott
 * @version 2021-12-07
 */
public class Invoice {
    private ArrayList<Item> itemsSold = new ArrayList<>();
    private Customer customer;
    private Store store;
    private Date purchaseDate;

    /**
     *
     * @param customer
     * @param store
     */
    public Invoice(Customer customer, Store store) {
        this.customer = customer;
        this.store = store;
        this.purchaseDate = new Date();
    }

    /**
     *
     * @return
     */
    public ArrayList<Item> getItemsSold() {
        return itemsSold;
    }

    /**
     *
     * @param itemsSold
     */
    public void setItemsSold(ArrayList<Item> itemsSold) {
        this.itemsSold = itemsSold;
    }

    /**
     *
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     *
     * @return
     */
    public Store getStore() {
        return store;
    }

    /**
     *
     * @param store
     */
    public void setStore(Store store) {
        this.store = store;
    }

    /**
     *
     * @return
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     *
     * @param purchaseDate
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     *
     * @param item
     * @throws Exception
     */
    public void addItem(Item item) throws Exception {
        if (item.getQuantity() > 0) {
            item.setQuantity(item.getQuantity()-1);
            this.itemsSold.add(item);
        }
        else {
            throw new Exception("Item out of stock ");
        }
    }

    /**
     *
     * @return
     */
    public double addedTotal() {
        double total = 0;
        for (Item item : itemsSold) {
            total += item.getPrice();
        }
        return total;
    }

    /**
     *
     */
    public void displayInvoice() {
        // PSEUDO code
        // (print) Make ----
        // (print) Store name then store .getName
        // (print) Make ----
        //(print) customer get lastname /n customer get email address /n get customer phone number
        // Making simpledate format moduel putting in date for DD//MM/YYYY and getting format ppurchaseDate
        // enhanded for loop for Item item and going into items sold then print get item manufacturer and item get model
        // running print and math.round for added total
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Store Name: " + this.store.getName());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Name: " + this.customer.getLastName() + "," + this.customer.getFirstName());
        System.out.println("E-mail: " +this.customer.getEmailAddress());
        System.out.println("Phone: " + this.customer.getPhoneNumber());
        System.out.println("Purchase Date: " + new SimpleDateFormat("dd-MM-yyyy").format(purchaseDate));
        System.out.println("----------------------------------------------------------------------");
        for (Item item : itemsSold) {
            System.out.println(item.getManufacturer() +" " + item.getModel() + "                                            " + item.getPrice());
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Total                                                       " + Math.round(addedTotal()*100)/100D);
        System.out.println("----------------------------------------------------------------------");
    }
}
