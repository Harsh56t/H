package Sortting;

public class Bubble_sort {
    static void sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
              if (arr[j]<arr[j+1]){
                int temp =arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
              }  
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,9,6,3};
            sort(arr);
            for(int a:arr){
                System.out.print(a+" ");
        }
        
        
    }

}
// for assending oder if (arr[j]>arr[j+1]){
//for dessending oder if (arr[j]<arr[j+1]){
