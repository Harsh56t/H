package Queue;
import java.util.*;



public class queue_1 {
    public static void main(String[] args) {
        Queue<Integer> qu =new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);
        // to see result
        System.out.println(qu);
        //to chequ the size 
       System.out.println(qu.size());
        //To see the first element
        // peek 
        System.out.println(qu.remove());
        // To remove 1st no.
        qu.poll();
        System.out.println(qu);
         // To see 1st element...
         System.out.println(qu.element());
         // it work like bolean...
         System.out.println(qu.isEmpty());

    }
}
