package Car;

public class Car {
    //Attribute
     private String name;
     private String color;
     private int size;

    // Constructor
    public Car(){
        this.name = "Default";
        this.color = "white";
        this.size = 100;
    }
    public Car(String name, String color, int size){
        this.name = name;
        this.color = color;
        this.size = size;
    }

    //Method, Operation
    public void go(){
        System.out.println(this.name+" Car go");
    }
    public void stop(){
        System.out.println(this.name+" Car stop");
    }
}
