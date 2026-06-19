public class sliding_window {
    

public static void main (String[ ]args){

int arr[] = {2,1,5,1,3,2};
int k = 3; // window size

int max_sum = 0;

for(int i = 0; i < k; i++){

max_sum += arr[i];
}
int current_sum = max_sum;

for(int i = k; i < arr.length; i++){

  current_sum = current_sum - arr[i - k];
            current_sum = current_sum + arr[i];

            if (current_sum > max_sum) {
                max_sum = current_sum;
            }

        }

        System.out.println("Max sum of the sub array is " + max_sum + " (Average: " + (max_sum / k) + ")");



}

}







