
public class demo {

    class thread extends Thread {
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("run " + ": " + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        demo outer = new demo();
        thread t1 = outer.new thread();
        t1.start();
        System.out.println("Thread is alive: " + t1.isAlive());  
    }
}
