public class Displayer{
    //this is the displayer class where most printouts  will be done

    public void Display(){

        System.out.println("-----------------------------------------------");
        System.out.println("Hello! Welcome to Cyber Grab Application");
        System.out.println("----------------------------------------------- \n");

    }

    public void Display1(){

        System.out.println("Choose your Order Type: [reminder: use numbers only to choose] \n");

    }

    public void Display2(Order order){

        System.out.println("Choose your Items: [reminder: use numbers only to choose] ");
        for (int x = 0; x < order.getTotalItems(); x++) {
            System.out.println((x + 1) + ". " + order.getItem(x) + " - P " + order.getPrice(x));

        }
        }

    public void Display3(){

        System.out.println("OPTIONS: ");
        System.out.println("1. add items ");
        System.out.println("2. remove items ");
        System.out.println("3. update items ");
        System.out.println("4. create new cart ");
        System.out.println("5. checkout ");
        System.out.println("6. exit");

    }

    public void DisplayTotalPrice(double totalprice)
    {
        System.out.println("Total Price: P " + totalprice);
    }
    }
    
    
