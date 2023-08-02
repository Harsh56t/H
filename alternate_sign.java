package question_of_recorgen;
//question 4
public class alternate_sign {
    static int sum(int n){
    //1+2-3+4-5+6-7+8-9\\
    if(n==3){
        return 0;
    }
    else if (n==2)
    return n+1;
    else  
    return n;
    }
    public static void main(String[] args) {
        System.out.println(sum(2));
        System.out.println(sum(3));
    }
}
