package question_of_recorgen;
//Question no. 2
public class Digitsum {
    static int Dsum(int n){
        if (n>=1&&n<=9){
            return n;
        }
        return Dsum(n/10)+(n%10);
    }
    public static void main(String[] args) {
        System.out.println("Result of 1+2+3+4");
        System.out.println(Dsum(1234));
        //1+2+3+4
         System.out.println("Result of 6+5+4+3+4");
        System.out.println(Dsum(6543));
        //6+5+4+3
         System.out.println("Result of 8+9+8+9+8+9");
        System.out.println(Dsum(898989));
       System.out.println("Result of 1+1+2+2+3+3+4+4");
       System.out.println(Dsum(11223344));
       System.out.println("Result of 1432");
       System.out.println(Dsum(1432));

    }
}
