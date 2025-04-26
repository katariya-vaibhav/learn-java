public class exception {
    
    class myException extends Exception{
        String str;
        myException(String str1){
            this.str = str1;
        }
        public String toString(){
            return this.str.toLowerCase();
        }
    }
    
    public static void main(String[] args) {
        try {
            exception outer = new exception();
            throw outer. new myException("demo");
        } catch (myException e) {
            System.out.println(e);
        }
    }
}
