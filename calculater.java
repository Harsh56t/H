package pattern;
import java.util.Scanner;
public class cand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to subtract");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");
         System.out.println("Enter 5 to remender");
        System.out.println("Enter 6 to find area of circle");
        System.out.println("Enter 7 to find area of triangle");
        System.out.println("Enter 8 to find area of rectangle");
        System.out.println("Enter 9 to find area of squre");
        System.out.println("Enter 10 to find perimeter of rectangle");
        System.out.println("Enter 11 to find perimeter of squre ");
        System.out.println("Enter 12 to find perimeter of circle");
        System.out.println("Enter 13 to find perimeter of triangle");
        System.out.println("Enter 14 to find area of trapezium");
         System.out.println("Enter 15 to find perimeter of trapezium");
        int choice=sc.nextInt();
        switch (choice)
          { case 1:
                            
             System.out.println("Enter 1st no");
             int ha=sc.nextInt();
             System.out.println("Enter 2nd no.");
            int rs=sc.nextInt();
              int ht=ha+rs;
            System.out.println("answer is "+ht);
               break;
              case 2:
                            
             System.out.println("Enter 1st no");
             int tr=sc.nextInt();
             System.out.println("Enter 2nd no.");
            int ip=sc.nextInt();
              int at=tr+ip;
            System.out.println("answer is "+at);
               break;
              case 3:
                            
             System.out.println("Enter 1st no");
             int th=sc.nextInt();
             System.out.println("Enter 2nd no.");
            int hi=sc.nextInt();
              int pra=th*hi;
            System.out.println("answer is "+pra);
               break;   
          case 4:
                            
             System.out.println("Enter 1st no");
             int ach=sc.nextInt();
             System.out.println("Enter 2nd no.");
            int chi=sc.nextInt();
              int ti=ach/chi;
            System.out.println("answer is "+ti);
               break;
               case 5:
                            
             System.out.println("Enter 1st no");
             int br=sc.nextInt();
             System.out.println("Enter 2nd no.");
            int  ra=sc.nextInt();
              int bro=br%ra;
            System.out.println("answer is "+bro);
               break;

            case 6:
         double pr =3.14;
          System.out.println("Enter radius of circle");
        int p=sc.nextInt();
        double q= pr* p*2;
        System.out.println("answer is"+q);
        break;
             case 7:
                            
             System.out.println("Enter height");
             int r=sc.nextInt();
             System.out.println("Enter base");
            int s=sc.nextInt();
              int t=r*s/2;
            System.out.println("answer is "+t);
               break;
               case 8:
                               
             System.out.println("Enter length");
             int a=sc.nextInt();
             System.out.println("Enter breth");
            int b=sc.nextInt();
            int c= a*b;
            System.out.println("your result is "+c);
            break;
           case 9:
                               
             System.out.println("Enter side");
             int e=sc.nextInt();
            int g= e*e;
            System.out.println("your result is "+g);
            break;
             case 10:
                               
             System.out.println("Enter length");
             int d=sc.nextInt();
             System.out.println("Enter breth");
            int h=sc.nextInt();
            int f=2* d*h;
            System.out.println("your result is "+f);
            break;
             case 11:
                               
             System.out.println("Enter side");
             int i=sc.nextInt();
            int j= 4*i;
            System.out.println("your result is "+j);
            break;
            case 12:
         double k =3.14;
          System.out.println("Enter radius of circle");
        int l=sc.nextInt();
        double m= 2*k* l;
        System.out.println("answer is"+m);
        break;
             case 13:
                            
             System.out.println("Enter height");
             int o=sc.nextInt();
             System.out.println("Enter base");
            int n=sc.nextInt();
            System.out.println("Enter length");
            int po=sc.nextInt();
              int hr=o*n*po;
            System.out.println("answer is "+hr);
               break;
               case 14:
                            
             System.out.println("Enter height");
             int of=sc.nextInt();
             System.out.println("Enter 1st breth");
            int nr=sc.nextInt();
            System.out.println("Enter 2nd breth");
            int pro=sc.nextInt();
              int hac=nr+pro*of/2;
            System.out.println("answer is "+ hac);
               break;
               case 15:
                            
             System.out.println("Enter 1st length");
             int off=sc.nextInt();
             System.out.println("Enter 2nd length");
             int on=sc.nextInt();
             System.out.println("Enter 1st breth");
            int nn=sc.nextInt();
            System.out.println("Enter 2nd breth");
            int pp=sc.nextInt();
              int hp=off+on+nn+pp;
            System.out.println("answer is "+ hp);
               break;
            }

        }


    }
    

    

