package addisnal_work;
import java.util.Scanner;
public class Digit_rec {
    static int Dsum(int n){
        if (n>=1&&n<=9){
            return n;
        }
        return Dsum(n/10)+(n%10);
    }
    public static void main(String[] args) {
        
    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. which you want to add :- ");
        int pra = sc.nextInt();
        System.out.println("Your answer is :- ");
        System.out.println(Dsum(pra));
}
}
