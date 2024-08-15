package oops;

class pen {
    private String color;
    private int price;
    private String type;

    pen(String color, int price, String type) {
        this.color = color;
        this.price = price;
        this.type = type;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }

}

public class class_object {

    public static void main(String[] args) {
        pen pen1 = new pen("black", 100, "simple");
        pen1.display();
    }
}