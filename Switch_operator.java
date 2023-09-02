package addisnal_work;
    import java.util.Scanner;
public class Switch_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to to see functioning of Arthmatic oppeater");
        System.out.println("Enter 2 to to see functioning of Relatnal oppeater");
        System.out.println("Enter 3 to see functioning of Logical opprater");
        System.out.println("Enter 4 to see functioning of Dicriment opprater");
        System.out.println("Enter 5 to see functioning of Incriment opprater");
        int choice=sc.nextInt();
        switch (choice)
          { case 1:  
            System.out.println("      "); 
            System.out.println("i. Arthmatic oppraters");
            System.out.println("      ");
            System.out.println("Add");
            int a=2;
            int b=3;
            System.out.println(a+b);
            System.out.println("      ");
            System.out.println("Subtract");
            int c=12;
            int d=3;
            System.out.println(c-d);
            System.out.println("      ");
            System.out.println("Multiply");
            int e=2;
            int f=3;
            System.out.println(e*f);
            System.out.println("      ");
            System.out.println("remneder");
            int g=11;
            int h=3;
            System.out.println(g%h);
            System.out.println("      ");
            System.out.println("Divide");
            int i=12;
            int j=3;
            System.out.println(i/j);
      
            break; 
            case 2:
            System.out.println("      ");
            System.out.println("ii. relatinal opprater");
            System.out.println("      ");
            System.out.println("grater or equals to..");
            int k=12;
            int l=10;
            boolean m= k>=l;
            System.out.println("result  "+m);
            System.out.println("      ");
            System.out.println("less or equals to..");
            int n=12;
            int o=10;
            boolean p= n<=o;
            System.out.println("result  "+p);
            System.out.println("      ");
            System.out.println("not equals to..");
            int q=12;
            int r=10;
            boolean s= q!=r;
            System.out.println("result  "+s);
            System.out.println(" ");
            break;
            case 3:
            System.out.println("      ");
            System.out.println("iii. logical opprater");
            System.out.println("      ");
            System.out.println("and & opprater");
            int t=12;
            int u=13;
            int v=22;
            int w=23;
            System.out.println(t>u&&v<w);
            System.out.println("      ");
             System.out.println("or opprater");
            int x=12;
            int y=13;
            int z=22;
            int pr=23;
            System.out.println(x>y||z<pr);
            System.out.println("      ");
             System.out.println("not opprater");
            int ac=12;
            int hi=13;
            int ti=22;
            int wa=23;
         System.out.println(ac>hi!=ti<wa);
         System.out.println(" ");
         break;
         case 4:
       
         System.out.println("      ");
         System.out.println("iv. dicriment opprater");
        int har=12;
        har--;
        System.out.println(har);
        System.out.println(" ");
        System.out.println("      ");
        break;
        case 5:
        System.out.println("      ");
        System.out.println("v.increment opprsater");
        int sh = 55;
        sh++;
        System.out.println(sh);
        System.out.println("      ");

    }
}
}