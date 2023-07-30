package recorgen;

public class w1 {
    //It is a special type of function in which function calles it self.
    //it is a special algorithum which reduses the time and space complaxcity of the program.
    //que :- Write a java program  to find a Factorial 5 or 5!
        // ex:- 5! = 5x4x3x2x1 
        // ex:  n! = n*(n-1)*(n-2)*(n-3)*(n-4)*(n-5)
         //self work
        //1!=1
        //0!=1
       
            
        
       static int Factorial(int n){
         if (n==0){
            return 1;
        }
        else{
            int smallanswer = Factorial(n-1);
            int answer =n*smallanswer;
            return answer;
        }


       }
       public static void main(String[] args) {
        System.out.println(Factorial(66));
       
 }
    }
//Write a java program using recorson to find the sum of 1st n natural no. ?

