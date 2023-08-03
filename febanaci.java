package question_of_recorgen;
import java.util.Scanner;
//Question no. 1 
public class febanaci {
    static int fibonnaci(int x){
        //0 1 1 2 3 5 8 13 21 34  55 89 144 233 377 610
        //0 1 2 3 4 5 6 7  8   9  10 11 12  13  14  15
        if (x==0||x==1){
           return x;
        }
        return fibonnaci(x-1)+ fibonnaci(x-2);
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonnaci no you want:-");
        int ha=sc.nextInt();
        System.out.println("your answer is:-");
        System.out.println(fibonnaci(ha));
        
    }
}
