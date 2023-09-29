package OOPS;

// A constrector in java speceal methord that is used to initialize object of a class it has the same name as the the class
// and dose nat hava any return type it call automatacly called whwn we creat objeact
public class Contructer {
  // there are 2 type of constructer
  // 1. defolt
  // 2. perameterised

  Contructer() {
    System.out.println("I am defalt Constructor");
  }

  Contructer(String name) {
    System.out.println("i am perameterised constructor " + name);
  }

  public static void main(String[] args) {
    Contructer obj = new Contructer();
    Contructer obj1 = new Contructer("harsh");
  }
}
