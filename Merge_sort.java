package Sortting;

public class Merge_sort {
    //Mereg is also known as (Divide and conger algorithum)
    // def :- merge sort is an important and popular algorithum which is also known as (Divide and conger algorithum) in this methord 
    // we devide unsoted part umtil and unless we got an single sorted array.after that we compair the element and accoding to soorting
    // manner we place the element into the new array and coppeyed into the priveus array .this is the best sorting algorithm...
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged []= new int [ei-si+1];
        int idx = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx<=mid&&idx2<=ei){
            if(arr[idx]<=arr[idx2]){
                merged[x++]=arr[idx++];
            }
            else{
                merged[x++]= arr[idx2++];
            }
        }
            while(idx<=mid){
               merged[x++]=arr[idx++];
                }
                while(idx2<=ei){
                    merged[x++]=arr[idx2++];
                }
                for(int i = 0,j=si;i<merged.length;i++,
                j++){
                 arr[j]=merged[i];
                }
        }
    
    public static void divide(int[]arr,int si,int ei){
            if (si>=ei){
                return;
                // Base case;
            }
            int mid = si+(ei-si)/2;
            // OR
            //int mid= si+ (ei+si) / 2;
            divide(arr,si,mid);
            divide(arr,mid+1,ei);
            conquer(arr,si,mid,ei);

        }
    public static void main(String[] args) {
        
        int arr[]={9,1,12,3,7,5,4};
        int n = arr.length;
        int si = 0;
        divide(arr,0,n-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}