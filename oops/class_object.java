// package oops;



// when we create a class make sure the first latter of class is capital
class Pen {


    // public - use anywhere
    // protected - use in same class and subclass
    // private - use in same class

    private String color;
    private int price;
    private String type;


    // constructor for set values
    // constructor name is always the same as the class name
    Pen(String color, int price, String type) {
        this.color = color;
        this.price = price;
        this.type = type;
    }
    // copy constructor
    Pen(Pen pen) {
        this.color = pen.color;
        this.price = pen.price;
        this.type = pen.type;
    }


    // display method use for display all values
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }

    // getter and setter method for color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}


public class class_object {

    public static void main(String[] args) {
        
        // create object
        Pen pen1 = new Pen("black", 100, "simple");
        pen1.display();
        
        // create copy of object
        Pen pen2 = new Pen(pen1);
        pen2.display();
        
        // change color
        // pen1.setColor("red");
        // pen1.display();

        // // get pen color
        // System.out.println("Pen color: " + pen1.getColor());
        
    }
}