package question_of_recorgen;

public class power {
    
        static int pow(int p, int q){
          if(q==0) return 1;
             return pow(p,q-1)*p;
        }
        public static void main(String[] args) {
          System.out.println(pow(5,7));
        }
      }
       

