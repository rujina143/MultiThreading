public class Test {
    public static void main(String[] args) {
        mythread t1 = new mythread();  // Create an instance of mythread
        Thread t2 = new Thread(t1);    // Pass t1 (Runnable) to the Thread constructor
        t2.start();                    // Start the thread
    }
}

class mythread extends AAAA implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class AAAA {
    // Base class AAAA with no specific functionality
}
