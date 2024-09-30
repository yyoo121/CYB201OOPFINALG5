public class Food extends Order{
    //child class for food order
    public Food(){
        super();
        FoodMenu();
    }

    private void FoodMenu(){

        add("Pizza", 200, 1);
        add("Burger", 150, 1);
        add("Fries", 100, 1);
        add("Sandwich", 80, 1);
        add("Tacos", 120, 1);

    }
    }
