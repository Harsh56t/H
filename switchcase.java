package basic;
import java.util.Scanner;
public class swit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add ");
        System.out.println("Enter 2 no subtract ");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide ");
        System.out.println("Enetr 5 to get remainder");
        int choice=sc.nextInt();
        switch (choice)
        {case 1:
            System.out.println("enter the 1st no.");
            int a = sc.nextInt();
            System.out.println("enter the 2nd no.");
            int b = sc.nextInt();
            int c = a+b;
            System.out.println("answer is " +  c);
            break;
            case 2:
                System.out.println("enter the 1st no.");
                int d = sc.nextInt();
                System.out.println("enter the 2nd no.");
                int e = sc.nextInt();
                int f = d-e;
                System.out.println("answer is" + f);
                break;
                case 3:
                    System.out.println("enter the 1st no.");
                    int g = sc.nextInt();
                    System.out.println("enter the 2nd no.");
                    int h = sc.nextInt();
                    int i = g*h;
                    System.out.println("answer is" + i);
                    break;
                    case 4:
                        System.out.println("enter the 1st no.");
                        int j = sc.nextInt();
                        System.out.println("enter the 2nd no.");
                        int k = sc.nextInt();
                        int l = j/k;
                        System.out.println("answer is" + l);
                        break;
                        case 5:
                            System.out.println("enter the 1st no.");
                            int m = sc.nextInt();
                            System.out.println("enter the 2nd no.");
                            int n = sc.nextInt();
                            int o = m%n;
                            System.out.println("answer is" + o);
                            break;
        }
                        

    }
    
}
