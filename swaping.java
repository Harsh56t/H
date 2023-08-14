package Sortting;
// when we do a sartain no. of eitration and in ever eitration we compair adjesent elements and 
//swape if ther are not in correct odre
public class swaping {
    //In assending order 
    // EX:-{3,9,5,1,7} 
    //result:- {1,3,5,7,9}
   static void swap(int x,int y,int z){
         // swaping of 3 no. code       
    int temp =y;
            y=x;
            x=temp;
System.out.println(x+" "+y+" "+z);
        }
    public static void main(String[] args) {
        swap(5,9,10);
        swap(11, 12, 14);
        swap(23, 24, 22);
        //           OR
       /*  static void swap(int x,int y){
         // swaping of 2 no. code       
    int temp =y;
            y=x;
            x=temp;
System.out.println(x+" "+y);
        }
    public static void main(String[] args) {
        swap(5,9,10);
        swap(11, 12);
        swap(23, 24);
       }*/
}
}
