import java.util.*;
public class bit_manipulation {
    public static void main(String[] args) {

        // get bit

        // bitMask = 1<<i
        // operation = AND

        // int n = 5; // 0101
        // int pos = 3;
        // int bitMask = 1<<pos;
        // if ((bitMask & n) == 0) {
        // System.out.println("bit is zero");
        // }else{
        // System.out.println("bit is non zero");
        // }

        // --------------------------------------------------

        // set bit
        // bitMask = 1<<i;
        // operation = OR
        // int n = 5; // 0101
        // int pos = 1;
        // int bitMask = 1<<pos;
        
        // int newNumber  = bitMask | n;
        // System.out.println(newNumber); // 7 0111


        // ---------------------------------------------------

        // clear bit
        // bitMask = 1<<i;
        // operation = AND WITH NOT

        // int n = 5; // 0101
        // int pos = 2;
        // int bitMask = 1<<pos; // 0001<<2 = 0100
        // int notBitMask = ~(bitMask); // 1011
        // int clearNo = notBitMask & n; // 1011 & 0101 =  0001
        // System.out.println(clearNo); // 1


        //----------------------------------------------------------

        // update bit
        // Scanner sc = new Scanner(System.in);
        // int operation = sc.nextInt();
        // if operation == 1 - set - update 0 to 1
        // if operation == 0 - clear - update 1 to 0

        // int n = 5; 
        // int pos = 1;
        // int bitMask = 1<<pos;

        // if (operation == 1 ) {
        //     // set bit
        //     int newNumber = bitMask | n;
        //     System.out.println(newNumber);
        // } else {
        //     int newBitMask = ~(bitMask); 
        //     int newNumber = newBitMask & n;
        //     System.out.println(newNumber);
        // }


        
    }
}