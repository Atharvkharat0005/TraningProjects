public class string {
    
public static void main (String[] args){

String name[] = { "Laptop", "Mouse", "Keyboard", "Monitor", "mobile"};

int prices[] = { 50000, 500, 3000, 15000, 30000};


display(name, prices);

}

public static void display(String name[], int prices[]){

    for (int i = 0; i < name.length; i++) {
    
   

        System.out.println(name[i] + " : " + prices[i]);

     if(prices[i] >= 50000){

        System.out.println(name[i] + " is expensive");

     } else {

        System.out.println(name[i] + " is cheap");
     }  





    }





}
}



