import java.util.*;

public class string_builder {
    public static void main(String[] args){   
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        // char at 
        // System.out.println(sb.charAt(0));
        
        // append
        // sb.append(" world");
        // System.out.println(sb);

        // set char at 
        // sb.setCharAt(0, 'H');
        // System.out.println(sb);

        // insert
        // sb.insert(11, "!");
        // System.out.println(sb);

        // delete
        // sb.delete(11, 12);
        // System.out.println(sb);
        
        // reverse
        // sb.reverse();
        // System.out.println(sb);


        // reverse
        // for(int i = 0; i < sb.length()/2; i++){
        //     int front = i;
        //     int back = sb.length() - 1 - i; // 5 - 1 - 0 = 4

        //     int frontChar = sb.charAt(front);
        //     int backChar = sb.charAt(back);
            
        //     sb.setCharAt(front, (char) backChar);
        //     sb.setCharAt(back, (char) frontChar);
        // }
        // System.out.println(sb);
        
        
        //substring
        // System.out.println(sb.substring(1, 4));
        
        // compare
        // StringBuilder sb2 = new StringBuilder("Hello world");
        // System.out.println(sb.compareTo(sb2));
        
        // capacity
        // System.out.println(sb.capacity());
        
        // length
        // System.out.println(sb.length());
        
        // ensure capacity
        // sb.ensureCapacity(100);
        // System.out.println(sb.capacity());
        
        // trimToSize
        // sb.trimToSize();
        // System.out.println(sb.length());


    }
}
 