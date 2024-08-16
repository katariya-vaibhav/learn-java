// abstract class Car{
//     abstract void run();
// }

// class BMW extends Car{
//     public void run(){
//         System.out.println("Vehicle is running");
//     }
// }


interface Car {
    public void run(); // abstract method
}

class BMW implements Car {
    public void run(){
        System.out.println("Vehicle is running");
    } 
}

public class abstraction {
    public static void main(String[] args){
        // BMW carBmw = new BMW();
        // carBmw.run();  // abstract method implementation in child class
        
        Car carBmw = new BMW();
        carBmw.run();  // interface method implementation in child class
    }
}
 