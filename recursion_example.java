public class recursion_example {
    public static void towerOfHanoi(int n, String src, String helper, String destination) {
        if (n == 1) {
            System.out.println("disk transformation " + src + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, src, destination, helper);
        System.out.println("disk transformation " + src + " to " + destination);
        towerOfHanoi(n - 1, helper, src, destination);
    }

    public static void reverseString(String str, int idx) {

        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        reverseString(str, idx - 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOccurrences(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentElement = str.charAt(idx);
        if (currentElement == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurrences(str, idx + 1, currentElement);
    }

    public static boolean isArraySorted(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            return isArraySorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void moveStringElement(String str, int idx, String newString, int count, char element) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += element;
            }
            System.out.println(newString);
            return;
        }

        char currentElement = str.charAt(idx);
        if (currentElement == element) {
            count++;
            moveStringElement(str, idx + 1, newString, count, currentElement);
        } else {
            newString += currentElement;
            moveStringElement(str, idx + 1, newString, count, element);
        }
    }


    public static void subsequences(String str, int idx , String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char c = str.charAt(idx);
        subsequences(str, idx+1, newString+c);
        subsequences(str, idx+1, newString);
        
    }


    public static void printPermutation(String str , String permutation){

        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, permutation + c);
        }
    }


    public static int printPath(int i , int j , int n , int m){
        if(i == n || j == m){
            return 0;
        }

        if (i == n-1 && j == m-1){
            return 1;
        }

        int downPaths = printPath(i+1, j, n, m);
        int rightPaths = printPath(i, j+1, n, m);

        return downPaths + rightPaths;
    }


    public static int placeTiles(int n , int m ){

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }

        int vertices = placeTiles(n-m, m);
        int horizontal = placeTiles(n-1 , m);

        return vertices + horizontal;

    }


    public static int calculateGuest(int n){
        if (n <= 1) {
            return 1;
        }

        // single 
        int single = calculateGuest(n-1);

        // pair
        int pair =  (n-1) * calculateGuest(n-2);

        return single + pair;
    }
    public static void main(String[] args) {
        // towerOfHanoi(3, "S", "H", "D");


        // String str = "Hello World";


        // reverseString(str, str.length()-1);


        // findOccurrences("aabsddassac", 0, 'a');


        // int arr[] = { 1 ,2,3};
        // System.out.println(isArraySorted(arr, 0));


        // moveStringElement("helllloword", 0, "", 0, 'l');


        // subsequences("abc", 0, "");


        // printPermutation("ABC", "");


        // int totalPaths = printPath(0, 0, 3, 3);
        // System.out.println(totalPaths);


        // System.out.println(placeTiles(4, 2));


        // System.out.println(calculateGuest(3));


        
    }
}