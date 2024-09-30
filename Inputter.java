import java.util.*;
//this is the inputter class where most of the code gets inputs from the user.
public class Inputter{
    private Order menu;
    private Carts cart;
    private Scanner sc = new Scanner(System.in);
    private boolean checkouts = false;
    private Option option;

    public Inputter(){

        cart = new Carts();
        option = new Option(cart);

                     }

    public void Inputs(){

        while (!checkouts){
            try {
                System.out.println("Choose order type: [1] Food [2] Flower [3] Grocery [4] Laundry");
                System.out.println("Enter order type: ");
                int ordertype = sc.nextInt();

                                switch (ordertype)
                {
                    case 1:   menu = new Food();     break;
                    case 2:   menu = new Flower();   break;
                    case 3:   menu = new Laundry();  break;
                    case 4:   menu = new Grocery();  break;

                    default:
                        System.out.println("choose from the option only");
                        continue; 
                }

                if (menu != null){
                    Inputs2(menu);
                }

            } catch (InputMismatchException e) {
                System.out.println("numbers only");
                sc.next(); 
            }
            }
            }

    public void Inputs2(Order menu){

        while (true){
            try {

                System.out.println("\tMenu:\n---------------------------------------------------------");
                for (int x = 0; x < menu.getTotalItems(); x++) {
                    System.out.println( (x + 1) 
                    + ". " 
                    + menu.getItem(x) 
                    + " - P " 
                    + menu.getPrice(x));
                }
                System.out.println("---------------------------------------------------------\n");
                System.out.println("Enter the items [index only]: ");
                int x = sc.nextInt();

                if (x<1 || x > menu.getTotalItems()) {
                    System.out.println("from the choices only!!");
                    continue; 
                }

                Item item = new Item(menu.getItem(x - 1), menu.getPrice(x - 1), 1);
                cart.addItem(item);

                System.out.println("You have selected: " 
                + menu.getItem(x-1) 
                + " - P " 
                + menu.getPrice(x-1));

                System.out.println("\ntotal selected items:");
                displaySelectedItems();
                System.out.println("---------------------------------------------------------\n");

                while (true){
                    Displayer displayer = new Displayer();
                    displayer.Display3();

                    System.out.println("\nEnter your choice: ");
                    try {
                                    int choice = sc.nextInt();

                                        switch (choice) 
                        {
                            case 1:  option.ItemAdder(menu);  break;
                            case 2:  option.ItemRemover();   break;
                            case 3:  option.ItemUpdater();   break;
                            case 4:  option.CreateNewCart(); break;
                            case 5:  option.checkout();
                                checkouts = true; return;
                            case 6:
                                System.out.println("exited"); return; 
                            default:
                                System.out.println("choose from the option only!!");
                                break;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("number only!!");
                        sc.next(); 
                        continue; 
                    }
                    }
            } catch (InputMismatchException e) {
                System.out.println("number only!!");
                sc.next(); 
            }
            }
            }

    public void displaySelectedItems() {
        for (int x = 0; x < cart.getItemList().size(); x++){
            System.out.println( (x + 1) 
            + ". " 
            + cart.getItemList().get(x).getName() 
            + " - quantity: "
            + cart.getItemList().get(x).getQuantity() 
            + " - price: " 
            + cart.getItemList().get(x).getTotalPrice());
        }
    }
}