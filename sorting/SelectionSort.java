import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = new int[]{13,46,24,52,20,9};
        int n = arr.length;

        // // SELECTION SORT
        // for(int i=0; i<n-1; i++){
        //     int minIndex = i;
        //     for(int j=i; j<n; j++){
        //         if(arr[minIndex] > arr[j]){
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;
        // }

        // // BUBBLE SORT
        // for(int i=n-1; i>0; i--){
        //     int temp = 0;
        //     for(int j=0; j<i; j++){
        //         if(arr[j] > arr[j+1]){
        //             temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        //     if(temp == 0)
        //         break;
        // }

        // // Insertion Sort
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
