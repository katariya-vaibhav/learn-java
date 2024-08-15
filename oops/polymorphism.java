package oops;

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // functions overloading
    
    void display(String name){
        System.out.println("Name: " + name);
    }

    void display(int age){
        System.out.println("Age: " + age);
    }
    
    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



public class polymorphism {
    public static void main(String[] args) {
        Student s = new Student("vaibhav" , 19);
        s.display("vaibhav");
        s.display(19);
        s.display();  // method overloading
    }
}
