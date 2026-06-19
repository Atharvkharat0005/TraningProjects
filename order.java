
public class order {
    

void order(String item ) {
     
  
  System.out.println("Your items: " + item);

}

void order(String item, int quantity){

  int price = 20;

  int total = quantity * price;


   System.out.println("Item" + item + "The quantity of the items: " + total);

}

void order(String item, int quantity, double discount){

   int price = 20;

        double total = quantity * price;

        total = total - (total * discount / 100);

        System.out.println("Item " + item + " Quantity " + quantity + " Total with dis " + total);

}
 
 void Order(String items[], int Quantity[]) {
        int grandTotal = 0;

        int price = 200;

        for (int i = 0; i < items.length; i++) {
            int bill = Quantity[i] * price;
            grandTotal += bill;

            System.out.println(items[i] + " -> " + bill);
        }

        System.out.println("Grand Total of you cart is " + grandTotal);

    }


}

class App {

public static void main(String[] args) {
    
  order cust1 = new order();

        String items[] = { "Chips", "icecream", "Fries" };

        int quantity[] = { 2, 4, 1 };

        cust1.Order(items, quantity);

}


}



