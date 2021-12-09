import java.security.SecureRandom;
/**
 * @author Adam Elliott
 * @version 2021-12-07
 */
public class StoreTest {
    /**
     * The entry starting of application.
     *
     * @param args the input arguments
     */
    public static void main(String args[]) {

        SecureRandom r1 = new SecureRandom();

        Store m1 = new Store("My First Store");
        Store m2 = new Store("My Second Store");


        m1.addItems(new Item("Apple ", "iphone 12", 1396.92, 13, Item.Type.PHONE, m1));
        m1.addItems(new Item("Apple ", "iphone 14", 1116.92, 23, Item.Type.PHONE, m1));
        m1.addItems(new Item("Apple ", "iphone 10", 516.92, 33, Item.Type.PHONE, m1));
        m1.addItems(new Item("Apple ", "iphone 13", 716.92, 23, Item.Type.ACCESSORIES, m1));
        m1.addItems(new Item("Apple ", "iphone 11", 876.92, 12, Item.Type.PHONE, m1));
        m1.addItems(new Item("Android ", "pixel 5", 816.92, 17, Item.Type.PHONE, m2));
        m1.addItems(new Item("Android ", "pixel 7", 762.92, 43, Item.Type.ACCESSORIES, m2));
        m1.addItems(new Item("Android ", "pixel 8", 934.92, 23, Item.Type.GAME, m2));
        m1.addItems(new Item("Android ", "pixel 9", 742.92, 13, Item.Type.ACCESSORIES, m2));
        m1.addItems(new Item("Android ", "pixel 3", 164.92, 53, Item.Type.ACCESSORIES, m2));

        m2.addItems(new Item("Apple ", "LA54", 1203.92, 10, Item.Type.PHONE, m2));
        m2.addItems(new Item("Apple ", "LA54", 938.92, 10, Item.Type.PHONE, m2));
        m2.addItems(new Item("Apple ", "LA54", 1200.92, 11, Item.Type.PHONE, m2));
        m2.addItems(new Item("Apple ", "LA54", 789.92, 12, Item.Type.PHONE, m2));
        m2.addItems(new Item("Apple ", "LA54", 897.92, 14, Item.Type.GAME, m2));
        m2.addItems(new Item("Apple ", "LA54", 1029.92, 12, Item.Type.CONSOLE, m2));
        m2.addItems(new Item("Apple ", "LA54", 173.92, 12, Item.Type.CONSOLE, m2));
        m2.addItems(new Item("Apple ", "LA54", 862.92, 21, Item.Type.STOCK, m2));
        m2.addItems(new Item("Apple ", "LA54", 661.92, 24, Item.Type.CONSOLE, m2));
        m2.addItems(new Item("Apple ", "LA54", 676.92, 25, Item.Type.CONSOLE, m2));

        m1.displayInventory();
        System.out.println();
        m2.displayInventory();
        System.out.println();

        Customer c1 = new Customer("Loo", "Toilet", "LooPoopsAlot@Yahoo.ca", 709777234);
        c1.setCustStore(m1);
        Customer c2 = new Customer("Ben", "Dover", "BenDover@Office.ca", 709572381);
        c2.setCustStore(m1);

        Customer c3 = new Customer("Mike", "Litoris", "MikeLitoris@Poopedmyself.com", 709987245);
        c3.setCustStore(m2);
        Customer c4 = new Customer("Ben", "Dover", "BenDover@Office.ca", 705723841);
        c4.setCustStore(m2);

        Invoice i1 = new Invoice(c1, m1);
        for (int i = 0; i < 5; i++) {

            try {
                i1.addItem(m1.getItems().get(r1.nextInt(10)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        c1.addInvoices(i1);

        i1.displayInvoice();
        System.out.println();

        Invoice i2 = new Invoice(c1, m1);
        try {
            i2.addItem(m1.getItems().get(r1.nextInt(10)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        c1.addInvoices(i2);

        c1.displayProfile();
        System.out.println();

        m1.addItems(new Item("Apple", "iPhone", 749.99, 0, Item.Type.PHONE, m1));


        m1.displayAvailableInventory();
        System.out.println();

        Invoice i3 = new Invoice(c2, m1);
        for (Item item : m1.getItems()) {
            try {
                i3.addItem(item);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        c2.addInvoices(i3);
        i3.displayInvoice();
    }
}
