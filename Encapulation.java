package OOPS;

// Java program to demonstrate encapsulation

class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String Name;
    private int Roll;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String newName) {
        this.Name = newName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int newAge) {
        this.Age = newAge;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int newRoll) {
        this.Roll = newRoll;
    }

    public void display() {
        System.out.println(" name: " + getName());
        System.out.println(" age: " + getAge());
        System.out.println(" roll: " + getRoll());
    }
}

public class Encapulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // obj.Name= "harsh";
        // obj.Age = 19;
        // obj.Roll = 555;

        // All fuction is display
        obj.display();
        // System.out.println(obj.Name);

    }
}
