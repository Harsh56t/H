package OOPS.Inheritance;
  class Vehicle{
    String name;
    public Vehicle(String name){
        this.name =name;
    }
    public void Start(){
        System.out.println(name+"is Starting");
    }
  }
    class car extends Vehicle{
        int speed;
     public  car(String name,int speed){
         super(name);
         this.speed =speed;
        }
        public void Asslirate(){
            System.out.println(name+"is asslirate at"+speed+"km/h");
        }
    }
    class Bike extends Vehicle{
        String color;
        public Bike(String name,String color){
            super(name);
            this.color=color;
        }
        public void brack(){
            System.out.println(name+" is braking with "+color+"brakes");
        }
    }
  public class herrarical_inheritance {
    public static void main(String[] args) {
        car Car =new car("Tesla", 500);
        Bike bike = new Bike("KTM", "BLUE");
        // Car.Start();
        Car.Asslirate();
        // bike.Start();
        bike.brack();
    }
}
