public class reverse {
    public static void main(String[] args) {
        
   int arr[] = {1, 3, 4, 5, 6, 7};

   int i = 0;
   int j = arr.length -1;
    
   while(i<j){
                int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;

    i++;
    j--;
   }
    for (int item : arr) {
                System.out.println(item);
    }

     
}
}