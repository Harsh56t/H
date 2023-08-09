package Stack;

public class  array_stack{
    public static class Stack{
           int []arr=new int[5];
           int idx = 0;

           void push 
           (int x){
             arr[idx] =x;
             idx++;
           }
           
           int peek(){
             if (idx==0){
                 System.out.println("Stack is empety");
                 return - 1;
             }
              else{
              return arr[idx-1];
             }
            
              }
              int pop(){
                  if (idx==0){
                 System.out.println("Stack is empety");
                 return -1;
              }
              else{
                 int top =arr[idx-1];
                 arr[idx-1]=0;
                 idx--;
                System.out.println(top);//{optional}
                 return top;}
              }
              

              void display(){
     
               for(int i=0;i<=idx-1;i++){
              System.out.print(arr[i] +" ");
     
               }
             System.out.println();

             
             } 
              int size(){
                return idx;
              }
              }
              public static void main(String[] args) {
                Stack st = new Stack();
                st.push(12);
                st.push(6);
                st.push(0);
                st.push(8);
                st.push(12);
               
                System.out.println("Size of stack is :- "+st.size());
                System.out.println("To see last no. :-"+st.peek());
                System.out.println("Delitited no. is:- ");
               st.pop();
               System.out.println("after delition result will be :- ");
               st.display();
}
}