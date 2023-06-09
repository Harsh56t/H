package Encapsulation;
import java.util.Scanner;

class New{

    public int occur(int arr[],int q){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==q){
                count++;
            }
        }
        return count;
    }
}
class Arrays{
    
    
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int x = sc.nextInt();
    int arr[] = new int[x];
  System.out.println("enter " + x +" elements");
for(int i=0;i<arr.length;i++){
    arr[i] = sc.nextInt();
}
System.out.println("Result:-");
    for(int i=0;i<arr.length;i++){
System.out.println(arr[i]+" ");
    }
      System.out.println("Select a no to count: ");
      int a = sc.nextInt();
      New Harsh = New repate();
      System.out.println("repeat times " + Harsh.occur(arr,a));
    }

 }
