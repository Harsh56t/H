package Queue;

public class queue_linkedlist {
  public static class node{
    int data;
    node link;
    node(int data){
        this.data =data;
    }
  }
  public static class str {
      node head = null;
      node tail = null;
      int size = 0;
   
  public void add(int x){
    node n = new node(x);
    if (size ==0){
        head = tail =n;
    }
    else{
        tail.link=n;
        tail = n;
    }
    size++;
  }
  public int remove(){
    int z = head.data;
    head = head.link;
    size--;
    return z;
  }
 public int peek(){
    if (size==0){
      System.out.println("No element found");
    }
    return head.data;
  }
   public void display(){
    node temp =head;
    while (temp!=null){
      System.out.println(temp.data);
      temp =temp.link;
    }
     
   }

}
   public static void main(String[] args) {
    str sc=new str();
    sc.add(2);
    sc.add(3);
    sc.add(4);
    sc.add(5);
    sc.display();
    System.out.println("size of linkedlist is:-"+sc.size);
   }
   }

// pointer node:- when a node having a address of any outher node as the refrence node is called pointer node...
// ex:- head , tail...
// next study :-
//sating
// back trackin 

