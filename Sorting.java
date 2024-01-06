import java.util.Arrays;
public class Sorting{
    public static void printArray(int [] arr){
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String [] args){
        // System.out.println("Hello I'm Mandvi");
        int arr[] = {3,4,2,1,6,5};
        //Bubble Sorting
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j]; //Swapping
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        // Selection Sorting [3,4,2,1,6,5]
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j] < arr[smallest]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        // Insertion Sort
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}