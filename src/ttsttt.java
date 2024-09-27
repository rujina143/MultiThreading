public class ttsttt
{
    public static void main(String[] args) throws InterruptedException {
        Papon t1=new Papon();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.x);
    }
}
class  Papon extends Thread{
    int x;
public void run(){
    for(int i=0;i<100000;i++){
        x++;
    }
}
}
