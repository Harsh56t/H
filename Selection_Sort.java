package Sortting;
//selectin sort :-
// A particular element is placed and compare with the remaining elements of an array and and gets the ordered position. 
public class Selection_Sort {
    static void selection_Sort(int arr[]){
     int n = arr.length;
     for(int i = 0;i<n-1;i++){
        int min_idx=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_idx]){
                min_idx =j;
            }
        }
        int temp=arr[min_idx];
        arr[min_idx]=arr[i];
        arr[i]=temp;
     }
    }
    public static void main(String[] args) {
        int arr[]={5,6,2};
        selection_Sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
