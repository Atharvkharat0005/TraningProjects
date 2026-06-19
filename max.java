import java.util.Scanner;
public class max {
    public static void main(String[] args) {
          int arr[] = new int[4];
Scanner sc = new Scanner(System.in);

for(int i =0; i <arr.length; i++){

System.out.println(" Enter you String of Element: ");

arr[i] = sc.nextInt();

}
int max = arr[0];
for(int i = 0; i< arr.length; i++){

if(max < arr[i] ){

    max = arr[i];
}

}
System.out.println(max);


    }
}
