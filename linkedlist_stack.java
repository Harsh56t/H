package pattern;

public class linkedlist_stack {
   
        public static class node{
            int data ;
            node next;
            node(int data){
                this.data=data;
            }
        }
        public static class llstack{
            node head = null;
            int size = 0;
            void push(int x){
                node temp = new node(x);
                temp.next =head;
                head = temp;
            }
        
                int size(){
                    return size;
                }
                int pop(){
                 if(head == null){
                  System.out.println("Stack is empty");
                  return-1;  
                 }
                
                    int x = head.data;
                    head=head.next;
                 
                 return x;
                }
                void display(){
                    node current = head;
                    while(current!=null){
                        System.out.println(current.data+":-");
                        current=current.next;

                    }
                    System.out.println("Their is no node after that");
                    System.out.println("none");
                }
    
                }
                public static void main(String[] args) {
                   llstack ram =new llstack();
                 ram.push(5);
                 ram.push(0);
                ram.push(4);
                 ram.push(9);
                ram.push(8);
                ram.push(55);
                ram.pop();
                ram.display();

                  }
        }