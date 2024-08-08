public class recursion{
    
    public static void print5to1(int count){
        if (count == 0) return;
        System.out.println(count);
        print5to1(count - 1);
    }

    public static void print1to5(int count){
        if (count == 6) return;
        System.out.println(count);
        print1to5(count + 1);
    }

    public static void printSum(int i , int n, int sum){
        if (i == n) {
            sum += i;
            System.out.println("Sum:" + sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }
    

    public static int findFacto(int n){
        if (n == 1) return 1;
        return n * findFacto(n - 1);
    }

    public static void printFibo(int a, int b, int n){
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        int temp = a + b;
        a = b;
        b = temp;
        printFibo(a, b, n - 1);
    }

    public static void main(String[] args) {
        // print5to1(5);
        // print1to5(1);
        // printSum(1 , 5 , 0);

        // int n = 5;
        // System.out.println("Factorial of " + n + " is: " + findFacto(n));
        // printFibo(0, 1, 5);


        
    }
}