package Queue;


class queuearray{
    public static class queue_str{
    int f=-1;
    int r = -1;
    int size = 0;
    int arr[]= new int [6];
    public  void add (int x){
        if (r==arr.length-1){
        System.out.println("Queue is full ");
        return;}
       if (r==-1){
        f=r=0;
       arr[f]=x;
    }
      else {
       arr[r+1]=x;
        r++;
      }
      size++;
    }
    public void display(){

        for(int i=f;i<=r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int remove(){
        if (size ==-1){
     System.out.println("queue is empty");
      return 0;
        }
       int x =arr[f];
       f++;
       size--;
       return x;}
       // peek work 
       public int peek(){
        System.out.println(arr[f]);
        return arr[f];
       }
       // size 
    public int size(){
        return size;
    }
    
    }
    public static void main(String[] args) {
        
   queue_str str = new queue_str();
   str.add(6);
   str.add(11);
   str.add(4);
   str.add(2);
   str.add(3);
   System.out.println("peeked array no. is :-");
   str.peek();
   System.out.println("added no in array is :-");
   str.display(); // {6,11,4}, {6}, {3}, {11,4}
   System.out.println("your array size is :-");
    System.out.println(str.size()); 
    System.out.println("after remove result of array is :-");
    str.remove();
    str.display();
}
}