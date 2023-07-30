package recorgen;


public class sum {
    
       //recorgen work
        static int develop(int n){
            if(n==0){
                return n;
        }
        return n +develop(n-1);
        //recorsiv work
    }
    public static void main(String[] args) {
            System.out.println(develop(5));
    }
}
