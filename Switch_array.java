package addisnal_work;

import java.util.Scanner;

public class Swich_array {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter 1 to see  Array of intiger");
   System.out.println("Enter 2 to see String based array");
   System.out.println("Enter 3 to see  Mullty dimensnal array");
   System.out.println("Enter 4 to see Jagged array");
   int choice=sc.nextInt();
   switch (choice)
   {    case 1:
    System.out.println("Array");
    System.out.println("1. Array of intiger");
    int a[]={1,2,3,4,5};
    for(int b=0; b< a.length;b++){
        System.out.print(" "+a[b]);
    }
    break;
    case 2:
     System.out.println("2. string based array");
    System.out.println("a. Uppercase");
    String c= "harsh";
    System.out.println(c.toUpperCase());
    System.out.println("a. lowercase");
    String d= "HARSH";
    System.out.println(d.toLowerCase());
      break;
      case 3:
      System.out.println("3. Mullty dimensnal array");
      int [][]e= {{1,3,4},{2,4,6,8},{3,6,9}};
      System.out.println(e[2][1]);
      break;
      case 4:
      System.out.println("4. jagged array");
      int [][]f= {{1,3,4},{2,4,6,8}};
     for(int g[]:f){
      for(int h:g){
      System.out.print(h+" ");
      }
      System.out.println(" ");
    }
        
}
}
}
