public class Laundry extends Order{
    //child class for Laundry order
    public Laundry(){
        super();
        LaundryMenu();
    }

    private void LaundryMenu(){

        add("5kg laundry", 50, 1);
        add("10kg laundry", 100, 1);
        add("15kg laundry", 150, 1);
        add("20kg laundry", 200, 1);
        add("25kg laundry", 250, 1);

    }
    }