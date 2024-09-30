import java.util.*;
import java.util.Scanner;

public class Option {
    private Carts cart;
    private Scanner sc = new Scanner(System.in);

    public Option(Carts cart) {
        this.cart = cart;
    }

    public void ItemAdder(Order menu) {
        for (int x = 0;x<menu.getTotalItems();x++) {
            System.out.println((x + 1) 
            + ". "
            + menu.getItem(x) 
            + " - P " 
            + menu.getPrice(x));
        }

        System.out.println("Enter the item you want to add [use index]: ");
        int n = sc.nextInt();

        if (n > 0 && n <= menu.getTotalItems()) {
            Item item = new Item(menu.getItem(n-1),menu.getPrice(n-1), 1);
            cart.addItem(item);

            System.out.println("you added: " 
            + menu.getItem(n-1) 
            + " - P " 
            + menu.getPrice(n-1));

            System.out.println("you selected the following items: ");
            for (int x=0;x<cart.getItemList().size();x++) {
                System.out.println((x + 1) 
                + ". " 
                + cart.getItemList().get(x).getName() 
                + " - Quantity: " 
                +cart.getItemList().get(x).getQuantity() 
                + " - Price: " 
                + cart.getItemList().get(x).getTotalPrice());
            }
        } else {
            System.out.println("invalid index");
        }
    }

    public void ItemRemover(){
        System.out.println("Enter the index of the item you want to remove: ");
        int x=sc.nextInt();

        if (x>0 && x <= cart.getItemList().size()) {
            cart.removeItem(x-1);

            System.out.println("item is removed ");
        } else {
            System.out.println("Invalid index");
        }
    }

    public void ItemUpdater(){
        System.out.println("Enter the index of the item you want to update/change quantity: ");
        int x = sc.nextInt();

        if (x>0 && x <= cart.getItemList().size()) {
            System.out.println("type new quantity: ");
            int quantity = sc.nextInt();

            cart.updateItem(x - 1, quantity);

            System.out.println("item is updated successfully");
        } else {
            System.out.println("index only");
        }
    }

    public void CreateNewCart(){
        cart = new Carts();

        System.out.println("you created a new cart");
    }

    public void checkout(){
        System.out.println("your cart:");
        for (int x = 0; x < cart.getItemList().size(); x++) {
            System.out.println((x + 1) 
            + ". " + cart.getItemList(). get(x).getName() 
            + " - Quantity: "
            + cart.getItemList().get(x).getQuantity() 
            + " - Price: " 
            + cart.getItemList().get(x).getTotalPrice());
        }
    
        System.out.println("your total bill is: " + cart.getTotalPrice());
    
        double money;
        while (true) {
            try {
                System.out.println("enter your money: ");
                money = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("number only.");
                sc.next(); 
            }
        }
    
        double change = money - cart.getTotalPrice();
    
        if (change >= 0){
            System.out.println("Your change is: " + change);
        } else {
            System.out.println("Insufficient funds");
        }
        System.out.println("---------------------------------------");
        System.out.println("              Receipt:                 ");
        System.out.println("ITEMS:");

        for (int x = 0; x < cart.getItemList().size(); x++) {
            System.out.println((x + 1) 
            + ". " 
            + cart.getItemList(). get(x).getName() 
            + " - Quantity: " 
            +cart.getItemList().get(x).getQuantity() 
            + " - Price: " 
            + cart.getItemList().get(x).getTotalPrice());
        }
        System.out.println("\nmoney: " + money);
        System.out.println("Total: " + cart.getTotalPrice());
        System.out.println("Change: " + change);
    
        System.out.println("---------------------------------------");
        System.out.println("1. order again ");
        System.out.println("2. exit now ");
    
        int choice;
        while (true) {
            try {
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("number only.");
                sc.next(); 
            }
        }
    
        switch (choice){
            case 1:orderAgain();break;
            case 2:System.exit(0);break;
            default:
                System.out.println("invalid input");break;
        }
    }
    

    public void orderAgain(){
        cart = new Carts();
        Inputter inputter = new Inputter();
        inputter.Inputs();
    }

    public void exit(){
        System.out.println("exit");
    }
}