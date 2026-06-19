// public class array{

// public static void main (String []args){
  
// int arr[] = {1,2,3,4,5};

// int arr2[] = new int[5];


// arr2[0] = 1;
// arr2[1] = 2;
// arr2[2] = 3;
// arr2[3] = 4;
// arr2[4] = 5;


// for(int i =0; i<arr.length; i++){
    

//         System.out.println(arr2[i]);  
    
// }

// }

// }

import java.util.Scanner;

public class array {

public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[5];

        String arr[] = new String[5];
              
        // for(int i= 0; i < arr.length; i++){

               
        //          arr[i] = sc.nextInt();
        //        System.out.print(arr[i] + " ");
        // }

    for(String ele : arr){

        ele = sc.nextLine();
        System.out.print(ele + " ");


    }
}
}
