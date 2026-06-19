public class Two {
    
public static void main(String[] args) {  

int arr[] = {1,0,2,0,3,0,4};
int j = 0;

for (int i =0; i< arr.length; i++) {
    if (arr[i] != 0) {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
    }


}

System.out.println("Array after moving zeroes to the end: ");

for(int num : arr){

    System.out.println(num + " ");
}

}
}
