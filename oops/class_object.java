package oops;

class pen {


    // public - use anywhere
    // protected - use in same class and subclass
    // private - use in same class

    private String color;
    private int price;
    private String type;


    // constructor for set values
    pen(String color, int price, String type) {
        this.color = color;
        this.price = price;
        this.type = type;
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
        pen pen1 = new pen("black", 100, "simple");
        pen1.display();
        
        // change color
        pen1.setColor("red");
        pen1.display();

        // get pen color
        System.out.println("Pen color: " + pen1.getColor());
        
    }
}