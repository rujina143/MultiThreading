public class htttttp {
    public static void main(String[] args) {
       /** ethu e1=new ethu();
        //e1.start();
       // System.out.println(e1.isAlive());
        e1.setDaemon(true);//true pass korle deaemon thread mane main thread sesh houar sathei sesh false pass korle user thread
        e1.start();
        System.out.println("Main thread ended and x= "+ e1.x);


    }
}
class ethu extends Thread{
    int x;
    public void run(){
        for(int i=0;i<100000;i++){
            x++;
        }
        System.out.println("My thread ended and x = "+ x);

    }
}**/
Thread rp =new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("Dipta");
    }
});
rp.start();

    }
}




