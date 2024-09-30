public class Flower extends Order{
    //child class for flower order
    public Flower(){
        super();
        FlowerMenu();
    }

    private void FlowerMenu() {

        add("rose", 100, 1);
        add("lily", 150, 1);
        add("sunflower", 200, 1);
        add("azalea", 300, 1);
        add("daisy", 400, 1);

    }
    }
