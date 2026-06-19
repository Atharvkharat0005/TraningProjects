import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
    
    int arr[] = new int[5]; 

Scanner sc = new Scanner(System.in);

for(int i =0; i < arr.length; i++){

System.out.println("Enter the element: ");

arr[i] = sc.nextInt();

}
int sum = 0;
for(int i =0; i<arr.length; i++){
 
 sum = sum + arr[i];

}
System.out.println(" Average of the marks od student: " + (sum/ arr.length));



    }
}
