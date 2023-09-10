package addisnal_work;
import java.util.Scanner;
public class User_input_table {
   
   
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
 
        System.out.println("enter no which table you want :-");
 
  int n = obj.nextInt();
    System.out.println("Your result is:-");
       
    for(int i = 1;i<=10;i++){
   
           System.out.println(n*i);
            
        }
       
        }
    }

