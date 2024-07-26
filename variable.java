public class variable {
    public static void main(String[] args){
        double pi = 3.14; // logn 
        float pointNumber = 12.12f; // stores floating point numbers, with decimals, such as 19.99 or -19.99 
        System.out.println(pointNumber);
        System.out.println(pi);
        
        int a = 10; // stores integers (whole numbers), without decimals, such as 123 or -123
        int b = 20;
        int c = a + b;
        System.out.println("The sum of a and b is " + c);


        String name = "vaibhav";
        System.out.println(name);

        
        final int fixInt = 10;
        //fixInt = 20; will generate an error: cannot assign a value to a final variable 
        System.out.println(fixInt);

        final String surname = "katariya";
        // surname = "kumar"; will generate an error: cannot assign a value to a final
        System.out.println(surname);
    }
}
