
import  java.util.Scanner;
public class bubble_sort {
    void bubbleSort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void printArr(int arr[]){
            int n=arr.length;
            for(int i=0;i<n;++i){
                System.out.print(arr[i]+" ");
               System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bubble_sort ob = new bubble_sort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.print("Sorted array");
        ob.printArr(arr);

    }
}
