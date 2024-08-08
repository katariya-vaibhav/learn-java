public class recursion{
    
    public static void print5to1(int count){
        if (count == 0) return;
        System.out.println(count);
        print5to1(count - 1);
    }
    
    public static void main(String[] args) {
        print5to1(5);
    }
}