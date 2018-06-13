import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
        public static void main(String[] args) {
        Scanner invoice = new Scanner(System.in);
        ArrayList<LineItem> lineItems = new ArrayList<>();
        String purchasedItem, addItem, userExit = "y";
        int quantity;

        while (userExit.equalsIgnoreCase("y")){
            System.out.println("Please enter the purchased item: ");
            purchasedItem = invoice.nextLine();
            System.out.println("Please enter the item quantity: ");
            quantity = invoice.nextInt();

            try {
                LineItem lineItem = new LineItem(purchasedItem, quantity);
                System.out.println("Book found: " + lineItem.getDescription());
                System.out.println("Would you like to add this item?\n('y' or 'n')");
                invoice.nextLine();
                addItem = invoice.nextLine();

                if (addItem.equalsIgnoreCase(("y"))){
                    lineItems.add(lineItem);
                }
            } catch(NullPointerException e){
                System.out.println("No book found.");
            }

            System.out.println("Would you like to add another item?\n('y' or 'n')");
            invoice.nextLine();
            userExit = invoice.nextLine();
        }
            // Display invoice heading
            System.out.println("\n       Item            Quantity               Description                  Price             Total      \n" +
                    " ----------------  ----------------  ------------------------------  ----------------  -----------------\n");
            // Display several line items using an enhanced for loop
            for (LineItem s : lineItems) {
                System.out.println(s);
            }
    }
}
