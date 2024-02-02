import java.util.*;

public class Selection_sort {

    public static void printArray(int array[]){
        System.out.print(" [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.print("]");
    } 

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[6];
            
            System.out.println("Enter the 6 elements of the array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The input array is: ");
            printArray(arr);
            
            for (int i = 0; i < arr.length-1; i++) {
                int smallest = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j]< arr[smallest]) {
                        smallest = j;
                    }
                }
                //swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            System.out.println();
            System.out.println("The sorted array, by selection sort, is");
            printArray(arr);
        }
    }
}
