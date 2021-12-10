import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 * @author Adam Elliott
 * @version 2021-12-07
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private int phoneNumber;
    private Store CustStore;
    private ArrayList<Invoice> invoices = new ArrayList<>();

    /**
     * Constrcutors for first name last name, emailaddress and phonenumber
     * @param firstName
     * @param lastName
     * @param emailAddress
     * @param phoneNumber
     */
    public Customer(String firstName, String lastName, String emailAddress, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for getting first name of customer class
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter for getting customer store of customer class
     * @return
     */
    public Store getCustStore() {
        return CustStore;
    }

    /**
     * setters for getting customer store of customer class
     * @param custStore
     */
    public void setCustStore(Store custStore) {
        CustStore = custStore;
    }

    /**
     * sets first name for customer class
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * gets last name for customer class
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets last name for customer class
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets emailaddress for customer class
     * @return
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * sets emailaddress for customer class
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * gets phone number for customer class
     * @return
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * sets phone number for customer class
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets invoice of an array list for customer class
     * @return
     */
    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    /**
     * sets invoice of an array list for customer class
     * @param invoices
     */
    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    /**
     * adds invoice of invoice for customer class
     * @param invoice
     */
    public void addInvoices(Invoice invoice) {
        this.invoices.add(invoice);
    }
    /**
     *
     */
    public void displayProfile() {
        // PSEUDO code
        // make variable int totalsale and set it to zero
        // make an enhanced for loop that's Invoice invoice into invoices
        // then add invoice added total to total sales
        // Repeat for loop for store but make it equal to null and use invoice.getstore
        // print formatted line
        // print Name last name emailaddress and phone number in asked format
        // make a for loop for item size then print invoice and invoice . getpurchase date and items purchased
        // then make an enhanced for loop for Item item into invoices .get items sold with your counter for loop inside
        // then print formating and item manufacturer then item get model then item get price

        int totalSales = 0;
        for (Invoice invoice : invoices) {
            totalSales += invoice.addedTotal();
        }
        Store store = null;
        for (Invoice invoice : invoices) {
            store = invoice.getStore();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Name: " + firstName + "," + lastName + "                  " + "Total sales: " + totalSales);
        System.out.println("E-mail: " + emailAddress + "                 Store: " + store.getName());
        System.out.println("Phone: " + phoneNumber);
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < invoices.size(); i++) {
            System.out.println("Invoice "+i);
            System.out.println("Purchase Date: " + invoices.get(i).getPurchaseDate());
            System.out.println("Items Purchased");
            for (Item item : invoices.get(i).getItemsSold()) {
                System.out.printf("%-15s%-40s%-20s\n",item.getManufacturer(),item.getModel(),item.getPrice());
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Total                                 " + invoices.get(i).addedTotal());
            System.out.println("----------------------------------------------------------------------");
        }
    }
}

