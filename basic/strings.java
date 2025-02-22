import java.util.*;

public class strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // ------ strings are immutable ------ //


        // System.out.println("Enter Your Name");
        // String name = sc.nextLine(); // print full name with including space - vaibhav katariya - Your name is - vaibhav katariya
        // System.out.println("Your name is - " + name);


        // System.out.println("Enter Your Name");
        // String name = sc.next(); // print name - vaibhav katariya - Your name is - vaibhav
        // System.out.println("Your name is - " + name);


        // concatenation - join two strings 
        // String firstName = "vaibhav";
        // String lastName = "katariya";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);


        // charAt method - print one letter in only one line
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }



        // compare string - compareTo method - check three case for compare string 
        //1. str1 < str2 - return  +ve value
        //2. str1 == str2 - return 0
        //3. str1 > str2 - return -ve value 

        // String str1 = "coding";
        // String str2 = "coding";
        // if (str1.compareTo(str2) == 0) {
        //     System.out.println("both string are equal");
        // }else{
        //     System.out.println("both string are not equal");
        // }



        // why we use compareTo method instance of == in some case (==) are fail 

        // if (str1 == str2) {
        //     System.out.println("both string are equal");
        // } else {
        //     System.out.println("both string are not equal");
        // }



        // in this case we compare the string using == operator and its return else part 
        // == is an operator that returns true if the contents being compared refer to the same memory or false if they don't. If two strings compared with == refer to the same string memory, the return value is true; if not, it is false.


        // if (new String("coding") == new String("coding")) {
        //     System.out.println("both string are  equal");
        // } else {
        //     System.out.println("both string are not equal");
        // }



        // substring(begin index , ending index)
        // String name = "my name is vaibhav";
        // String subString = name.substring(11, name.length());
        // System.out.println(subString); // vaibhav



        // // ParseInt Method of Integer class 
        // String str = "123";
        // int num = Integer.parseInt(str);
        // System.out.println(num); // 123
    }
}