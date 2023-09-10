package addisnal_work;
    import java.util.Scanner;
public class Even_odd_check {
    
       
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter no between 1 to 100 to check even or odd :-");
            int n = obj.nextInt();
            if(n<=100&&n>=0){
            if(n%2==0){
                System.out.println("result is ");
                System.out.println("even");
            }
                else{
                    System.out.println("result is:-");
                  System.out.println("odd");
                }
            }
        }
    } 

