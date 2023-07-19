
    import java.util.Stack;
     public class stack {

    public static void main(String[] args) {
        //placing of value at given index
        Stack<Integer> ro=new Stack<>();
           ro.push(3);
            ro.push(5);
             ro.push(7); 
             ro.push(9);
              ro.push(11);
              System.out.println("result is:-");
              System.out.println(ro);
              int idx =3;
              int x =12;
              int y =13;
              int z =14;
              Stack<Integer> op=new Stack<>();
              while(ro.size()>=idx){
                 op.push(ro.pop());
              }
              ro.push(x);
              ro.push(y);
              ro.push(z);
             while(op.size()>0){
                ro.push(op.pop());
             }
             System.out.println(ro);
            
    }

}
//writ a java pragram revers all element of stack ?
//insert a value at the last place of the stack ?

