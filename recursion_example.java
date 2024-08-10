public class recursion_example{
    public static void towerOfHanoi(int n , String src ,String helper , String destination){
        if (n == 1) {
            System.out.println("disk transformation " + src + " to "+ destination);
            return;
        }
        towerOfHanoi(n-1, src ,destination, helper);
        System.out.println("disk transformation " + src + " to "+ destination);
        towerOfHanoi(n-1, helper, src, destination);
    }

    public static void reverseString(String str , int idx){

        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        reverseString(str, idx-1);
    }
    public static void main(String[] args) {
        // towerOfHanoi(3, "S", "H", "D");
        // String str = "Hello World";
        // reverseString(str, str.length()-1);
    }
}