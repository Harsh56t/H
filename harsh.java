import java.util.Scanner;
class car{
    String name;
    int height;
    String model;
    String color;
    int seats;
    int ts;
    int power;

}
public class normal{
    public static void main(String[] args) {
        normal thar = new normal();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter car name" );
         String name = obj.next();
         System.out.println("enter height");
         int height = obj.nextInt();
         System.out.println("enter model");
         String model = obj.next();
         System.out.println("enter color");
         String color = obj.next();
         System.out.println("enter seats");
         int seats = obj.nextInt();
         System.out.println("enter top speed");
         int ts = obj.nextInt();
         System.out.println("enter power");
         int power = obj.nextInt();

         System.out.println(" car details");
         System.out.println( " car name :- " + name);
         System.out.println( "  car  height :- " + height);
         System.out.println( "car model :- " + model);
         System.out.println(" car color :- " + color);
         System.out.println("car seats :- " + seats);
         System.out.println( "  car top speed :- " + ts);
         System.out.println("engine horsh power :- " +power);
  
    }
}