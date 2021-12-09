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
     *
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
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return
     */
    public Store getCustStore() {
        return CustStore;
    }

    /**
     *
     * @param custStore
     */
    public void setCustStore(Store custStore) {
        CustStore = custStore;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     *
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     *
     * @return
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    /**
     *
     * @param invoices
     */
    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    /**
     *
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

