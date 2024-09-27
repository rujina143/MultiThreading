package multithread;

public class testttttttt {

        public static void main(String[] args) {
            mythread t11=new mythread();
            Thread t22=new Thread(t11);
            t22.start();


        }
    }
    class mythread extends AAAA implements Runnable {
        public void run(){
            for(int i=0;i<10;i++){
                System.out.println("1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    class AAAA{

    }

