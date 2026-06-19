import java.util.Scanner;
public class input {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

int arr[] = new int[5];


for(int i = 0; i< arr.length; i++){

System.out.println("Enter your elements: ");
arr[i] = sc.nextInt();

}

System.out.println("Enter your element form 5: ");

for(int i = 0; i < arr.length ; i++){
  
    System.out.println("Element " + i + " is " + arr[i]);

}


}



}
