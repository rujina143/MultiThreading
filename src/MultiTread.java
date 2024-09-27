public class MultiTread {
    public static void main(String[] args) throws InterruptedException{
        A obj=new A();
        obj.start();
        for(int i=0;i<10;i++) {
            System.out.println(2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
