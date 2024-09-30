public class Grocery extends Order {
    //child class for  grocery order

    public Grocery() {
        super();
        GroceryMenu();
    }

    private void GroceryMenu() {
        add("Rice", 50, 1);
        add("Eggs", 8, 1);
        add("Milk", 90, 1);
        add("Soy Sauce", 100, 1);
        add("Vinegar", 80, 1);
    }
}