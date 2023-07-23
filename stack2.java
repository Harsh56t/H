 import java.util.Stack;
 public class stack2
  {
public static void main(String[] args){ 
 Stack<Integer> st=new Stack<>();
st.push(1);

st.push(2);

st.push(3);

st.push(4);

System.out.println("result is:-"); System.out.println(st);

//see last no.

System.out.println("last no is:- ");

System.out.println(st.peek());

//to see 1st item

while(st.size()>1) {

st.pop();

System.out.println("1st item is:-");

System.out.println(st.peek());
}

// deleat 1

st.pop();

System.out.println("deleted no is :-"); System.out.println(st);

//length of stack

System.out.println( "result of stack is");

System.out.println(st.size());

//see last no.

System.out.println("last no is:- ");

System.out.println(st.peek());

//to see 1st item

while(st.size()>1) {

st.pop();

System.out.println("1st item is:-");

System.out.println(st.peek());

}
}
  }

