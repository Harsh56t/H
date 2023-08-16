package Sortting;
//what is insertion Sorting ?
//:- In this algorithm,one part is treated as sorted part and the other part remains unsorted that we iterate the 1st element
//of the unsorted array until it gets the ordered position. 
public class Insertition_sort {
    static void sort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
           int j = i;
          while(j>0&&arr[j]<arr[j-1]){
            //for assending oder:- while(j>0&&arr[j]>arr[j-1]){
            //for dessendingoder:-while(j>0&&arr[j]<arr[j-1]){
            int temp =arr[j];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
          }
          
        }
    }
    public static void main(String[] args) {
     int arr[] = {1,2,5,3,4 };
      sort(arr);
     for(int a:arr){
        System.out.print(a+",");
     }

    }
}
