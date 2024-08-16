class Persion{
    int age;
    String name;
    
    // constructor for Persion class
    Persion(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    // method to display details
    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}

class Student extends Persion{
    String grade;
    
    // constructor for Student class
    Student(int age, String name, String grade){
        super(age, name); // calling constructor of parent class
        this.grade = grade;
    }

    // method to display student details
    void displayStudentDetails(){
        display(); // calling method of parent class
        System.out.println("Grade: " + grade);
    }
}

class Student2 extends Persion{
    String grade;
    
    // constructor for Student2 class
    Student2(int age, String name, String grade){
        super(age, name); // calling constructor of parent class
        this.grade = grade;
    }
    
    // method to display student details
    void displayStudentDetails(){
        display(); // calling method of parent class
        System.out.println("Grade: " + grade);
    }
}

public class inheritance{
    public static void main(String[] args) {
        Persion p = new Persion(19, "vaibhav");
        Student s = new Student(19, "vaibhav", "A");
        Student2 s2 = new Student2(19, "vivek", "B");
        p.display();
        s.displayStudentDetails();
        s2.displayStudentDetails();

    }
}