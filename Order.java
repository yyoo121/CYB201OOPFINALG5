import java.util.LinkedList;
//this is the parent class and use to get data from the child class which is the food,laundry,grocery,flower
public class Order{
    protected LinkedList<Item> items;

    public Order(){
        items = new LinkedList<>();
    }

    public void add(String item, double price, int quantity){
        items.add(new Item(item, price, quantity));
    }

    public String getItem(int x){
    return items.get(x).getName();
    }

    public double getPrice(int x){
    return items.get(x).getTotalPrice();
    }

    public int getTotalItems(){
    return items.size();
    }

    public double getTotalOrderPrice(){
    double total = 0;
    for (Item item : items)
    {
        total += item.getTotalPrice();
    }
        return total;
    }
    }