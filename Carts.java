import java.util.LinkedList;
//this is the carts class where items chosen are stored in a single cart

public class Carts{

    private LinkedList<Item> itemList;

    public Carts()
    {
        
        itemList = new LinkedList<>();

    }

    public void addItem(Item item)
    {

        itemList.add(item);

    }

    public void removeItem(int x)
    {

        if (x < 0 || x >= itemList.size()){
            throw new IndexOutOfBoundsException("within the range only");
        }
        itemList.remove(x);

    }

    public void updateItem(int x, int newQuantity)

    {
        if (x<0 || x >= itemList.size()){
            throw new IndexOutOfBoundsException("within of range only");
        }
        itemList.get(x).setQuantity(newQuantity);
    }

    public LinkedList<Item> getItemList() {

        return new LinkedList<>(itemList);

    }

    public double getTotalPrice() {

        double total = 0;
        for (Item item : itemList) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
